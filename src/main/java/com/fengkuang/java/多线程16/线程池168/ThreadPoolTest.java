package com.fengkuang.java.多线程16.线程池168;
import java.util.concurrent.*;
public class ThreadPoolTest {
    public static void main(String[] args) throws Exception {
        // 创建足够的线程来支持4个CPU并行的线程池
        // 创建一个具有固定线程数（6）的线程池
        ExecutorService pool = Executors.newFixedThreadPool(6);
        // 使用Lambda表达式创建Runnable对象
        Runnable target = () -> {
            for (var i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "的i值为:" + i);
            }
        };
        // 向线程池中提交两个线程
        pool.submit(target);
        pool.submit(target);
        // 关闭线程池
        pool.shutdown();
    }
}