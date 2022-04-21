package Part1.pg1;

import java.util.Scanner;

public class MathTest {
    public void randomTest(){
        System.out.print("请输入一个两位数：");
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();
        int a=(int)(Math.random()*100);
        if (input>a){
            System.out.print("你赢了");
        }else {
            System.out.print("很遗憾，你输了");
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        MathTest mathTest=new MathTest();
        mathTest.randomTest();
    }
}
