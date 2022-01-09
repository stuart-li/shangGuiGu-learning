package array_test;
/*
* 二维数组的使用
*
* 1、理解：
* 对于二维数组的理解，我们可以看成是一维数组array1又作为另一个一维数组array2的元素而存在；其实，从数组的底层运行机制来看，其实没有多维数组
* 2、二维数组的使用
*   ①二维数组的声明和初始化
*   ②如何调用数组的指定位置的元素
*   ③如何获取数组的长度
*   ④如何遍历数组
*   ⑤数组元素的默认初始化值:见ArrayTest2_1
*   ⑥数组的内存解析:见ArrayTest2_1
* */

public class ArrayTest2 {
    public static void main(String[] args) {
        //1、二维数组的声明和初始化
        int[] arr=new int[]{1,2,3};//一维数组
        //静态初始化
        int [][] arr1=new int[][]{{1,2,3},{4,5},{6,7,8}};
        System.out.println(arr1[0][2]);
        //动态初始化1
        String [][] arr2=new String[3][2];
        //动态初始化2
        String [][] arr3=new String[3][];
        //2、调用二维数组的元素
        arr3[1] =new String[4];//先给arr3的[1]的数组元素确定它二维数组元素的长度。
        System.out.println(arr3[1][0]);

        //3、获取二维数组的长度
        System.out.println(arr1.length);//获取二维数组的长度，栈指向堆中的地址
        System.out.println(arr1[1].length);//获取arr1[1]的长度，堆中位置是[1]的数组的长度

        //4、如何遍历二维数组
        for (int i=0;i<arr1.length;i++){ //先遍历外层数组
            for (int j=0;j<arr1[i].length;j++){  //再遍历内层数组
                System.out.print(arr1[i][j]);

            }
            System.out.println();
        }

    }
}
