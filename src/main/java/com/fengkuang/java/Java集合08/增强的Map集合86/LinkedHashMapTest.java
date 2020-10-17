package com.fengkuang.java.Java集合08.增强的Map集合86;
import java.util.*;
public class LinkedHashMapTest {
    public static void main(String[] args) {
        var scores = new LinkedHashMap();
        scores.put("语文", 80);
        scores.put("英文", 82);
        scores.put("数学", 76);
        // 调用forEach方法遍历scores里的所有key-value对
        scores.forEach((key, value) -> System.out.println(key + "-->" + value));
    }
}