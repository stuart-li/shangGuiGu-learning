package Part2.day04.java;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * 一、说明：JaVa中的对象，正常情况下，只能进行比较：=或！=。不能使用>或<的 但是在开发场景中，我们需要对多个对象进行排序，
 * 言外之意，就需要比较对象的大小。
 * 如何实现？使用两个接口中的任何一个：ComparabLe或Comparator
 *
 * 二、
 * @Param:
 * @Author:
 * @Date:2022/4/20 19:13
 * @Version:1.0
 */
public class CompareTest {

    /**
    * ComparabLe接口的使用举例：
    1.像string、包装类等实现了ComparabLe:接口，重写了compare To(obj)方法，给出了比较两个对象重写后的方法
    2.像String、包装类重写compareTo()方法后，进行了从小到大的排列
    3.重写compareTo(obj)的规则：
    如果当前对家this大于形参矿象obj,
    则返回正整数，
    如果当前象this小于形参对象obj,
    则返回负整故，
    如果当前对象this等于形参对象obj,则返回零。
     4.对于自定义类来说，如果需要排序，我们可以让自定义类实现Comparable接口，重写compareTo(obj)方法,在compareTo(obj)中指明如何排序
    * */
    @Test
    public void test1(){
        String[] arr=new String[]{"DD","GG","BB","CC","AA"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    @Test
    public void test2(){
        Goods[] arr=new Goods[5];
        arr[0]=new Goods("联想",99);
        arr[1]=new Goods("华为",34);
        arr[2]=new Goods("小米",65);
        arr[3]=new Goods("苹果",33);
        arr[4]=new Goods("锤子",34);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    /*
    * Comparator.接口的使用：定制排序
    1,背景：
    当元素的类型没有实现ava.Lang.ComparabLe接口而又不方便修改代码，或者实现了java,Lang.Comparable:接口的排序规则不适合当前的操作，
    那么可以考虑使用Comparator的对象来排序
    * 2.重写compare(Object o1,Object o2)方法，比较o1和o2的大小：
        如果方法返回正整数，则表示o1大于o2:
        如果返回0，表示相等：
        返回负整数，表示o1小于o2。
    * */
    @Test
    public void test3(){
        String[] arr=new String[]{"DD","GG","BB","CC","AA"};
        Arrays.sort(arr, new Comparator<String>() {
            //按照字符串从大到小的顺序排列
            @Override
            public int compare(String o1, String o2) {
                if (o1 instanceof String&&o2 instanceof String){
                    String s1=(String)o1;
                    String s2=(String)o2;
                    return -s1.compareTo(s2);
                }
                throw new RuntimeException("传入的参数有错误");
            }
        });
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test4(){
        Goods[] arr=new Goods[5];
        arr[0]=new Goods("联想",99);
        arr[1]=new Goods("华为",34);
        arr[2]=new Goods("小米",65);
        arr[3]=new Goods("苹果",33);
        arr[4]=new Goods("锤子",34);

        Arrays.sort(arr, new Comparator() {
            //根据商品名称从低到高排序，再根据价格从高到低排序
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Goods&&o2 instanceof Goods){
                    Goods g1=(Goods)o1;//强转数据类型
                    Goods g2=(Goods)o2;
                    if (g1.getName().equals(g2.getName())){//判断两个商品名字是不是相同
                        return -Double.compare(g1.getPrice(),g2.getPrice());//比较两个商品的价格
                    }else {
                        return g1.getName().compareTo(g2.getName());//比较两个商品的名字
                    }
                }
                throw new RuntimeException("传入的参数有误");
            }
        });

        System.out.println(Arrays.toString(arr));
    }
}
