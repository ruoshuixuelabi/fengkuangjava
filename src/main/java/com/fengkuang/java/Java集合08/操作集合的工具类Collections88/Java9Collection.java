package com.fengkuang.java.Java集合08.操作集合的工具类Collections88;

import java.util.*;

public class Java9Collection {
    public static void main(String[] args) {
        // 创建包含4个元素的Set集合
        var set = Set.of("Java", "Kotlin", "Go", "Swift");
        System.out.println(set);
        // 不可变集合，下面代码导致运行时错误
//		set.add("Ruby");
        // 创建包含4个元素的List集合
        var list = List.of(34, -25, 67, 231);
        System.out.println(list);
        // 不可变集合，下面代码导致运行时错误
//		list.remove(1);
        // 创建包含3组key-value对的Map集合
        var map = Map.of("语文", 89, "数学", 82, "英语", 92);
        System.out.println(map);
        // 不可变集合，下面代码导致运行时错误
//		map.remove("语文");
        // 使用Map.entry()方法显式构建key-value对
        var map2 = Map.ofEntries(Map.entry("语文", 89),
                Map.entry("数学", 82),
                Map.entry("英语", 92));
        System.out.println(map2);
    }
}