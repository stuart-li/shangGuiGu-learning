package Part1.array_test.exer;
//ͨ����������ֻ����룬�ڲ�������������ֵ��±�
public class Telphone {
    public void telphoneTest(){
        int[] arr=new int[]{8,2,1,0,7,5,9};
        int[] index=new int[]{2,0,3,4,3,6,1,4,3,5,2};
        String tel="";
        for (int i=0;i<index.length;i++){
            tel=tel+arr[index[i]];
        }
        System.out.println("��ϵ��ʽ��"+tel);
    }

    public static void main(String[] args){
        Telphone telphone=new Telphone();
        telphone.telphoneTest();

    }
}
