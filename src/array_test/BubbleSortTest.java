package array_test;

/*
* �����ð�������ʵ��
* */

public class BubbleSortTest {
    public static void main(String[] args) {
        int[] arr=new int[]{-92,-55,6,45,77,99,100,32,11,54,67};

        //ð������
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }

            }
            System.out.println(arr[i]+"\t");

        }
    }
}
