package com.game.domain;

/*
 * ���أ������ࣩ
 */

public class Base {
    // ���췽��˽��
    private Base() {}
    //����һ��˽�о�̬�Ļ��ض��������
    private static Base base=null;
    //�ṩһ�������ľ�̬�Ĵ������ض�����ȡ���ض���ķ���
    public synchronized static Base getBase() {//ͬ��
        if(base == null) {
            base = new Base();
        }
        return base;
    }
    
    //���ص�����ֵ
    private int life = 999;
    //���صĴݻ�״̬
    private boolean destroy = false;
    
    public int getLife() {
        return life;
    }
    public void setLife(int life) {
        this.life = life;
    }
    public boolean isDestroy() {
        return destroy;
    }
    public void setDestroy(boolean destroy) {
        this.destroy = destroy;
    }
}
