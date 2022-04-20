package Part1.array_test;
/*������Ԫ�ص�Ĭ�ϳ�ʼ��ֵ
*       >����Ԫ�������ͣ�0��
*       >����Ԫ���Ǹ����ͣ�0.0
*       >����Ԫ����char�ͣ�0
*       >����Ԫ����boolean�ͣ�false
*
*
*       >����Ԫ����������������ʱ String:null
*
* ��������ڴ����
*
*
* */


public class ArrayTest1 {
    public void testArray(){
        //�����Ĭ�ϳ�ʼ��ֵ
        //����
        int [] arr=new int[4];
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("***************");

        //������
        float [] arr1=new float[4];
        for (int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        System.out.println("***************");

        //char����
        char [] arr2=new char[4];
        for (int i=0;i<arr2.length;i++){
            System.out.println("-----"+  arr2[i]  +"******");

            }
        if (arr2[3]==0){//֤��char���͵�Ĭ��ֵΪ0
            System.out.println("���");
        }
        System.out.println("***************");

        //boolean����
        boolean [] arr3=new boolean[4];
        for (int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);

        }
        System.out.println("***************");

        //String����
        String [] arr4=new String[4];
        System.out.println(arr4[0]);

    }


    public static void main(String[] args) {
        ArrayTest1 arrayTest1=new ArrayTest1();
        arrayTest1.testArray();

    }
}
