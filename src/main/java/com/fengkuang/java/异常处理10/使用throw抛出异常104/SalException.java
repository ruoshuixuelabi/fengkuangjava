package com.fengkuang.java.异常处理10.使用throw抛出异常104;
public class SalException extends Exception {
    public SalException() {
    }
    public SalException(String msg) {
        super(msg);
    }
    // 创建一个可以接受Throwable参数的构造器
    public SalException(Throwable t) {
        super(t);
    }
}