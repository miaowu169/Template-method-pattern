package com.game.Process;
/*
 *Module����
 */

import com.game.Skill.imple.JiPao;
import com.game.domain.HouYi;

public class ModuleSon01 extends Module {

    void loginMethod() {
        System.out.println("ѡ��QQ��½");
    }

    void chooseHero() {
        System.out.println("ѡ���ս��Ӣ���ǣ���"+new HouYi().getHeroName()+"��");
    }

    void chooseSkill() {
        HouYi hero=new HouYi();
        System.out.print("ѡ����ٻ�ʦ�����ǣ�");
        hero.setIskill(new JiPao());
        hero.skill();
    }
}