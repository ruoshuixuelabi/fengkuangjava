package com.fengkuang.java.注解Annotation14.基本注解141;

class Apple1 {
    /**
     * 定义info方法已过时
     * since属性指定从哪个版本开始，forRemoval指定该API将来会被删除
     */
    @Deprecated(since = "9", forRemoval = true)
    public void info() {
        System.out.println("Apple的info方法");
    }
}

/**
 * @author mzk
 */
public class DeprecatedTest {
    public static void main(String[] args) {
        // 下面使用info方法时将会被编译器警告
        new Apple().info();
    }
}