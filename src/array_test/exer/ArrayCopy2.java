package array_test.exer;
/*
 * 思考：array1和array2是什么关系？array1和array2地址值相同，都指向了堆空间的唯一的一个数组实体。
 * 拓展：修改题目，实现array2对array1数组的复制
 * */
public class ArrayCopy2 {
    public static void main(String[] args) {
        int[] array1,array2;
        array1=new int[]{2,3,5,7,11,13,17,19};

        //显示array1的内容
        for (int i=0;i<array1.length;i++){
            System.out.print(array1[i]+"\t");

        }
        //赋值array2变量等于array1
        //数组的复制:
        array2=new int[array1.length];
        for (int i=0;i<array1.length;i++){
            array2[i]=array1[i];

        }

        //修改array2中的偶索引的元素，使其等于索引值（如array[0]=0,array[2]=2）
        for (int i=0;i<array2.length;i++){
            if (i%2==0){
                array2[i]=i;
            }
        }
        System.out.println();
        for (int i=0;i<array1.length;i++){
            System.out.print(array1[i]+"\t");
        }
    }
}
