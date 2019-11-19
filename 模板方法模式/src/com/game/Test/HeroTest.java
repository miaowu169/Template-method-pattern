package com.game.Test;

import com.game.Skill.imple.JiPao;
import com.game.Skill.imple.KuangBao;
import com.game.domain.Hero;
import com.game.domain.HouYi;
/*
 * 英雄与技能的测试类
 */
public class HeroTest {
    public static void main(String[] args) {
        //1.选择英雄
        Hero hero = new HouYi();
        //2.英雄自我介绍
        System.out.println("英雄："+hero.getHeroName()+",自我介绍：");
        hero.display();
        //3.玩家根据组队情况，设置英雄的召唤师技能
        hero.setIskill(new JiPao());//面向接口编程的体现
        hero.setIskill(new KuangBao());
        //4.游戏开始
        System.out.println("游戏开始，请做好准备！");
        
        //5.使用英雄的普通攻击
        hero.normalAttack();
        
        //6.使用英雄的召唤师技能攻击
        hero.skill();
    }
}