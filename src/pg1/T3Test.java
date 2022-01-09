package pg1;

import java.util.Scanner;

public class T3Test {
    public void maxint3(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入第一个数：");
        int a=scanner.nextInt();
        System.out.print("请输入第二个数：");
        int b=scanner.nextInt();
        System.out.print("请输入第三个数：");
        int c=scanner.nextInt();

        if (a>b){
            if (b>c){
                System.out.println("三个数的大小顺序是："+a+">"+b+">"+c);
            }else if (c>b&&a>c){
                System.out.println("三个数的大小顺序是："+a+">"+c+">"+b);
            }else {
                System.out.println("三个数的大小顺序是："+c+">"+a+">"+b);
            }
        }else if (b>c){
            if (c>a){
                System.out.println("三个数的大小顺序是："+b+">"+c+">"+a);
            }else {
                System.out.println("三个数的大小顺序是："+b+">"+a+">"+c);
            }
        }else if (c>a){
            if (a>b){
                System.out.println("三个数的大小顺序是："+c+">"+a+">"+b);
            }else {
                System.out.println("三个数的大小顺序是："+c+">"+b+">"+a);
            }
        }
    }

    public static void main(String[] args) {
        T3Test t3Test=new T3Test();
        t3Test.maxint3();
    }
}
