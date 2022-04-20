package Part1.pg1;

public class ForSt {
    public void forts(){
        for (int i=0;i<=215;i++){
            if  (i%3==0&&i%5==0&&i%7==0){
                System.out.println(i+"foo biz baz");
            }else if (i%5==0){
                System.out.println(i+"biz");
            }else if (i%7==0){
                System.out.println(i+"baz");
            }else if (i%3==0){
                System.out.println(i+"foo");
            }else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        ForSt forSt=new ForSt();
        forSt.forts();
    }
}
