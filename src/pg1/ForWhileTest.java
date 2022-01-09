package pg1;/*
* 题目：
* 从键盘输入个数不确定的整数，并判断输入的正整数和负整数的个数，输入为0时结束程序。
*
* 说明：
* 1.不在循环条件部分限制次数的结构：for(;;)或者while(true)
* 2.结束循环的几种方式：
*       方法一：循环条件部分返回false
*       方式二：在循环体中使用break
* */

import java.util.Scanner;

public class ForWhileTest {
    public void forWhile(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int positiveNumber=0;//记录整数的个数
        int negativeNumber=0;//记录负数的个数

        for(;;){//while (true){   //使用for和while循环的两种写法
            int num=scanner.nextInt();
            if (num>0){
                positiveNumber++;
            }else if (num<0){
                negativeNumber++;
            }else {
                break;
            }
        }
        System.out.println("正数的个数是："+positiveNumber);
        System.out.println("负数的个数是："+negativeNumber);





    }

    public static void main(String[] args) {
        ForWhileTest forWhileTest=new ForWhileTest();
        forWhileTest.forWhile();

    }
}
