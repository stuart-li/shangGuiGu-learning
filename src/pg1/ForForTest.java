package pg1;/*
* 嵌套循环的使用
* 1.嵌套循环：将一个循环结构A声明在另一个循环结构B的循环体中，就构成了嵌套循环
* 2.
* 外层循环：循环结构B
* 内层循环：循环结构A
* 3.说明：
* ①内层循环结构遍历一遍，只相当于外层循环体循环执行了一次；
* ②假设外层循环需要执行m次，内层循环需要执行n次。此时内层循环的循环体一共执行了：m*n次
* 4.技巧：
* 外层循环控制行数
* 内层循环控制列数
* */

public class ForForTest {
    public void forFor(){
        for (int i=1;i<=6;i++){
            System.out.print("*");
        } //输入一行6个*号
        System.out.println("\n");

        for (int j=1;j<=3;j++){
            for (int i=1;i<=6;i++){
                System.out.print("*");
            }
            System.out.println();
        } //for循环嵌套for循环输入：3行，每行6个*号
        System.out.println("\n");

        for (int j=1;j<=6;j++){
            for (int i=1;i<=j;i++){
                System.out.print("*");
            }
            System.out.println();
        } //由外层循环体循环的次数决定内层循环输出*的个数，正向输出*
        System.out.println();

        /*
        *       i(行数)       j(*的个数)     规律：i+j=5 换句话说 i=5-j;
        ****    1            4
        ***     2            3
        **      3            2
        *       4            1
        * */
        for (int j=1;j<=4;j++){
            for (int i=1;i<=5-j;i++){
                System.out.print("*");
            }
            System.out.println();
        } //反向输出*

    }


    public static void main(String[] args) {
        ForForTest forForTest=new ForForTest();
        forForTest.forFor();

    }
}
