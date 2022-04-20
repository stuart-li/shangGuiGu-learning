package Part1.pg1;/*
* 题目：输出两个正整数m和n，求其最大公约数和最大公倍数；
* 比如：12和20的最大公约数是4，最新公倍数是60；
* 说明：break关键字的使用
* */
import java.util.*;
public class ForTest{
    public void testFor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个正整数：");
        int m = scanner.nextInt();
        System.out.println("请输入第二个正整数：");
        int n = scanner.nextInt();

        //获取两个数中的最小值
        int min = (m < n) ? m : n;
        for (int i = min; i >= 1; i--) {
            if (m % i == 0 && n % i == 0) {
                System.out.println("最大公约数为："+i);
                break;//一旦在循环中使用了break，则跳出该循环
            }
        } //for循环
    } //testFor()方法
    public static void main(String[] args) {
        ForTest forTest=new ForTest();
        forTest.testFor();
    } //main方法
}







