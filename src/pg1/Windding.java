package pg1;/*
* 身高180以上，财富1千万以上，帅否：帅
* 1、满足3个条件的：一定嫁
* 2、3个条件满足其中一个的：比上不足比下有余
* 3、三个条件都不满足的：不嫁。
* */
import java.util.Scanner;

public class Windding {
    public void Man(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入身高(cm)：");
        double height=scanner.nextDouble();
        System.out.print("请输入你的财富(千万):");
        double rich=scanner.nextDouble();
        System.out.print("你是否帅（是/否）：");
        String  handsome=scanner.next();
//        boolean handsome_ture="是".equals(handsome);//是：true;其他字符为：false；
//        boolean handsome_false="否".equals(handsome);

        if (height<180&rich<=1&!handsome.equals("是")){ //equal()匹配输入的字符是否一样。一样返回true,不一样返回false；
            System.out.print("不嫁！");
        }else if (height>=180|rich>1|handsome.equals("是")){
            System.out.print("嫁吧，比上不足比下有余");
        }else {
            System.out.print("一定要嫁");
        }

    }

    public static void main(String[] args) {
        Windding windding=new Windding();
        windding.Man();
    }
}
