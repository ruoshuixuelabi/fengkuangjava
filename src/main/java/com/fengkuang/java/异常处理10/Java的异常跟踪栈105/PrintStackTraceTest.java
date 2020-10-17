package com.fengkuang.java.异常处理10.Java的异常跟踪栈105;
class SelfException extends RuntimeException {
    SelfException() {
    }
    SelfException(String msg) {
        super(msg);
    }
}
public class PrintStackTraceTest {
    public static void main(String[] args) {
        firstMethod();
    }
    public static void firstMethod() {
        secondMethod();
    }
    public static void secondMethod() {
        thirdMethod();
    }
    public static void thirdMethod() {
        throw new SelfException("自定义异常信息");
    }
}