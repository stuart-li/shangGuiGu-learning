package array_test;
/*
* 数组中常见的异常：
* 1、数组角标越界的异常：ArrayIndexOutBoundsException
*
* 2、空指针异常：NullPointerException
* */
public class ArrayExceptionTest {
    public static void main(String[] args) {

        //1、数组角标越界的异常：ArrayIndexOutBoundsException
        int[] arr=new int[]{1,2,3,4,5};
//        for (int i=0;i<=arr.length;i++){
//            System.out.println(arr[i]);
//        }

        //2、空指针异常：NullPointerException
        //情况一：
//        int[] arr1=new int[]{1,2,3,4};
//        arr1=null;
//        System.out.println(arr1[0]);

        //情况二：
        int[][] arr2=new int[4][];
        System.out.println(arr2[0][1]);
    }

}
