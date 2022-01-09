package array_test;
/*
*  ⑤数组元素的默认初始化值
*       针对于初始化方式一：比如：int[][] arr=new int[4][3]
*           外层元素的初始化值为：地址值
*           内层元素的初始化值为：与一维数组的初始化情况相同
*
* *       针对于初始化方式二：比如：int[][] arr=new int[4][]
 *           外层元素的初始化值为：null
 *           内层元素的初始化值为：不能调用，否则报错
* ⑥数组的内存解析
*
* */
public class ArrayTest2_1 {
    public static void main(String[] args) {
        int arr [][]=new int[3][4];
        System.out.println(arr[0]);//外层数组输出的默认初始化值是一个十六进制的地址：[I@1b6d3586  其中[ 代表一维数组，I表示int类型，@后面接具体的地址
        System.out.println(arr[0][0]);//内层数组输出 int 类型数组的默认初始化值0
        System.out.println(arr);//[[I@4554617c

        System.out.println("*********************");
        float arr1 [][]=new float[3][4];
        System.out.println(arr1[0]);//地址值
        System.out.println(arr1[0][0]);//0.0

        System.out.println("*********************");
        String arr2 [][]=new String[3][4];
        System.out.println(arr2[0]);//地址值
        System.out.println(arr2[0][0]);//null

        System.out.println("*********************");
        String arr3 [][]=new String[3][];
        System.out.println(arr3[1]);//null,不管类型是什么，都是null,因为内层元素没有指定过
//        System.out.println(arr3[1][1]);//报错，空指针异常


    }
}
