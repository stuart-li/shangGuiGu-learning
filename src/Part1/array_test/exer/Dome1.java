package Part1.array_test.exer;

import java.util.Scanner;

/**
 * �Ӽ��̶�ȡѧ���ĳɼ����ҳ���߷֣������ѧ���ɼ��ȼ���
 *      �ɼ�>=��߷�-10 �ȼ�Ϊ A
 *      �ɼ�>=��߷�-20 �ȼ�Ϊ B
 *      �ɼ�>=��߷�-30 �ȼ�Ϊ C
 *      ����           �ȼ�Ϊ D
 *
 * ��ʾ���ȶ�ȡѧ���������������������� int���飬���ѧ���ɼ�
 *
 * */
public class Dome1 {
    public static void main(String[] args) {
        //1��ʹ��Scanner��ȡѧ���ĸ�����
        Scanner scanner=new Scanner(System.in);
        System.out.println("������ѧ����������");
        int number=scanner.nextInt();

        //2����������洢ѧ���ɼ�����̬��ʼ����
        int[] scores=new int[number];
        //3���������Ԫ�ظ�ֵ��
        System.out.println("������"+number+"��ѧ���ĳɼ���");
        int maxScore = 0;
        for (int i=0;i<scores.length;i++){
            scores[i]=scanner.nextInt();
            //4����ȡ�����е�Ԫ�ص����ֵ����߷֣�
//            for (int i=0;i<scores.length;i++){
                if (maxScore<scores[i]){
                    maxScore=scores[i];
                }
            }
//        }

        //5������ÿ��ѧ���ĳɼ�����߷ֵĲ�ֵ���õ�ÿ��ѧ���ĵȼ���������ȼ��ͳɼ�
        char level;
        for (int i=0;i<scores.length;i++){
            if (maxScore-scores[i]<=10){
                level='A';
            }else if (maxScore-scores[i]<=20){
                level='B';
            }else if (maxScore-scores[i]<=30){
                level='C';
            }else {
                level='D';
            }
            System.out.println("��"+(i+1)+"��ѧ���ĳɼ���"+scores[i]+",�ɼ��ȼ���"+level);
        }


    }
}
