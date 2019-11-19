package com.game.Process;
/*
 *Module子类
 */
import com.game.Skill.imple.KuangBao;
import com.game.domain.LuBanQiHao;

public class ModuleSon02 extends Module {

    void loginMethod() {
        System.out.println("选择微信登陆");
    }

    void chooseHero() {
        System.out.println("选择出战的英雄是：【"+new LuBanQiHao().getHeroName()+"】");
    }

    void chooseSkill() {
        LuBanQiHao hero=new LuBanQiHao();
        System.out.print("选择的召唤师技能是：");
        hero.setIskill(new KuangBao());
        hero.skill();
    }

}