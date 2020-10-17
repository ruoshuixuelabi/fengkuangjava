package com.fengkuang.java.Java集合08.操作集合的工具类Collections88;
import java.util.*;
public class UnmodifiableTest {
    public static void main(String[] args) {
        // 创建一个空的、不可改变的List对象
        var unmodifiableList = Collections.emptyList();
        // 创建一个只有一个元素，且不可改变的Set对象
        var unmodifiableSet = Collections.singleton("疯狂Java讲义");
        // 创建一个普通Map对象
        var scores = new HashMap();
        scores.put("语文", 80);
        scores.put("Java", 82);
        // 返回普通Map对象对应的不可变版本
        var unmodifiableMap = Collections.unmodifiableMap(scores);
        // 下面任意一行代码都将引发UnsupportedOperationException异常
        unmodifiableList.add("测试元素");   // ①
        unmodifiableSet.add("测试元素");    // ②
        unmodifiableMap.put("语文", 90);   // ③
    }
}