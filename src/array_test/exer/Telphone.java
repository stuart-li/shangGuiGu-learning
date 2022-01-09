package array_test.exer;
//通过数组输出手机号码，内层数组是外层数字的下标
public class Telphone {
    public void telphoneTest(){
        int[] arr=new int[]{8,2,1,0,7,5,9};
        int[] index=new int[]{2,0,3,4,3,6,1,4,3,5,2};
        String tel="";
        for (int i=0;i<index.length;i++){
            tel=tel+arr[index[i]];
        }
        System.out.println("联系方式："+tel);
    }

    public static void main(String[] args){
        Telphone telphone=new Telphone();
        telphone.telphoneTest();

    }
}
