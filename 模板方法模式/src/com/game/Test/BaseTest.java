package com.game.Test;

import com.game.domain.Base;
import com.game.domain.Hero;
import com.game.domain.HouYi;
import com.game.domain.LuBanQiHao;

/*
 * ���ز�����B
 */
public class BaseTest {
    public static void main(String[] args) {
        System.out.println("����Ӣ�ۼ��ϣ��������أ�");
        //ģ��2��Ӣ�ۣ���������
        new Thread(new Runnable() {
            public void run() {
                //1.����Ӣ�ۺ��࣬����Ӣ�۵��ι����˺�ֵ
                Hero hero = new HouYi();
                hero.setHeroHurt(100);//������100B
                //2.��ȡ���أ�Ӣ�۹�������
                Base base = Base.getBase();
                destroyBase(hero,base);
            }
        }).start(); 
        
        new Thread(new Runnable() {
            public void run() {
                //1.����Ӣ��³���ߺţ�����Ӣ�۵��ι����˺�ֵ
                Hero hero = new LuBanQiHao();
                hero.setHeroHurt(80);//������B0
                //2.��ȡ���أ�Ӣ�۹�������
                Base base = Base.getBase();
                destroyBase(hero,base);
            }
        }).start();
    }
    
    //Ӣ�۴ݻٻ��صķ���
    private static void destroyBase(Hero hero, Base base) {
        //1.��ʾ�Ǹ�Ӣ���ڹ������أ�Ӣ�۵��˺�ֵ�Ƕ���
        System.out.println("Ӣ�ۣ�"+hero.getHeroName()+",�˺�ֵ��"+hero.getHeroHurt());
        //2.��������
        //�жϻ�������ֵ>0��������ֵ>0��Ӣ�۳�������B
        while(base.getLife() > 0) {
            synchronized(base){
                
                //2.1�жϵ�ǰ���ص�״̬�Ƿ��Ѿ����ݻ�
                if(!base.isDestroy()) {
                //��û�б��ݻ�
                //�������أ�����ʣ������ֵ����
                    //���ص�ʣ������ֵ=���ص�ǰ����ֵ-Ӣ�۵Ĺ�����
                    base.setLife(base.getLife()-hero.getHeroHurt());
                    
                    //ģ�⹥�����صĺ�ʱ����
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        // TODO �Զ����ɵ� catch ��
                        e.printStackTrace();
                    }
                    //�жϻ�������ֵ>0��Ӣ�۹�������
                    if(base.getLife()>0) {
                        //�жϻ�������ֵ>0��Ӣ�۹�������
                        System.out.println("Ӣ�ۡ�"+hero.getHeroName()+"�����ڹ������أ�����ʣ������ֵ��"+base.getLife());
                    }else {
                        //�жϻ�������ֵ<0,˵�������ѱ��ݻ٣����»��ص�״̬Ϊ�ݻ٣���Ϸʤ��    
                        base.setDestroy(true);
                        System.out.println("�����ѱ���"+hero.getHeroName()+"���ݻ�,��Ϸʤ����");
                    }
                }
            }
        }
    }
}