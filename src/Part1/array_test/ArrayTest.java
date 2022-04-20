package Part1.array_test;
/*
* 一、数组的概述
* 1、数组的理解：数组（Array）,是多个相同类型数据按一定顺序排列的几个，并使用一个名字命名，并通过编号的方式对这些数据进行统一管理。
*
* 2、数组的相关概念：
* >数组名
* >元素
* >索引
* >数组长度。元素的个数
*
* 3、数组的特点：
*   1)数组是有序排列的
*   2)数组属于引用数据类型的变量。数组的元素既可以是基本数据类型，也可以是引用数据类型
*   3)创建数组对象在内存中开辟一块连续的空间
*   4)数组的长度一旦确定后，就可以修改
*
* 4、数组的分类：
*   ①按照维度：一维数组、二位数组、三维数组
*   ②按照数组元素类型：基本数据类型元素的数组、引用数据类型元素的数组、
*
* 5、一维数组的使用：
*   ①一维数组的声明和初始化
*   ②如何调用数组的指定位置的元素
*   ③如何获取数组的长度
*   ④如何遍历数组
*   ⑤数组元素的默认初始化值：详见ArrayTest1类
*   ⑥数组的内存解析：详见ArrayTest1类
*
* */

public class ArrayTest {
    public  void array_Test1(){
        //数组的声明
        //1.1 静态初始化：数组的初始化和赋值操作同时进行
        int[] ids=new int[]{1001,1002,1003,1004};
        //1.2 动态初始化：数组的初始化和赋值操作分开进行
        String[] names=new String [5]; //数组一旦初始化完成，其长度就确定了
        System.out.println(ids[2]);//调用数组中的元素，通过下标的方式
        //给names数组赋值
        names[0]="段坤";
        names[1]="文天祥";
        names[2]="徐志摩";
        names[3]="马化腾";
        names[4]="刘强东";
//        names[5]="马云";//报ArrayIndexOutOfBoundsException  数组超出长度
        System.out.println(names.length);//查看names数组的长度
        System.out.println(names[1].charAt(0));//获取到索引是[1]的元素的第二个字符串

        //如何遍历数组
        for (int i=0;i<ids.length;i++){
            System.out.println(ids[i]);
        }

    }
    public static void main(String[] args) {
        ArrayTest arrayTest=new ArrayTest();
        arrayTest.array_Test1();



    }
}
