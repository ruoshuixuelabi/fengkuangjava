package com.fengkuang.java.面向对象06.Java11增强的Lambda表达式68;
@interface NotNull {
}
interface Predator {
    void prey(@NotNull String animal);
}
public class VarInLambda {
    public static void main(String[] args) {
        // 使用Lambda表达式对var变量赋值
        // 必须显式指定Lambda表达式的目标类型
        var run = (Runnable) () -> {
            for (var i = 0; i < 100; i++) {
                System.out.println();
            }
        };
        // 使用var声明Lambda表达式的形参类型，
        // 这样即可为Lambda表达式的形参添加@NotNull注解
        Predator predator = (@NotNull var animal) -> {
            System.out.println("老鹰正在猎捕" + animal);
        };
        predator.prey("兔子");
    }
}