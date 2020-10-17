package com.fengkuang.java.多线程16.线程的创建和启动162;
/**
 * 通过实现Runnable接口来创建线程类
 * @author mzk
 */
public class SecondThread implements Runnable {
    private int i;
    /**
     * run方法同样是线程执行体
     */
    @Override
    public void run() {
        for (; i < 100; i++) {
            // 当线程类实现Runnable接口时，
            // 如果想获取当前线程，只能用Thread.currentThread()方法。
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
    public static void main(String[] args) {
        for (var i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 20) {
                var st = new SecondThread();     // ①
                // 通过new Thread(target, name)方法创建新线程
                new Thread(st, "新线程1").start();
                new Thread(st, "新线程2").start();
            }
        }
    }
}