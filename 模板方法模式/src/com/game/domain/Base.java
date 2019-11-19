package com.game.domain;

/*
 * 基地（单例类）
 */

public class Base {
    // 构造方法私有
    private Base() {}
    //创建一个私有静态的基地对象的引用
    private static Base base=null;
    //提供一个公共的静态的创建基地对象或获取基地对象的方法
    public synchronized static Base getBase() {//同步
        if(base == null) {
            base = new Base();
        }
        return base;
    }
    
    //基地的生命值
    private int life = 999;
    //基地的摧毁状态
    private boolean destroy = false;
    
    public int getLife() {
        return life;
    }
    public void setLife(int life) {
        this.life = life;
    }
    public boolean isDestroy() {
        return destroy;
    }
    public void setDestroy(boolean destroy) {
        this.destroy = destroy;
    }
}
