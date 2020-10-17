package com.fengkuang.java.面向对象05.类的继承56;
class Parent {
    public String tag = "疯狂Java讲义";         // ①
}
class Derived extends Parent {
    // 定义一个私有的tag实例变量来隐藏父类的tag实例变量
    private String tag = "轻量级Java EE企业应用实战";         // ②
}
public class HideTest {
    public static void main(String[] args) {
        var d = new Derived();
        // 程序不可访问d的私有变量tag，所以下面语句将引起编译错误
//		 System.out.println(d.tag);         // ③
        // 将d变量显式地向上转型为Parent后，即可访问tag实例变量
        // 程序将输出：“疯狂Java讲义”
        System.out.println(((Parent) d).tag);         // ④
    }
}