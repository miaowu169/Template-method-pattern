package com.game.Test;

import com.game.Skill.imple.JiPao;
import com.game.Skill.imple.KuangBao;
import com.game.domain.Hero;
import com.game.domain.HouYi;
/*
 * Ӣ���뼼�ܵĲ�����
 */
public class HeroTest {
    public static void main(String[] args) {
        //1.ѡ��Ӣ��
        Hero hero = new HouYi();
        //2.Ӣ�����ҽ���
        System.out.println("Ӣ�ۣ�"+hero.getHeroName()+",���ҽ��ܣ�");
        hero.display();
        //3.��Ҹ���������������Ӣ�۵��ٻ�ʦ����
        hero.setIskill(new JiPao());//����ӿڱ�̵�����
        hero.setIskill(new KuangBao());
        //4.��Ϸ��ʼ
        System.out.println("��Ϸ��ʼ��������׼����");
        
        //5.ʹ��Ӣ�۵���ͨ����
        hero.normalAttack();
        
        //6.ʹ��Ӣ�۵��ٻ�ʦ���ܹ���
        hero.skill();
    }
}