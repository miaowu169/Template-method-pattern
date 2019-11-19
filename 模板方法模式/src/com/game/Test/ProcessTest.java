package com.game.Test;
/*
 *游戏流程测试类
 */
import com.game.Process.ModuleSon01;
import com.game.Process.ModuleSon02;

public class ProcessTest {
    public static void main(String[] args) {
        System.out.println("=======Module01========");
        ModuleSon01 process1=new ModuleSon01();
        process1.gameProcess();
        System.out.println("=======Module02========");
        ModuleSon02 process2=new ModuleSon02();
        process2.gameProcess();
    }
}
