package Part2.day05.java2;

import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.zip.CheckedOutputStream;

/**
 * @Param:
 * @Author:
 * @Date:2022/4/21 21:12
 * @Version:1.0
 */
public class CollectionTest2 {
    @Test
    public void test(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(false);
        coll.add("AA");

        //1.contains：判断当前集合是否包含obj
       boolean contains= coll.contains(123);
        System.out.println(contains);

        //2.containsAll(Collection coll1):判单形参coll1中的所有元素的否都存在于当前集合中
        Collection coll1=new ArrayList();
        coll1.add(123);
        coll1.add(false);
        coll1.add("AA");
        coll1.add("A1");

        boolean contains1 = coll.containsAll(coll1);
        System.out.println(contains1);

    }

    @Test
    public void test2(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(false);
        coll.add("AA");
        coll.add("BB");


        //3.remove(Object obj):从集合中移除某个obj元素,移除成功返回true，失败false
        coll.remove(123);
        System.out.println(coll);

        //4.removeAll(Collection coll1):差集：从当前集合中移除coll1中所有的元素（两个集合共有的元素）
        Collection coll1= Arrays.asList(123,"AA");

        coll.removeAll(coll1);
        System.out.println(coll);
        System.out.println(coll1);
    }

    @Test
    public void test3(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(false);
        coll.add("AA");
        coll.add("BB");

        //5.retainAll(Collection coll1):交集：获取当前集合和集合coll1的交集
//        Collection coll1= Arrays.asList(123,"AA",456,789);
//        coll.retainAll(coll1);
//        System.out.println(coll);

        //6.equals(Object obj):要想返回true 需要当前集合和形参集合的元素都相同
        Collection coll1=new ArrayList();
        coll1.add(123);
        coll1.add(false);
        coll1.add("AA");
        coll1.add("BB");
        System.out.println(coll.equals(coll1));
    }

    @Test
    public void test4(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(false);
        coll.add("AA");
        coll.add("BB");

        //7.hashCode():返回当前对象的哈希值
        System.out.println(coll.hashCode());

        //8.集合-->数组
        Object[] arr = coll.toArray();
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        
        //拓展：数组-->集合？调用Arrays的静态方法asList()
        List<String> list = Arrays.asList(new String[]{});
        System.out.println(list);

        //9.iterator():返回Iterator接口的实例，用于遍历集合元素，放在IteratorTest.java中测试
    }

}
