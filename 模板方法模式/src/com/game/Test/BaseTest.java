package com.game.Test;

import com.game.domain.Base;
import com.game.domain.Hero;
import com.game.domain.HouYi;
import com.game.domain.LuBanQiHao;

/*
 * 基地测试类B
 */
public class BaseTest {
    public static void main(String[] args) {
        System.out.println("所有英雄集合，攻击基地！");
        //模拟2个英雄，攻击基地
        new Thread(new Runnable() {
            public void run() {
                //1.创建英雄后羿，设置英雄单次攻击伤害值
                Hero hero = new HouYi();
                hero.setHeroHurt(100);//攻击力100B
                //2.获取基地，英雄攻击基地
                Base base = Base.getBase();
                destroyBase(hero,base);
            }
        }).start(); 
        
        new Thread(new Runnable() {
            public void run() {
                //1.创建英雄鲁班七号，设置英雄单次攻击伤害值
                Hero hero = new LuBanQiHao();
                hero.setHeroHurt(80);//攻击力B0
                //2.获取基地，英雄攻击基地
                Base base = Base.getBase();
                destroyBase(hero,base);
            }
        }).start();
    }
    
    //英雄摧毁基地的方法
    private static void destroyBase(Hero hero, Base base) {
        //1.显示那个英雄在攻击基地，英雄的伤害值是多少
        System.out.println("英雄："+hero.getHeroName()+",伤害值："+hero.getHeroHurt());
        //2.攻击基地
        //判断基地生命值>0，若生命值>0，英雄持续攻击B
        while(base.getLife() > 0) {
            synchronized(base){
                
                //2.1判断当前基地的状态是否已经被摧毁
                if(!base.isDestroy()) {
                //若没有被摧毁
                //攻击基地，基地剩余生命值减少
                    //基地的剩余生命值=基地当前生命值-英雄的攻击力
                    base.setLife(base.getLife()-hero.getHeroHurt());
                    
                    //模拟攻击基地的耗时操作
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        // TODO 自动生成的 catch 块
                        e.printStackTrace();
                    }
                    //判断基地生命值>0，英雄攻击基地
                    if(base.getLife()>0) {
                        //判断基地生命值>0，英雄攻击基地
                        System.out.println("英雄【"+hero.getHeroName()+"】正在攻击基地，基地剩余生命值："+base.getLife());
                    }else {
                        //判断基地生命值<0,说明基地已被摧毁，更新基地的状态为摧毁，游戏胜利    
                        base.setDestroy(true);
                        System.out.println("基地已被【"+hero.getHeroName()+"】摧毁,游戏胜利！");
                    }
                }
            }
        }
    }
}