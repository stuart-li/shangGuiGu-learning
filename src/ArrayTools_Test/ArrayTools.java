package ArrayTools_Test;
/*
* java.util.Arrays:操作数组的工具类，里面定义了很多操作数组的方法
* */

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTools {
    public static void main(String[] args) {
        //1.boolean equals(int[] a,int[] b)：判断两个数组是否相等
        int[] arr1=new int[]{1,2,3,4};
        int[] arr2=new int[]{1,3,2,4};
        boolean isEquals= Arrays.equals(arr1,arr2);
        System.out.println(isEquals);

        //2.String toString(int[] a)：输出数组信息
        int[] arr3=new int[]{1,2,3,4};
        System.out.println(Arrays.toString(arr3));

        //3.void fill(int[] a,int val)：将指定信息填充到数组中
        int[] arr4=new int[]{2,3,4};
        Arrays.fill(arr4,9);
        System.out.println(Arrays.toString(arr4));

        //4.void sort(int[] a)：对数组进行排序
        int[] arr5=new int[]{9,8,7,55,22,33,12,2,1};
        Arrays.sort(arr5);
        System.out.println(Arrays.toString(arr5));

        //5.int binarySearch(int[] a,int key)：对排序后的数组进行二分检索指定的值
        int[] arr6=new int[]{4,5,7,8,9,2,3};
        Arrays.sort(arr6);
        System.out.print("请输入要检索的数字：");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int a=Arrays.binarySearch(arr6,num);
        System.out.println(a);

    }
}
