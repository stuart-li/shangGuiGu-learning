package Part1.array_test;
/*
* ��ά�����ʹ��
*
* 1����⣺
* ���ڶ�ά�������⣬���ǿ��Կ�����һά����array1����Ϊ��һ��һά����array2��Ԫ�ض����ڣ���ʵ��������ĵײ����л�����������ʵû�ж�ά����
* 2����ά�����ʹ��
*   �ٶ�ά����������ͳ�ʼ��
*   ����ε��������ָ��λ�õ�Ԫ��
*   ����λ�ȡ����ĳ���
*   ����α�������
*   ������Ԫ�ص�Ĭ�ϳ�ʼ��ֵ:��ArrayTest2_1
*   ��������ڴ����:��ArrayTest2_1
* */

public class ArrayTest2 {
    public static void main(String[] args) {
        //1����ά����������ͳ�ʼ��
        int[] arr=new int[]{1,2,3};//һά����
        //��̬��ʼ��
        int [][] arr1=new int[][]{{1,2,3},{4,5},{6,7,8}};
        System.out.println(arr1[0][2]);
        //��̬��ʼ��1
        String [][] arr2=new String[3][2];
        //��̬��ʼ��2
        String [][] arr3=new String[3][];
        //2�����ö�ά�����Ԫ��
        arr3[1] =new String[4];//�ȸ�arr3��[1]������Ԫ��ȷ������ά����Ԫ�صĳ��ȡ�
        System.out.println(arr3[1][0]);

        //3����ȡ��ά����ĳ���
        System.out.println(arr1.length);//��ȡ��ά����ĳ��ȣ�ջָ����еĵ�ַ
        System.out.println(arr1[1].length);//��ȡarr1[1]�ĳ��ȣ�����λ����[1]������ĳ���

        //4����α�����ά����
        for (int i=0;i<arr1.length;i++){ //�ȱ����������
            for (int j=0;j<arr1[i].length;j++){  //�ٱ����ڲ�����
                System.out.print(arr1[i][j]);

            }
            System.out.println();
        }

    }
}
