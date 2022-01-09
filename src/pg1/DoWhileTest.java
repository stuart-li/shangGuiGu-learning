package pg1;

/*
*一、循环结构的4个要素：
* ①初始化条件；
* ②循环条件；
* ③循环体；
* ④迭代条件
*
* 二、 do-while循环
* 初始化条件
* do{
* 循环体；
* 迭代条件
* }whiile(循环条件，Boolean类型)
*
* 执行过程：①->③->④->②
*
* do-while循环至少会执行一次循环体
* */
public class DoWhileTest {
    public void doWhile(){ //遍历100以内的偶数
        int num=1;
        int sum=0;
        int count=0;
        do {
            if (num%2==0){
                System.out.println(num);
                sum=sum+num;
                count++;
            }
            num++;



        }while (num<=100);
        System.out.println("偶数的个数是："+count);
        System.out.println("偶数的总和是："+sum);

    }

    public static void main(String[] args) {
        DoWhileTest doWhileTest=new DoWhileTest();
        doWhileTest.doWhile();

    }
}
