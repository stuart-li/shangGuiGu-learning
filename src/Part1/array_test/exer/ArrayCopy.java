package Part1.array_test.exer;
/*
* ʹ�ü�����
* ��1������һ����ΪArrayTest���࣬��main()����������array1��array2����������������int[]���͵�����
* ��2��ʹ��{}����array1��ʼ��Ϊ8��������2��3��5��7��11��13��17��19
* ��3����ʾarray1������
* ��4����ֵarray2��������array1���޸�array2�е�ż����Ԫ�أ�ʹ���������ֵ����array[0]=0,array[2]=2����ӡ��array1
*
* ˼����array1��array2��ʲô��ϵ��array1��array2��ֵַ��ͬ����ָ���˶ѿռ��Ψһ��һ������ʵ�塣
* ��չ���޸���Ŀ��ʵ��array2��array1����ĸ���
* */
public class ArrayCopy {
    public static void main(String[] args) {
        int[] array1,array2;
       array1=new int[]{2,3,5,7,11,13,17,19};

        //��ʾarray1������
        for (int i=0;i<array1.length;i++){
           System.out.print(array1[i]+"\t");

        }
        //��ֵarray2��������array1
        //���ܳ���������ĸ���
        array2=array1;

        //�޸�array2�е�ż������Ԫ�أ�ʹ���������ֵ����array[0]=0,array[2]=2��
        for (int i=0;i<array2.length;i++){
            if (i%2==0){
                array2[i]=i;
            }
        }
        System.out.println();
        for (int i=0;i<array1.length;i++){
            System.out.print(array1[i]+"\t");
        }
    }
}
