package Part1.array_test;
/*
*  ������Ԫ�ص�Ĭ�ϳ�ʼ��ֵ
*       ����ڳ�ʼ����ʽһ�����磺int[][] arr=new int[4][3]
*           ���Ԫ�صĳ�ʼ��ֵΪ����ֵַ
*           �ڲ�Ԫ�صĳ�ʼ��ֵΪ����һά����ĳ�ʼ�������ͬ
*
* *       ����ڳ�ʼ����ʽ�������磺int[][] arr=new int[4][]
 *           ���Ԫ�صĳ�ʼ��ֵΪ��null
 *           �ڲ�Ԫ�صĳ�ʼ��ֵΪ�����ܵ��ã����򱨴�
* ��������ڴ����
*
* */
public class ArrayTest2_1 {
    public static void main(String[] args) {
        int arr [][]=new int[3][4];
        System.out.println(arr[0]);//������������Ĭ�ϳ�ʼ��ֵ��һ��ʮ�����Ƶĵ�ַ��[I@1b6d3586  ����[ ����һά���飬I��ʾint���ͣ�@����Ӿ���ĵ�ַ
        System.out.println(arr[0][0]);//�ڲ�������� int ���������Ĭ�ϳ�ʼ��ֵ0
        System.out.println(arr);//[[I@4554617c

        System.out.println("*********************");
        float arr1 [][]=new float[3][4];
        System.out.println(arr1[0]);//��ֵַ
        System.out.println(arr1[0][0]);//0.0

        System.out.println("*********************");
        String arr2 [][]=new String[3][4];
        System.out.println(arr2[0]);//��ֵַ
        System.out.println(arr2[0][0]);//null

        System.out.println("*********************");
        String arr3 [][]=new String[3][];
        System.out.println(arr3[1]);//null,����������ʲô������null,��Ϊ�ڲ�Ԫ��û��ָ����
//        System.out.println(arr3[1][1]);//������ָ���쳣


    }
}
