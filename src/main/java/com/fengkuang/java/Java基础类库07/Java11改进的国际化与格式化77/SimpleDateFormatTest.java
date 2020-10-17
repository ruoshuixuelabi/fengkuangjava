package com.fengkuang.java.Java基础类库07.Java11改进的国际化与格式化77;
import java.text.*;
import java.util.*;
public class SimpleDateFormatTest {
    public static void main(String[] args) throws ParseException {
        var d = new Date();
        // 创建一个SimpleDateFormat对象
        var sdf1 = new SimpleDateFormat("Gyyyy年中第D天");
        // 将d格式化成日期，输出：公元2017年中第282天
        var dateStr = sdf1.format(d);
        System.out.println(dateStr);
        // 一个非常特殊的日期字符串
        var str = "14###3月##21";
        var sdf2 = new SimpleDateFormat("y###MMM##d");
        // 将日期字符串解析成日期，输出：Fri Mar 21 00:00:00 CST 2014
        System.out.println(sdf2.parse(str));
    }
}