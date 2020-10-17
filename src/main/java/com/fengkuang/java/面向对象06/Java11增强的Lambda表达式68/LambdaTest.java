package com.fengkuang.java.面向对象06.Java11增强的Lambda表达式68;
@FunctionalInterface
interface FkTest {
    void run();
}
public class LambdaTest {
    public static void main(String[] args) {
        // Runnable接口中只包含一个无参数的方法
        // Lambda表达式代表的匿名方法实现了Runnable接口中唯一的、无参数的方法
        // 因此下面的Lambda表达式创建了一个Runnable对象
        Runnable r = () -> {
            for (var i = 0; i < 100; i++) {
                System.out.println(i);
            }
        };
//		// 下面代码报错: 不兼容的类型: Object不是函数接口
//		Object obj = () -> {
//			for (var i = 0; i < 100; i++)
//			{
//				System.out.println(i);
//			}
//		};

        Object obj1 = (Runnable) () -> {
            for (var i = 0; i < 100; i++) {
                System.out.println(i);
            }
        };
        // 同样的Lambda表达式可以被当成不同的目标类型，唯一的要求是：
        // Lambda表达式的形参列表与函数式接口中唯一的抽象方法的形参列表相同
        Object obj2 = (FkTest) () -> {
            for (var i = 0; i < 100; i++) {
                System.out.println();
            }
        };
    }
}