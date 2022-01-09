package pg1;

import javax.swing.*;

/*
* 一个数如果恰好等于它的因子之和，这个数就成为“完数”。例如6=1+2+3
* 编程：找出100以内的所有完数。（因子：除去这个数本身的其他约数）
* */
public class Day05 {
    public  void day05Test(){
        int factor=0;
        for (int i=1;i<=1000;i++){
            for (int j=1;j<i;j++){
                if (i%j==0){
                    factor+=j;
                }
            }
            if (i==factor){
                System.out.println(i);
            }
            //重置factor
            factor=0;
        }
    }


    public static void main(String[] args) {
        Day05 day05=new Day05();
        day05.day05Test();

    }
}
