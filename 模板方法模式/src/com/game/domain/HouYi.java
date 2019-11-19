package com.game.domain;
/*
 * 英雄后羿类
 */
public class HouYi extends Hero {
    //编写构造方法
    public HouYi() {
        super.setHeroName("后羿");
    }
    //后羿英雄的自我介绍
    public void display() {
        System.out.println("觉醒吧，猎杀时刻！");

    }
    //后羿英雄的普通攻击
    public void normalAttack() {
        System.out.println("xiuxiu~ 被动：迟缓之箭");
    }
}