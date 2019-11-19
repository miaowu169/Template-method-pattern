package com.game.domain;
import com.game.Skill.ISkill;
/*
 * Ӣ���ࣨ�����ࣩ
 */
public abstract class Hero {
    //Ӣ�۵�����
    private String heroName;
    //Ӣ�۵��ٻ�ʦ���ܵĽӿڣ���Ϲ�ϵ����Ҫʹ��ʱ����һ������ļ��ܶ���
    private ISkill iskill;  
    //Ӣ�۵����ҽ��ܵķ���
    public abstract void display(); 
    //����һ���µĳ�Ա��Ӣ�۵��ι������˺�ֵ��
    private int heroHurt;   
    //Ӣ�۵���ͨ�����ķ���
    public abstract void normalAttack();    
    //Ӣ�۵��ٻ�ʦ���ܵ�ʹ�÷���
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