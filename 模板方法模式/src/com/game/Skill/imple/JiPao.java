package com.game.Skill.imple;
import com.game.Skill.ISkill;
 /*
  * 召唤师技能（疾跑）
  */
public class JiPao implements ISkill {
    public void useSkill() {
        System.out.println("疾跑,75秒CD,增加30%移动速度持续10秒");
       }
}
