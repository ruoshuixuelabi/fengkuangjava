package com.fengkuang.java.多线程16.线程同步165.synchronizedMethod;
public class DrawTest {
    public static void main(String[] args) {
        // 创建一个账户
        var acct = new Account("1234567", 1000);
        // 模拟两个线程对同一个账户取钱
        new DrawThread("甲", acct, 800).start();
        new DrawThread("乙", acct, 800).start();
    }
}