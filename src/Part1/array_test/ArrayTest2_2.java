package Part1.array_test;

import java.util.Scanner;

/*
* �㷨�Ŀ��죺����ĸ��ơ���ת�����ң����Բ��ҡ����ֲ��ң�
* */
public class ArrayTest2_2 {
    public static void main(String[] args) {
        String [] arr=new String[]{"�ܽ���","��־��","������","������","���ෲ","�ֿ���"};

        //����ĸ�ֵ(��������������ĸ�ֵ��arr1=arr)
        String[] arr1=new String[arr.length];
        for (int i=0;i<arr1.length;i++){
            arr1[i]=arr[i];
        }

        //����ķ�ת
        //��ʽһ��
//        for (int i=0;i<arr.length/2;i++){
//            String temp=arr[i];
//            arr[i]=arr[arr.length-i-1];
//            arr[arr.length-i-1]=temp;
//        }

        //��ʽ����
//        for (int i=0,j=arr.length-1-1;i<j;i++){
//            String temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//        }
        //����
//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+"\t");
//        }

        //���ң�������
        //���Բ���
        String dest;
        System.out.print("������Ҫ����������(���Բ���)��");
        Scanner scanner=new Scanner(System.in);
        dest=scanner.next();
        boolean isFlag=true;//����һ����ʶ������ڱ������ҵ��˾��޸ı�ʶ��״̬�����û�ҵ��Ͳ��޸�
        for (int i=0;i<arr.length;i++){
            if (dest.equals(arr[i])){ //equals������ƥ�������Ƿ�һ�µ�
                isFlag=false;
                System.out.println("�ҵ���ָ����Ԫ�أ�λ��Ϊ��"+i);
                break;
            }
        }
        if (isFlag){
            System.out.println("���ݲ�����");
        }
        //���ַ����ң���������Բ���Ҫ��
        //ǰ�᣺��Ҫ���ҵ��������������ġ�
        int[] arr2=new int[]{-96,-40,-1,3,6,8,15,40,788,888,999};
        System.out.print("������Ҫ���ҵ�����(���ַ�����)��");
        int dest1 = scanner.nextInt();
        int head=0;//����ĵ�һ������
        int end=arr.length-1;//�������һ������
        boolean isFlag1=true;
        while (head<=end){
            int middle=(head+end)/2;
            if (dest1==arr2[middle]){
                System.out.println("�ҵ���ָ����Ԫ�أ�λ��Ϊ��"+middle);
                isFlag1=false;
                break;
            }else if (middle>dest1){
                end=middle-1;
            }else {//arr2[middle]<dest1
                head=middle+1;
            }
        }
        if (isFlag1){
            System.out.println("���ݲ�����");
        }
    }
}
