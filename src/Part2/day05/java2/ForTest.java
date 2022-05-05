package Part2.day05.java2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * foreach遍历集合
 *
 * @Param:
 * @Author:
 * @Date:2022/4/24 20:15
 * @Version:1.0
 */
public class ForTest {
    @Test
    public void test1(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(false);
        coll.add("AA");
        coll.add("BB");
        //for(集合元素的类型 局部变量:需要遍历的集合对象/数组)
        //内部仍然是调用的迭代器iterator
        for (Object obj:coll){
            System.out.println(obj);
        }
    }

    //遍历数组
    @Test
    public void test2(){
        int[] arr=new int[]{1,2,33,21,12,34,54,22};
        for (int i:arr){
            System.out.println(i);
        }
    }
}
