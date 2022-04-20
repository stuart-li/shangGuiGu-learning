package Part1.pg1;

import java.util.*;
public class Test0316 {
    public void person(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入你的名字：");
        String p_name=scanner.next();
        System.out.print("请输入你的性别：");
        String p_sex=scanner.next();
        System.out.print("请输入你的年龄：");
        int p_age=scanner.nextInt();
        System.out.println("姓名："+p_name+","+"性别："+","+p_sex+"年龄："+p_age);
    }

    public static void main(String[] args) {
        Test0316 test0316=new Test0316();
        test0316.person();
    }
}
