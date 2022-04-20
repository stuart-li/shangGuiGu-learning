package Part1.pg1;

import java.util.Scanner;

public class DoubleTest {
    public void d_test(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入第一个数字：");
        double a=scanner.nextDouble();
        System.out.print("请输入第二个数字：");
        double b=scanner.nextDouble();
        if (a>10.0&&b<20.0){
            System.out.print("两个数的积是："+a*b);
        }else {
            double sum=a+b;
            System.out.print("两个数的和是："+sum);

        }
    }

    public static void main(String[] args) {
        DoubleTest doubleTest=new DoubleTest();
        doubleTest.d_test();
    }
}
