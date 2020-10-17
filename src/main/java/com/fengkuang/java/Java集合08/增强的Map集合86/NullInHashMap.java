package com.fengkuang.java.Java集合08.增强的Map集合86;
import java.util.*;
public class NullInHashMap {
    public static void main(String[] args) {
        var hm = new HashMap();
        // 试图将两个key为null的key-value对放入HashMap中
        hm.put(null, null);
        hm.put(null, null);    // ①
        // 将一个value为null的key-value对放入HashMap中
        hm.put("a", null);    // ②
        // 输出Map对象
        System.out.println(hm);
    }
}