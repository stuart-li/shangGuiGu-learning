package array_test;

import java.util.Scanner;

/*
* 算法的考察：数组的复制、反转、查找（线性查找、二分查找）
* */
public class ArrayTest2_2 {
    public static void main(String[] args) {
        String [] arr=new String[]{"周杰伦","罗志祥","郭敬明","蔡徐坤","吴亦凡","林俊杰"};

        //数组的赋值(区别于数组变量的赋值：arr1=arr)
        String[] arr1=new String[arr.length];
        for (int i=0;i<arr1.length;i++){
            arr1[i]=arr[i];
        }

        //数组的反转
        //方式一：
//        for (int i=0;i<arr.length/2;i++){
//            String temp=arr[i];
//            arr[i]=arr[arr.length-i-1];
//            arr[arr.length-i-1]=temp;
//        }

        //方式二：
//        for (int i=0,j=arr.length-1-1;i<j;i++){
//            String temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//        }
        //遍历
//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+"\t");
//        }

        //查找（搜索）
        //线性查找
        String dest;
        System.out.print("请输入要搜索的名字(线性查找)：");
        Scanner scanner=new Scanner(System.in);
        dest=scanner.next();
        boolean isFlag=true;//定义一个标识，如果在遍历里找到了就修改标识的状态，如果没找到就不修改
        for (int i=0;i<arr.length;i++){
            if (dest.equals(arr[i])){ //equals是用来匹配内容是否一致的
                isFlag=false;
                System.out.println("找到了指定的元素，位置为："+i);
                break;
            }
        }
        if (isFlag){
            System.out.println("数据不存在");
        }
        //二分法查找：相对于线性查找要快
        //前提：所要查找的数组必须是有序的。
        int[] arr2=new int[]{-96,-40,-1,3,6,8,15,40,788,888,999};
        System.out.print("请输入要查找的数字(二分法查找)：");
        int dest1 = scanner.nextInt();
        int head=0;//数组的第一个索引
        int end=arr.length-1;//数组最后一个索引
        boolean isFlag1=true;
        while (head<=end){
            int middle=(head+end)/2;
            if (dest1==arr2[middle]){
                System.out.println("找到了指定的元素，位置为："+middle);
                isFlag1=false;
                break;
            }else if (middle>dest1){
                end=middle-1;
            }else {//arr2[middle]<dest1
                head=middle+1;
            }
        }
        if (isFlag1){
            System.out.println("数据不存在");
        }
    }
}
