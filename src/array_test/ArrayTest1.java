package array_test;
/*⑤数组元素的默认初始化值
*       >数组元素是整型：0；
*       >数组元素是浮点型：0.0
*       >数组元素是char型：0
*       >数组元素是boolean型：false
*
*
*       >数组元素是引用数据类型时 String:null
*
* ⑥数组的内存解析
*
*
* */


public class ArrayTest1 {
    public void testArray(){
        //数组的默认初始化值
        //整型
        int [] arr=new int[4];
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("***************");

        //浮点型
        float [] arr1=new float[4];
        for (int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        System.out.println("***************");

        //char类型
        char [] arr2=new char[4];
        for (int i=0;i<arr2.length;i++){
            System.out.println("-----"+  arr2[i]  +"******");

            }
        if (arr2[3]==0){//证明char类型的默认值为0
            System.out.println("你好");
        }
        System.out.println("***************");

        //boolean类型
        boolean [] arr3=new boolean[4];
        for (int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);

        }
        System.out.println("***************");

        //String类型
        String [] arr4=new String[4];
        System.out.println(arr4[0]);

    }


    public static void main(String[] args) {
        ArrayTest1 arrayTest1=new ArrayTest1();
        arrayTest1.testArray();

    }
}
