package pg1;

import java.util.Scanner;

public class DogAge{
    public void dog_age(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入小狗的年龄：");
        double age=scanner.nextDouble();
        if (age<0){
            System.out.printf("请输入正整数");
        } else if (age<=2){
            double sum=age*10.5;
            System.out.print("小狗的年龄相当于人的"+sum+"岁");
        }else {
            double sum=2*10.5+(age-2)*4;
            System.out.println("小狗的年龄相当于人的"+sum+"岁");
        }
    }

    public static void main(String[] args) {
        DogAge dogAge=new DogAge();
        dogAge.dog_age();
    }
}
