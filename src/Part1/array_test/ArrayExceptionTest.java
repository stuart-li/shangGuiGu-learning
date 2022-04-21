package Part1.array_test;
/*
* �����г������쳣��
* 1������Ǳ�Խ����쳣��ArrayIndexOutBoundsException
*
* 2����ָ���쳣��NullPointerException
* */
public class ArrayExceptionTest {
    public static void main(String[] args) {

        //1������Ǳ�Խ����쳣��ArrayIndexOutBoundsException
        int[] arr=new int[]{1,2,3,4,5};
//        for (int i=0;i<=arr.length;i++){
//            System.out.println(arr[i]);
//        }

        //2����ָ���쳣��NullPointerException
        //���һ��
//        int[] arr1=new int[]{1,2,3,4};
//        arr1=null;
//        System.out.println(arr1[0]);

        //�������
        int[][] arr2=new int[4][];
        System.out.println(arr2[0][1]);
    }

}
