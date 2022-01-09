package pg1;

import java.util.Scanner;

public class IfElseTest {
    public void ieltest(){
        /*分支结构if-else(条件判断结构)*/
        //例子1
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入你的年龄：");
        int age=scanner.nextInt();
        if (age<18){
            System.out.print("你还未成年");
        }else if (age>=18&age<30){
            System.out.print("你是青少年");
        }else if (age>=30&age<=50){
            System.out.printf("你是中年人，应该泡枸杞茶喝了");
        }else if (age>50){
            System.out.print("你已经是老年人了");
        }
    }

    public static void main(String[] args) {
        IfElseTest ifElseTest=new IfElseTest();
        ifElseTest.ieltest();

    }
}
