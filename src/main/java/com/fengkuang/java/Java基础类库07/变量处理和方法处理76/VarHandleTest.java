package com.fengkuang.java.Java基础类库07.变量处理和方法处理76;
import java.lang.invoke.*;
import java.util.Arrays;
class User {
    String name;
    static int MAX_AGE;
}
/**
 * 下面程序示范了VarHandle的用法。
 * @author mzk
 */
public class VarHandleTest {
    public static void main(String[] args) throws Throwable {
        var sa = new String[]{"Java", "Kotlin", "Go"};
        // 获取一个String[]数组的VarHandle对象
        var avh = MethodHandles.arrayElementVarHandle(String[].class);
        // 比较并设置：如果第三个元素是Go，则该元素被设为Lua
        var r = avh.compareAndSet(sa, 2, "Go", "Lua");
        // 输出比较结果
        System.out.println(r); // 输出true
        // 看到第三个元素被替换成Lua
        System.out.println(Arrays.toString(sa));
        // 获取sa数组的第二个元素
        System.out.println(avh.get(sa, 1)); // 输出Kotlin
        // 获取并设置：返回第三个元素，并将第三个元素设为Swift
        System.out.println(avh.getAndSet(sa, 2, "Swift"));
        // 看到第三个元素被替换成Swift
        System.out.println(Arrays.toString(sa));
        // 用findVarHandle方法获取User类中名为name，
        // 类型为String的实例变量
        var vh1 = MethodHandles.lookup().findVarHandle(User.class, "name", String.class);
        var user = new User();
        // 通过VarHandle获取实例变量的值，需要传入对象作为调用者
        System.out.println(vh1.get(user)); // 输出null
        // 通过VarHandle设置指定实例变量的值
        vh1.set(user, "孙悟空");
        // 输出user的name实例变量的值
        System.out.println(user.name); // 输出孙悟空
        // 用findVarHandle方法获取User类中名为MAX_AGE，
        // 类型为Integer的类变量
        var vh2 = MethodHandles.lookup().findStaticVarHandle(User.class, "MAX_AGE", int.class);
        // 通过VarHandle获取指定类变量的值
        System.out.println(vh2.get()); // 输出0
        // 通过VarHandle设置指定类变量的值
        vh2.set(100);
        // 输出User的MAX_AGE类变量
        System.out.println(User.MAX_AGE); // 输出100
    }
}