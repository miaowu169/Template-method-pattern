package com.game.Process;
/*
 * ������Ϸ���̳�����
 */
public abstract class Module{
    //ģ�巽������������������Ϸ�����̣���Ϸ��������һ����-���ã�
    //����Ϊfinal,��ϣ�����ิ�������������ֹ�������̵�ִ��˳��
        public final void gameProcess(){
            //��һ����ѡ���½��ʽ
            this.loginMethod();
            //�ڶ�������½��Ϸ
            this.login();
            //�������������ʼ��ť
            this.clickBeginBt();
            //���Ĳ���ѡ��Ӣ��
            this.chooseHero();
            //���岽��ѡ���ٻ�ʦ����
            this.chooseSkill();
            //��ʼ��Ϸ
            this.beginGame();
        }
    //����ṹ����Щ���������й��̶���һ���Ŀɸ��õģ���Щ����Ҫ�������ʵ�ֵ�

    //��һ������½��ʽ��һ����һ����QQ��½��һ����΢�ŵ�½��
    //��������Ϊ���󷽷�������������ʵ��
        abstract void loginMethod();

    //�ڶ�������½��Ϸ��һ���ģ�ֱ��ʵ��
        void login(){
            System.out.println("��½��Ϸ");
        }

    //�������������ʼ��ť�ǣ�ֱ��ʵ��
        void clickBeginBt(){
            System.out.println("�����ʼ��ť");
        }

    //���Ĳ������ѡ���Ӣ���в��죬����Ϊ���󷽷�������������ʵ��
        abstract void chooseHero();

    //���岽��ѡ���ٻ�ʦ���ܲ�ͬ������Ϊ���󷽷�������������ʵ��
        abstract void chooseSkill();

    //��ʼ��Ϸ
        void beginGame(){
            System.out.println("�о�����5s����ս����������׼����");
        }
    }
