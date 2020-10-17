package com.fengkuang.java.Java集合08.Set集合83;

import java.util.*;

public class EnumSetTest2 {
    public static void main(String[] args) {
        var c = new HashSet();
        c.clear();
        c.add(Season.FALL);
        c.add(Season.SPRING);
        // 复制Collection集合中所有元素来创建EnumSet集合
        var enumSet = EnumSet.copyOf(c);   // ①
        System.out.println(enumSet); // 输出[SPRING, FALL]
        c.add("疯狂Java讲义");
        c.add("轻量级Java EE企业应用实战");
        // 下面代码出现异常：因为c集合里的元素不是全部都为枚举值
        enumSet = EnumSet.copyOf(c);  // ②
    }
}
