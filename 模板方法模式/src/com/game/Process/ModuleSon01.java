package com.game.Process;
/*
 *Module子类
 */

import com.game.Skill.imple.JiPao;
import com.game.domain.HouYi;

public class ModuleSon01 extends Module {

    void loginMethod() {
        System.out.println("选择QQ登陆");
    }

    void chooseHero() {
        System.out.println("选择出战的英雄是：【"+new HouYi().getHeroName()+"】");
    }

    void chooseSkill() {
        HouYi hero=new HouYi();
        System.out.print("选择的召唤师技能是：");
        hero.setIskill(new JiPao());
        hero.skill();
    }
}