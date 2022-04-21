package Part1.pg1;

/**
 * 初始条件
 * while(循环条件，Boolean类型){
 *     循环体;
 *     迭代条件;
 * }
 */
public class While_Test {
    public void While_01(){
        int i=1;
        int sum=0;
        while (i<=100){ //遍历100以内的偶数并累加求和
            if (i%2==0){
                System.out.println(i);
                sum=sum+i;
            }
            i++;
        }
        System.out.println("100以内的偶数的和是："+sum);
    }

    public static void main(String[] args) {
        While_Test while_test=new While_Test();
        while_test.While_01();
    }
}
