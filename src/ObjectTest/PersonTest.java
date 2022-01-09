package ObjectTest;

import java.beans.PersistenceDelegate;
import java.util.Scanner;

/**
 * 一、设计类，其实就是设计类的成员
 *      属性=成员变量=field=域、字段
 *      方法=成员方法=函数=method
 *
 *      创建类的对象=类的实例化=实例化类
 *
 * 二、类和对象的使用，面向对象思想落地的实现
 *  1、创建类、设计类的成员；
 *  2、创建类的对象
 *  3、通过“对象.属性”或者“对象.方法”调用对象的结构
 *
 * */
//测试类
public class PersonTest {
    public static void main(String[] args) {
        //创建Person类的对象
        Person person=new Person();

        //调用对象的结构：属性、方法
        //调用队象的属性：对象.属性
        person.name="Tom";
        System.out.println(person.name);


//        Scanner scanner=new Scanner(System.in);
//        System.out.print("请输入一个数字：");
//        int bc=scanner.nextInt();
        //调用对象的方法：对象.方法
        person.run(8);
        person.eat();
    }
}

    //Person类
    class Person{

        //属性
        String name;
        int age=19;
        boolean isMale;

        //方法
        public void eat(){
            System.out.println("你肯定是一个大吃货");
        }

        public void run(int bc){
            if (bc>10){
                System.out.println("牛皮");
            }else{
                System.out.println("弱爆了");
            }

            System.out.println(age+"\t"+bc);
            return ;
        }

    }


