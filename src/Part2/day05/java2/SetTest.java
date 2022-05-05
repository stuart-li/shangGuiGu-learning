package Part2.day05.java2;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 *|----ColLection接口：单列集合，用来存储一个一个的对象

 *     |--Set接口：存储无序的、不可重复的数据 -->高中讲的“集合”
 *         |---HashSet:作为Set接口的主要实现类；线程不安全的；可以存储null值
 *              |---LinkedHashset:作为HashSet的子类；遍历其内部数据时，可以暗战添加的顺序遍历
 *         |---TreeSet:可以按照添加对象的指定属性，进行排序
 *
 * 1.Set接口中没有额外定义新的方法，使用的都是Collection中声明过的方法
 *
 * @Param:
 * @Author:
 * @Date:2022/4/25 19:52
 * @Version:1.0
 */
public class SetTest {
    /**
     * Set：存储无序的，不可重复的数据
     * 1.无序性
     *
     * 2.不可重复性：
     * */
    @Test
    public void test(){
        Set set=new HashSet();
        set.add("你好");
        set.add("你好1");
        for (Object obj:set){
            System.out.println(obj);
        }
    }
}
