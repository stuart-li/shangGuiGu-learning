package Part2.day04.java;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

/**
 *
 * jdk8的时间日期API测试
 * @Param:
 * @Author:
 * @Date:2022/4/19 19:23
 * @Version:1.0
 */
public class Jdk8DateTimeTest {
    @Test
    public void testDate(){
        //偏移量
        Date date = new Date(2020-1900,9-1,20);
        System.out.println(date);
    }

    /*
    * LocalDate LocalTime LocalDateTime的使用
    * */
    @Test
    public void test1(){
        //now():获取当前日期、时间、日期+时间
        LocalDate localDate=LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        //of():设置指定的年月日 是分秒 是没有偏移量的
        LocalDateTime localDateTime1 = LocalDateTime.of(2020, 12, 31, 13, 23, 50);
        System.out.println(localDateTime1);

        //getXxx：获取相关的属性
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getYear());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getMonthValue());

        //withXxx:设置相关的属性
        //localDate的不可变性
        LocalDate localDate1 = localDate.withDayOfMonth(22);
        System.out.println(localDate);
        System.out.println(localDate1);

        //plusXxxx:
        LocalDateTime localDateTime2 = localDateTime.plusMonths(3);//在现有的基础上加3个月
        System.out.println(localDateTime);
        System.out.println(localDateTime2);

        LocalDateTime localDateTime3 = localDateTime.minusDays(9);//在原来基础上减9天
        System.out.println(localDateTime);
        System.out.println(localDateTime3);
    }

    /*
    * Instant的使用
    * */
    @Test
    public void test2(){
        //now()获取本初子午线对应的标准时间
        Instant instant = Instant.now();
        System.out.println(instant);//本初子午线的时间，伦敦时间

        //添加时间偏移量
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));//加时区，东8区，北京时间
        System.out.println(offsetDateTime);

        //toEpochSecond():获取自1970年1月1日0时0分0秒（UTC）开始的毫秒数
        long l1 = instant.toEpochMilli();
        System.out.println(l1);
        long l2 = offsetDateTime.toEpochSecond();
        System.out.println(l2);

        //ofEpochMilli(1650370018434L):通过给定毫秒数获取Instant实例
        Instant instant1 = Instant.ofEpochMilli(1650370018434L);
        System.out.println(instant1);
    }

    /*
    * DateTimeFormatter:格式化或解析日期时间
    * 类似于SimpleDateFormat
    * */
    @Test
    public void test3(){
        //预定义的标准格式，如：ISO_LOCAL_DATE_TIME;ISO_LOCAL_DATE;ISO_LOCAL_TIME
        DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ISO_DATE_TIME;
        //格式化：日期-->字符串
        LocalDateTime localDateTime = LocalDateTime.now();
        String str1 = dateTimeFormatter.format(localDateTime);
        System.out.println(localDateTime);
        System.out.println(str1);

        //解析：字符串-->日期
        TemporalAccessor parse = dateTimeFormatter.parse("2022-04-19T21:21:34.669");
        System.out.println(parse);

        //本地化相关的格式，如：ofLocalizedDateTime(FormatStyle.LONG)

        //重点：自定义的格式，如：ofPattern("yyyy-MM-dd hh:mm:ss E")
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String str2 = dateTimeFormatter1.format(LocalDateTime.now());
        System.out.println(str2);

        //解析
        TemporalAccessor parse1 = dateTimeFormatter1.parse("2022-04-19 09:32:07");
        System.out.println(parse1);
    }
}
