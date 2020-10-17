package com.fengkuang.java.面向对象06.对象与垃圾回收610;
import java.lang.ref.*;
public class ReferenceTest {
    public static void main(String[] args) throws Exception {
        // 创建一个字符串对象
        var str = new String("疯狂Java讲义");
        // 创建一个弱引用，让此弱引用引用到"疯狂Java讲义"字符串
        var wr = new WeakReference(str);  // ①
        // 切断str引用和"疯狂Java讲义"字符串之间的引用
        str = null;   // ②
        // 取出弱引用所引用的对象
        System.out.println(wr.get());  // ③
        // 强制垃圾回收
        System.gc();
        System.runFinalization();
        // 再次取出弱引用所引用的对象
        System.out.println(wr.get());  // ④
    }
}