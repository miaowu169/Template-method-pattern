package com.game.domain;
/*
 * Ӣ�ۺ�����
 */
public class HouYi extends Hero {
    //��д���췽��
    public HouYi() {
        super.setHeroName("����");
    }
    //����Ӣ�۵����ҽ���
    public void display() {
        System.out.println("���Ѱɣ���ɱʱ�̣�");

    }
    //����Ӣ�۵���ͨ����
    public void normalAttack() {
        System.out.println("xiuxiu~ �������ٻ�֮��");
    }
}