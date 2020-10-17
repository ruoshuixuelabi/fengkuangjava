package com.fengkuang.java.多线程16.控制线程164;
import java.util.*;
public class SleepTest {
    public static void main(String[] args)
            throws Exception {
        for (var i = 0; i < 10; i++) {
            System.out.println("当前时间: " + new Date());
            // 调用sleep方法让当前线程暂停1s。
            Thread.sleep(1000);
        }
    }
}