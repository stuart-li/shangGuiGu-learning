package Part2.day05.java2;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合元素的遍历,使用迭代器接口Iterator接口
 * 使用内部方法：next()  hashNext()
 *
 * @Param:
 * @Author:
 * @Date:2022/4/21 22:19
 * @Version:1.0
 */
public class IteratorTest {

    @Test
    public void test1(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(false);
        coll.add("AA");
        coll.add("BB");

        Iterator iterator = coll.iterator();
        //hashNext():判断是否还有下一个元素
        while (iterator.hasNext()){
            //next():①指针下移；②将下移以后集合位置上的元素返回
            System.out.println(iterator.next());
        }

    }

    @Test
    public void test2(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(false);
        coll.add("AA");
        coll.add("BB");
        //删除集合中的AA
        Iterator iterator=coll.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            if ("AA".equals(obj)){
                iterator.remove();
            }
        }
        //遍历集合，需要重新生成对象，因为上面创建的对象已经跳出
        Iterator iterator1=coll.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
