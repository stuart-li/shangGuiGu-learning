package project1;


import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import pg1.DoubleTest;

import javax.rmi.CORBA.Util;
import java.util.function.IntFunction;

public class FamilyAccount {
    public void familyAccountTest(){
        boolean isFlag=true;
        //用于记录用户收入和支出的详情
        String details="";
        int balance=0;
        while(isFlag){
        System.out.println("-----------------家庭收支记账软件-------------------");
        System.out.println("                  1、收支明细");
        System.out.println("                  2、登记收入");
        System.out.println("                  3、登记支出");
        System.out.println("                  4、退   出");
        System.out.print("                  请选择<1-4>:");

        //提供用户输入选择；
        char selection=Utility.readMenuSelection();

        switch (selection){
                case '1':
                    System.out.println("----------------当前收支明细记录--------------");
                    System.out.println("\t收支\t账户金额\t收支金额\t说明\n");
                    System.out.println(details);
                    System.out.printf("-----------------------------------------------");

                    break;
            case '2':
                System.out.print("本次收入金额:");
                int money=Utility.readNumber();
                System.out.print("本次收入说明:");
                String mark=Utility.readString();

                //处理balance
                balance+=money;
               //处理details
                details+=("收入\t"+balance+"\t"+money+"\t"+mark+"\n");

                System.out.println("----------------登记完成-----------------");
                break;
            case '3':
                System.out.print("本次收入金额:");
                money=Utility.readNumber();
                System.out.print("本次收入说明:");
                mark=Utility.readString();
                if (balance>money){
                balance-=money;
                details+=("支出\t"+balance+"\t"+money+"\t"+mark+"\n");
                System.out.println("----------------登记完成-----------------");
                }else {
                    System.out.println("账户余额不足，请重新输入");
                }

                break;
            case '4':
                System.out.print("是否确认退出(Y/N):");
                char isExit=Utility.readConfirmSelection();
                if (isExit=='Y'){
                    isFlag=false;
                }
                break;

            }


        }
    }




    public static void main(String[] args) {
        FamilyAccount familyAccount=new FamilyAccount();
        familyAccount.familyAccountTest();

    }
}
