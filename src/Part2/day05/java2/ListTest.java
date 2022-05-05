package Part2.day05.java2;

import org.junit.Test;

import java.util.ArrayList;

/**
 * |----ColLection接口：单列集合，用来存储一个一个的对象
 *      |---List接口：存储有序的、可重复的数据。-->动态的数组
 *          |---ArrayList:作为list接口的主要实现类；线程不安全的，效率高；底层使用Object[]存储
 *          |---LinkedList:对于频繁的插入、删除操作，使用此类效率比ArrayList高；底层使用双向链表进行存储
 *          |---：作为list接口的古老实现类；线程安全的，效率低；底层使用Object[]存储
 *
 * 面试题：ArrayList、LinkedList、Vector三者的异同？
 *      相同：都是实现了list接口，存储数据的特点相同：存储有序的、可重复的数据
 *
 * 2.ArrayList的源码分析：
 * 2.1jdk7情况下
 *      ArrayList list=new ArrayList();//底层创建了长度是1a的0 bject[]数组eLementData
 *      List.add(123);//eLementData[e]new Integer(123)j
 *      List,add(11)/1如果此次的添加导致底层eLementData数组容量不够，则扩容。
 *      默认情况下，扩容为原来的容量的1,5倍，同时需要将原有数组中的数据复制到新的数组中。
 *      结论：建议开发中使用带参的构造器：ArrayList list=new Arraylist(int capacity)
 *
 * 2.2jdk8中ArrayList.的变化：
 *      ArrayList list=new ArrayList();//底层object[]eLementData初始化为{},并没有创建数组
 *      List.add(123);//第一次调用add()时，底层才创建了长度10的数组，并将数据123添加到elementData[0]中
 *
 * 2.3小结：jdk7中的ArrayList的对象的创建类似于单例的饿汉式，而列dk8中的ArrayList的对象的创建类似于单例的傲汉式，
 *          延迟了数组的创建，节省内存。
 *          
 * 3.LinkedList的源码分析：
 *          LinkedList list=new LinkedList();内部声明了Node类型的first和last属性，默认值为null
 *          List.add(123);//将123封装到Node中，创建了Node对象
 *          其中，Node定义为：体现了LinkedList的双向链表的说法
 *          private static cLass Node<E>{
 *          E item;
 *          Node<E>next;
 *          Node<E>prev;
 *
 *          Node(Node<E>prev,E element,Node<E>next){
 *          this.item element;
 *          this.next next;
 *          this.prev;
 *          }
 *        }
 *
 * 4.List中的常用方法
 *
 *
 * @Param:
 * @Author:
 * @Date:2022/4/24 20:27
 * @Version:1.0
 */
public class ListTest {
    /**
    *   void add(int index,Object ele):在index位置插入ele元素
        boolean addALL(int index,Collection eles):从index位置开始将eLes中的所有元素添加进来
        object get(int index):获取指定ndex位置的元素
        int indexof(Object obj):返回obj在集合中首次出现的位置
        int LastIndex0f(object obj):返回obj在当前集合中末次出现的位置
        object remove(int index),:移除指定index位置的元素，并返回此元素
        object set(int index,Object ele,):设置指定index位置的元素为ele
        ist sublist(int fromIndex,int toIndex):返回从fromIndex.到toIndex位置的子集合
        *
        * 总结：常用方法
                    增：add(Object obj)
                    remove(int index)/remove(object obj)
                    改：set(int index,object ele)
                    查：get(int index)
                    插：add(int index,Object ele)
                    长度：size()
                    遍历：①Iterator.送代器方式
                         ②增强断or循环
                         ③普通的循才
    * */
    @Test
    public void test(){
        ArrayList list=new ArrayList(10);
        list.add(0,"你好");
        for (Object l:list){
            System.out.println(l);
        }
    }

}
