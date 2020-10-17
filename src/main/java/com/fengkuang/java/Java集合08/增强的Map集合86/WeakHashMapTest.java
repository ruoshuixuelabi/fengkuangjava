package com.fengkuang.java.Java集合08.增强的Map集合86;
import java.util.*;
public class WeakHashMapTest {
    public static void main(String[] args) {
        var whm = new WeakHashMap();
        // 将WeakHashMap中添加三个key-value对，
        // 三个key都是匿名字符串对象（没有其他引用）
        whm.put(new String("语文"), new String("良好"));
        whm.put(new String("数学"), new String("及格"));
        whm.put(new String("英文"), new String("中等"));
        //将 WeakHashMap中添加一个key-value对，
        // 该key是一个系统缓存的字符串对象。
        whm.put("java", new String("中等"));    // ①
        // 输出whm对象，将看到4个key-value对。
        System.out.println(whm);
        // 通知系统立即进行垃圾回收
        System.gc();
        System.runFinalization();
        // 通常情况下，将只看到一个key-value对。
        System.out.println(whm);
    }
}