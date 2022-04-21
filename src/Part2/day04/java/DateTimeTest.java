package Part2.day04.java;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Test;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * idk 8之前 的日期时间的API测试
 * 1.System类中的currentTimeMillis();
 * 2.java.util.Date和子类java.sql.Date
 * 3.SimpleDateFormat
 * 4.Calendar
 *
 * @Param:
 * @Author:
 * @Date:2022/4/19 18:38
 * @Version:1.0
 */
public class DateTimeTest {
    /**
     * SimpleDateFormat的使用：SimpleDateFormat对日期Date类的格式化和解析
     * 1.两个操作
     * 1.1 格式化：日期-->字符串
     * 1.2 解析：字符串-->日期
     *
     * 2.SimpleDateFormat实例化
     * */
    @Test
    public void testSimpleDateFormat() throws ParseException {
        //实例化：SimpleDateFormat默认构造器
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date date=new Date();
        //格式化 日期--->字符串
        String format=sdf.format(date);
        System.out.println(format);

        //解析：字符串-->日期
        String str="20-12-19 下午6:50";
        Date date1=sdf.parse(str);
        System.out.println(date1);
        System.out.println("***************************");

        //按照指定的格式进行格式化和解析，使用带参的构造器
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date2=new Date();
        String format1=sdf1.format(date2);
        System.out.println(format1);
    }

    /**
     * Calendar日历类的使用
     * */
    @Test
    public void testCalendar(){
        //1.实例化
        //方式一：创建其子类（GregorianCalendar）的对象
        //方式二：调用其静态方法getInstance()
        Calendar calendar=Calendar.getInstance();

        //常用方法
        //get()
        int day = calendar.get(Calendar.DAY_OF_MONTH);//这个月的第几天
        System.out.println(day);
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

        //set()
        calendar.set(Calendar.DAY_OF_MONTH,30);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

        //add()
        calendar.add(Calendar.DAY_OF_MONTH,-3);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

        //getTime():日历类-->日期
        Date date = calendar.getTime();
        System.out.println(date);

        //steTime()
        Date date1 = new Date();
        calendar.setTime(date1);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

    }
}
