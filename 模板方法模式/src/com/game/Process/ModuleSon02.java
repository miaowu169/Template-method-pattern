package com.game.Process;
/*
 *Module����
 */
import com.game.Skill.imple.KuangBao;
import com.game.domain.LuBanQiHao;

public class ModuleSon02 extends Module {

    void loginMethod() {
        System.out.println("ѡ��΢�ŵ�½");
    }

    void chooseHero() {
        System.out.println("ѡ���ս��Ӣ���ǣ���"+new LuBanQiHao().getHeroName()+"��");
    }

    void chooseSkill() {
        LuBanQiHao hero=new LuBanQiHao();
        System.out.print("ѡ����ٻ�ʦ�����ǣ�");
        hero.setIskill(new KuangBao());
        hero.skill();
    }

}