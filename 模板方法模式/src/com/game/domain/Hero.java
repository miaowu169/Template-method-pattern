package com.game.domain;
import com.game.Skill.ISkill;
/*
 * 英雄类（抽象类）
 */
public abstract class Hero {
    //英雄的名称
    private String heroName;
    //英雄的召唤师技能的接口（组合关系，需要使用时传入一个具体的技能对象）
    private ISkill iskill;  
    //英雄的自我介绍的方法
    public abstract void display(); 
    //加入一个新的成员（英雄单次攻击的伤害值）
    private int heroHurt;   
    //英雄的普通攻击的方法
    public abstract void normalAttack();    
    //英雄的召唤师技能的使用方法
    public void skill() {
        iskill.useSkill();
    }   
    //set/get
    public String getHeroName() {
        return heroName;
    }
    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }
    public void setIskill(ISkill iskill) {
        this.iskill = iskill;
    }
    public int getHeroHurt() {
        return heroHurt;
    }
    public void setHeroHurt(int heroHurt) {
        this.heroHurt = heroHurt;
    }
}