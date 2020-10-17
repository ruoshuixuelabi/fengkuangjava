package com.fengkuang.java.Java集合08.Set集合83;

import java.util.*;

enum Season {
    SPRING, SUMMER, FALL, WINTER
}

public class EnumSetTest {
    public static void main(String[] args) {
        // 创建一个EnumSet集合，集合元素就是Season枚举类的全部枚举值
        var es1 = EnumSet.allOf(Season.class);
        System.out.println(es1); // 输出[SPRING, SUMMER, FALL, WINTER]
        // 创建一个EnumSet空集合，指定其集合元素是Season类的枚举值。
        var es2 = EnumSet.noneOf(Season.class);
        System.out.println(es2); // 输出[]
        // 手动添加两个元素
        es2.add(Season.WINTER);
        es2.add(Season.SPRING);
        System.out.println(es2); // 输出[SPRING, WINTER]
        // 以指定枚举值创建EnumSet集合
        var es3 = EnumSet.of(Season.SUMMER, Season.WINTER);
        System.out.println(es3); // 输出[SUMMER, WINTER]
        var es4 = EnumSet.range(Season.SUMMER, Season.WINTER);
        System.out.println(es4); // 输出[SUMMER, FALL, WINTER]
        // 新创建的EnumSet集合的元素和es4集合的元素有相同类型，
        // es5的集合元素 + es4集合元素 = Season枚举类的全部枚举值
        var es5 = EnumSet.complementOf(es4);
        System.out.println(es5); // 输出[SPRING]
    }
}
