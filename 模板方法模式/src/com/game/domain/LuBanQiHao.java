package com.game.domain;

/*
 * Ӣ�ۣ�³���ߺţ�
 */
public class LuBanQiHao extends Hero {
    
    public LuBanQiHao() {
        super.setHeroName("³���ߺ�");
    }
    
    //Ӣ�۵����ҽ���
    @Override
    public void display() {
        System.out.println("³���ߺţ����̶�����");
    }

    //Ӣ�۵���ͨ����
    @Override
    public void normalAttack() {
        System.out.println("dadada~ ���������л���");
    }

}