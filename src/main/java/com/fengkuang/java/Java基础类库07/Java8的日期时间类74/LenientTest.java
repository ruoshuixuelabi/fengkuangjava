package com.fengkuang.java.Java基础类库07.Java8的日期时间类74;
import java.util.*;

import static java.util.Calendar.*;
public class LenientTest {
    public static void main(String[] args) {
        var cal = Calendar.getInstance();
        // 结果是YEAR字段加1，MONTH字段为1（二月）
        cal.set(MONTH, 13);   // ①
        System.out.println(cal.getTime());
        // 关闭容错性
        cal.setLenient(false);
        // 导致运行时异常
        cal.set(MONTH, 13);   // ②
        System.out.println(cal.getTime());
    }
}