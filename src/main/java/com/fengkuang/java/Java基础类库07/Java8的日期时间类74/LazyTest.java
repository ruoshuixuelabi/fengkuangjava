package com.fengkuang.java.Java基础类库07.Java8的日期时间类74;
import java.util.*;

import static java.util.Calendar.*;
public class LazyTest {
    public static void main(String[] args) {
        var cal = Calendar.getInstance();
        cal.set(2003, 7, 31);  // 2003-8-31
        // 将月份设为9，但9月31日不存在。
        // 如果立即修改，系统将会把cal自动调整到10月1日。
        cal.set(MONTH, 8);
        // 下面代码输出10月1日
//		System.out.println(cal.getTime());    // ①
        // 设置DATE字段为5
        cal.set(DATE, 5);    // ②
        System.out.println(cal.getTime());    // ③
    }
}