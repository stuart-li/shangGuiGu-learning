package Part1.pg1;/*
* switch-case语句结构
* switch结构中的表达式，只能是如下6种数据类型之一：byte、short、char、int、枚举类型、String类型
* */

import java.util.Scanner;

public class SwitchCaseTest {
    public void s_c_Test(){
        Scanner scanner=new Scanner(System.in);
//        System.out.println("请输入一个5以内的正整数：");
//        int num=scanner.nextInt();
//        switch (num){
//            case 1:
//                System.out.println("你输入的数字是1");break;
//            case 2:
//                System.out.println("你输入的数字是2");break;
//            case 3:
//                System.out.println("你输入的数字是3");break;
//            case 4:
//                System.out.println("你输入的数字是4");break;
//            case 5:
//                System.out.println("你输入的数字是5");break;
//            default:
//                System.out.println("输入有误，请输入5以内的正整数");

        System.out.println("请输入一个季节（春/夏/秋/冬）：");
        String season=scanner.next();
        switch (season){
            case "春":
                System.out.println("春天");break;
            case "夏":
                System.out.println("夏天");break;
            case "秋":
                System.out.println("秋天");break;
            case "冬":
                System.out.println("冬天");break;
            default:
                System.out.println("输入有误，请输入春/夏/秋/冬其中一个字");
        }
    }




    public static void main(String[] args) {
        SwitchCaseTest switchCaseTest=new SwitchCaseTest();
        switchCaseTest.s_c_Test();
    }
}
