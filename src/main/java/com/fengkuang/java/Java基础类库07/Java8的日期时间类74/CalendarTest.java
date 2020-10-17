package com.fengkuang.java.Java基础类库07.Java8的日期时间类74;
import java.util.*;

import static java.util.Calendar.*;
public class CalendarTest {
    public static void main(String[] args) {
        var c = Calendar.getInstance();
        // 取出年
        System.out.println(c.get(YEAR));
        // 取出月份
        System.out.println(c.get(MONTH));
        // 取出日
        System.out.println(c.get(DATE));
        // 分别设置年、月、日、小时、分钟、秒
        c.set(2003, 10, 23, 12, 32, 23); //2003-11-23 12:32:23
        System.out.println(c.getTime());
        // 将Calendar的年前推1年
        c.add(YEAR, -1); //2002-11-23 12:32:23
        System.out.println(c.getTime());
        // 将Calendar的月前推8个月
        c.roll(MONTH, -8); //2002-03-23 12:32:23
        System.out.println(c.getTime());
        var cal1 = Calendar.getInstance();
        cal1.set(2003, 7, 23, 0, 0, 0); // 2003-8-23
        cal1.add(MONTH, 6); //2003-8-23 => 2004-2-23
        System.out.println(cal1.getTime());
        var cal2 = Calendar.getInstance();
        cal2.set(2003, 7, 31, 0, 0, 0); // 2003-8-31
        // 因为进位到后月份改为2月，2月没有31日，自动变成29日
        cal2.add(MONTH, 6); // 2003-8-31 => 2004-2-29
        System.out.println(cal2.getTime());
        var cal3 = Calendar.getInstance();
        cal3.set(2003, 7, 23, 0, 0, 0); //2003-8-23
        // MONTH字段“进位”，但YEAR字段并不增加
        cal3.roll(MONTH, 6); //2003-8-23 => 2003-2-23
        System.out.println(cal3.getTime());
        var cal4 = Calendar.getInstance();
        cal4.set(2003, 7, 31, 0, 0, 0); //2003-8-31
        // MONTH字段“进位”后变成2，2月没有31日，
        // YEAR字段不会改变，2003年2月只有28天
        cal4.roll(MONTH, 6); //2003-8-31 => 2003-2-28
        System.out.println(cal4.getTime());
    }
}