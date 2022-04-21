package Part2.day05.java2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * 一、集合框架的概述
 * *1,集合、数组都是对多个数据进行存储操作的结构，简称java容器。
 * 说明：此时的存储，主要指的是内存层面的存储，不涉及到特久化的存储(.txt,·g,·av1,数据库中的数据）
 * 2.1数组在存储多个数据方面的特点：
 * >一旦初始化以后，其长度就确定了。
 * >数组一旦定义好，其元素的类型也就确定了。我们也就只能操作指定类型的数据了。
 * 比如：String[]arr;int[]arr1;Object[]arr2;
 * 2,2数组在存储多个数据方面的缺点：
 * >一且初始化以后，其长度就不可修改。
 * >数组中提供的方法非常有限，对于添加、别除、插入数据等操作，非常不便，同时效率不高。
 * >获取数组中实际元素的个数的需求，数组没有现成的属性或方法可用
 * >数组存储数据的特点：有序、可重复。对于无序、不可重复的需求。不能满足
 *
 * 二、集合框架
 * |----ColLection接口：单列集合，用来存储一个一个的对象
 *      |---List接口：存储有序的、可重复的数据。-->动态的数组
 *          |---ArrayList、LinkedList、Vector
 *      |--Set接口：存储无序的、不可重复的数据 -->高中讲的“集合”
 *          |---HashSet、LinkedHashset、TreeSet
 * |--Map接口：双列樂合，用来存储一对(key·value)一对的数据->高中函数：y=f(x)
 *      |---HashMap、LinkedHashMap、TreeMap、Hashtable、Properties
 *
 * 三、Collection接口的实现的方法
 *
 * @Param:
 * @Author:
 * @Date:2022/4/21 20:27
 * @Version:1.0
 */
public class CollectionTest {

    @Test
    public void test1(){
        Collection collection=new ArrayList();
        //add(Object e):将元素e添加到集合collection中
        collection.add("AA");
        collection.add("BB");
        collection.add(123);//自动装箱
        collection.add(new Date());
        //size()：获取集合的个数
        System.out.println(collection.size());

        //addAll():将另外一个集合添加到另一个集合中，元素数量累加
        Collection collection1=new ArrayList();
        collection1.add("DD");
        collection1.add(456);
        collection.addAll(collection1);
        System.out.println(collection.size());

        //clear():清空集合元素
        collection.clear();

        //isEmpty():判断集合是否为空
        System.out.println(collection.isEmpty());
    }
}
