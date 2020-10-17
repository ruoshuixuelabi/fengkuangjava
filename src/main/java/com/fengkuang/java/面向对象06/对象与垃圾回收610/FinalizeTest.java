package com.fengkuang.java.面向对象06.对象与垃圾回收610;

public class FinalizeTest {
    private static FinalizeTest ft = null;

    public void info() {
        System.out.println("测试资源清理的finalize方法");
    }

    public static void main(String[] args) throws Exception {
        // 创建FinalizeTest对象立即进入可恢复状态
        new FinalizeTest();
        // 通知系统进行资源回收
//        System.gc();  // ①
        // 强制垃圾回收机制调用可恢复对象的finalize()方法
//		Runtime.getRuntime().runFinalization();   // ②
        System.runFinalization();   // ③
        ft.info();
    }

    public void finalize() {
        // 让ft引用到试图回收的可恢复对象，即可恢复对象重新变成可达
        ft = this;
    }
}