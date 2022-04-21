package Part1.array_test.exer;
/*
* ����һ��int���͵�һά���飬����10��Ԫ�أ��ֱ�һЩ���������Ȼ���������Ԫ�ص����ֵ����Сֵ����ֵ��ƽ��ֵ��
* Ҫ�����������������λС��
* */

public class IntTest1 {
    public static void main(String[] args){
        int [] arr=new int[10];
        for (int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*(99-10+1)+10);
        }

        //�����ֵ

        int maxValue=0;
        for (int i=0;i<arr.length;i++){
            if (maxValue<arr[i]){
                maxValue=arr[i];
            }

        }
        System.out.println("���ֵ��"+maxValue);

        //��Сֵ
        int minValue=arr[0];
        for (int i=0;i<arr.length;i++){
            if (minValue>arr[i]){
                minValue=arr[i];
            }

        }
        System.out.println("��Сֵ��"+minValue);

        //���ֵ
        int sumValue=0;
        for (int i=0;i<arr.length;i++){
                sumValue+=arr[i];
                System.out.print(arr[i]+"  ");
        }

        System.out.println("��ֵ��"+sumValue);

        //ƽ��ֵ
        int avgValue=sumValue/arr.length;
        System.out.println("ƽ��ֵ��"+avgValue);

    }
}
