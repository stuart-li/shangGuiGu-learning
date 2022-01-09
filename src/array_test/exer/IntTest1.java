package array_test.exer;
/*
* 定义一个int类型的一维数组，包含10个元素，分别赋一些随机整数，然后求出所有元素的最大值、最小值、和值、平均值；
* 要求：所有随机数都是两位小数
* */

public class IntTest1 {
    public static void main(String[] args){
        int [] arr=new int[10];
        for (int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*(99-10+1)+10);
        }

        //求最大值

        int maxValue=0;
        for (int i=0;i<arr.length;i++){
            if (maxValue<arr[i]){
                maxValue=arr[i];
            }

        }
        System.out.println("最大值是"+maxValue);

        //最小值
        int minValue=arr[0];
        for (int i=0;i<arr.length;i++){
            if (minValue>arr[i]){
                minValue=arr[i];
            }

        }
        System.out.println("最小值是"+minValue);

        //求和值
        int sumValue=0;
        for (int i=0;i<arr.length;i++){
                sumValue+=arr[i];
                System.out.print(arr[i]+"  ");
        }

        System.out.println("和值是"+sumValue);

        //平均值
        int avgValue=sumValue/arr.length;
        System.out.println("平均值是"+avgValue);

    }
}
