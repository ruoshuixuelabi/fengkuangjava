package com.fengkuang.java.面向对象05.初始化块59;
public class InstanceInitTest {
    // 先执行实例初始化块将a实例变量赋值为6
    {
        a = 6;
    }
    // 再执行将a实例变量赋值为9
    int a = 9;
    public static void main(String[] args) {
        // 下面代码将输出9。
        System.out.println(new InstanceInitTest().a);
    }
}