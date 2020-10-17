package com.fengkuang.java.多线程16.线程的生命周期163;
public class InvokeRun extends Thread {
    private int i;
    // 重写run方法，run方法的方法体就是线程执行体
    @Override
    public void run() {
        for (; i < 100; i++) {
            // 直接调用run方法时，Thread的this.getName返回的是该对象名字，
            // 而不是当前线程的名字。
            // 使用Thread.currentThread().getName()总是获取当前线程名字
            System.out.println(Thread.currentThread().getName() + " " + i);   // ①
        }
    }
    public static void main(String[] args) {
        for (var i = 0; i < 100; i++) {
            // 调用Thread的currentThread方法获取当前线程
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 20) {
                // 直接调用线程对象的run方法，
                // 系统会把线程对象当成普通对象，run方法当成普通方法，
                // 所以下面两行代码并不会启动两条线程，而是依次执行两个run方法
                new InvokeRun().run();
                new InvokeRun().run();
            }
        }
    }
}