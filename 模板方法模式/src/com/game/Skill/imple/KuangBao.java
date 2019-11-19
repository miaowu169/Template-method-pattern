package com.game.Skill.imple;
import com.game.Skill.ISkill;
/*
 * 召唤师的技能（狂暴）
 */
public class KuangBao implements ISkill {
    @Override
    public void useSkill() {
        System.out.println("狂暴：60秒CD,增加攻击速度60%持续5秒");
    }
}