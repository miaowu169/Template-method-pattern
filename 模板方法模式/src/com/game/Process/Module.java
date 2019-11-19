package com.game.Process;
/*
 * 简易游戏流程抽象类
 */
public abstract class Module{
    //模板方法，用来控制配置游戏的流程（游戏的流程是一样的-复用）
    //申明为final,不希望子类复用这个方法，防止更改流程的执行顺序
        public final void gameProcess(){
            //第一步：选择登陆方式
            this.loginMethod();
            //第二步：登陆游戏
            this.login();
            //第三步：点击开始按钮
            this.clickBeginBt();
            //第四步：选择英雄
            this.chooseHero();
            //第五步：选择召唤师技能
            this.chooseSkill();
            //开始游戏
            this.beginGame();
        }
    //定义结构里哪些方法是所有过程都是一样的可复用的，哪些是需要子类进行实现的

    //第一步：登陆方式不一样（一个是QQ登陆，一个是微信登陆）
    //所以申明为抽象方法，具体由子类实现
        abstract void loginMethod();

    //第二步：登陆游戏是一样的，直接实现
        void login(){
            System.out.println("登陆游戏");
        }

    //第三步：点击开始按钮是，直接实现
        void clickBeginBt(){
            System.out.println("点击开始按钮");
        }

    //第四步：玩家选择的英雄有差异，申明为抽象方法，具体由子类实现
        abstract void chooseHero();

    //第五步：选择召唤师技能不同，申明为抽象方法，具体由子类实现
        abstract void chooseSkill();

    //开始游戏
        void beginGame(){
            System.out.println("敌军还有5s到达战场，请做好准备！");
        }
    }
