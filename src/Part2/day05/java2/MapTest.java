package Part2.day05.java2;

/**
 * 一、Map实现类的结构：
 * |---Map:双列数据，存款ey-value.对的数据,类似于高中的函数：y=f(x)
 *      |----HashMap:作为Map接口的主要实现类;线程不安全的；可以存储null的key和value
 *          |----LinkedHashMap:保证在遍历map元素时，可以按照添加的顺序实现遍历
 *                  原因：在原有的HashMap底层地方结构基础上，添加了一对指针，指向前一个和后一个元素
 *                  对于频繁的遍历操作，此类执行效率高于HashMap
 *      |----TreeMap:保证按照添加的key-value对进行排序，实现排序遍历。此时考虑key的自然排序或者定制排序。
 *                   底层使用红黑树
 *      |----Hashtable:Map古老的实现类；线程安全的，效率低，不能存储null的key和value
 *          |----Properties:常用来处理配置文件。key和value都是String类型
 *面试题：
 * 1.HashMap的底层实现原理？
 * 2.HashMap和Hashtable的异同？
 * 3.CurrentHashMap和Hashtable的异同？
 *
 * 二、Map结构的理解：
 *    Map中的key:无序的、不可重复的，使用Set存储所有的key  --->key所在的类要重写equals()和hashCode() (以HashMap为例)
 *    Map中的value:无序的、可重复的，使用Collection存储所有的value  --->value所在的类要重写equals()
 *    一个键值对：key-value构成了一个entry对象
 *    Map中的entry：无序的、不可重复的，使用Set存储所有的entry
 *
 * 三、HashMap,的底层实现原理？以jdk7为例说明：
 *      HashMap map new HashMap():
 *      在实例化以后，底层创建了长度是16的一维数组Entry[]table。
 *      map.put(key1,value1):
 *      首先，调用key1所在类hashCod()计算key1哈希值，此哈希值经过某种算法计算以后，得到在Entry数组中的存放位置。
 *      如果此位置上的数据为空，此时key1-value1添加成功。---情况1
 *      如果此位置上的数据不为空，（意味着此位置上存在一个或多个数据（以链表形式存在）)，比较key1和已经存在的一个或多个数据
 *      的哈希值：
 *          如果key1的哈希值与己经存在的数据的哈希值都不相同，此时key1-value1添加成功。---情况2
 *          如果key1的哈希值和己经存在的某一个数据(key2-value2)的哈希值相同，继续比较：调用key1所在类的equals(key2)
 *              如果equals()返回false:此时key1-value1添加成功 ---情况3
 *              如果equals()返回true:使用value1替换value2。
 *
 *        补充：关于情况2和情况3：此时key1-value1和原来的数据以链表的方式存储。
 *              在不断的添加过程中，会涉及到扩容问题，默认的扩容方式：扩容为原来容量的2倍，并将原有的数据复制过来。
 *
 *      jdk8相较于dk7在底层实现方面的不同：
 *          1.new HashMap():底层没有创建一个长度为16的数组
 *          2.jdk8底层的数组是：Node[],而非Entry[]
 *          3.首次调用即ut()方法时，底层创建长度为16的数组
 *          4.jdk7底层结构只有：数组+链表。jdk8中底层结构：数组+链表+红黑树。
 *          当数组的某一个索引位置上的元素以链表形式存在的数据个数 >8 且当前数组的长度 >64 时，
 *          此时此索引位置上的所有数据改为使用红黑树存储。
 *
 *
 *          DEFAULT INITIAL CAPACITY:HashMap的默认容量，16
 *          DEFAULT_LOAD_FACTOR:HashMap的默认加载因子：0.75
 *          threshold:扩容的临界值，=容量*填充因子：16*0.75=>12
 *          TREEIFY_THRESHOLD:Bucket中链表长度大于该默认值，转化为红黑树：8
 *          MIN_TREEIFY_CAPACITY:桶中Node被树化时最小hash表容量：64
 *
 * 四、LinkedHashMap的底层实现原理（了解）
 * 源码中：
 *          static cLass Entry<K,V>extends HashMap.Node<K,V>{
 *                  Entry<K,V>before,after;//能够记录添加的元素的先后顺序
 *          Entry(int hash,K key,V value,Node<k,V>next){
 *                  super(hash,key,value,next);
 *
 *                  }
 *              }
 *
 * @Param:
 * @Author:
 * @Date:2022/4/25 20:15
 * @Version:1.0
 */
public class MapTest {
}
