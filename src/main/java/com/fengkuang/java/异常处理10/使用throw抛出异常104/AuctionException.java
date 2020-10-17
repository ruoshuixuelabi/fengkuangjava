package com.fengkuang.java.异常处理10.使用throw抛出异常104;
public class AuctionException extends Exception {
    // 无参数的构造器
    public AuctionException() {
    }       // ①

    // 带一个字符串参数的构造器
    public AuctionException(String msg)    // ②
    {
        super(msg);
    }
}