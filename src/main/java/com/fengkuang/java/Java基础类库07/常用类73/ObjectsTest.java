package com.fengkuang.java.Java基础类库07.常用类73;
import java.util.Objects;
public class ObjectsTest {
    // 定义一个obj变量，它的默认值是null
    static ObjectsTest obj;
    public static void main(String[] args) {
        // 输出一个null对象的hashCode值，输出0
        System.out.println(Objects.hashCode(obj));
        // 输出一个null对象的toString，输出null
        System.out.println(Objects.toString(obj));
        // 要求obj不能为null，如果obj为null则引发异常
        System.out.println(Objects.requireNonNull(obj, "obj参数不能是null！"));
    }
}