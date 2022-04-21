package Part1.ArrayTools_Test;
/*
* java.util.Arrays:��������Ĺ����࣬���涨���˺ܶ��������ķ���
* */

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTools {
    public static void main(String[] args) {
        //1.boolean equals(int[] a,int[] b)���ж����������Ƿ����
        int[] arr1=new int[]{1,2,3,4};
        int[] arr2=new int[]{1,3,2,4};
        boolean isEquals= Arrays.equals(arr1,arr2);
        System.out.println(isEquals);

        //2.String toString(int[] a)�����������Ϣ
        int[] arr3=new int[]{1,2,3,4};
        System.out.println(Arrays.toString(arr3));

        //3.void fill(int[] a,int val)����ָ����Ϣ��䵽������
        int[] arr4=new int[]{2,3,4};
        Arrays.fill(arr4,9);
        System.out.println(Arrays.toString(arr4));

        //4.void sort(int[] a)���������������
        int[] arr5=new int[]{9,8,7,55,22,33,12,2,1};
        Arrays.sort(arr5);
        System.out.println(Arrays.toString(arr5));

        //5.int binarySearch(int[] a,int key)����������������ж��ּ���ָ����ֵ
        int[] arr6=new int[]{4,5,7,8,9,2,3};
        Arrays.sort(arr6);
        System.out.print("������Ҫ���������֣�");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int a=Arrays.binarySearch(arr6,num);
        System.out.println(a);

    }
}
