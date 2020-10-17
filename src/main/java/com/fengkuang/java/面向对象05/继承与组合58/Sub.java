package com.fengkuang.java.面向对象05.继承与组合58;
class Base {
    public Base() {
        test();
    }
    public void test()           // ①号test()方法
    {
        System.out.println("将被子类重写的方法");
    }
}
public class Sub extends Base {
    private String name;
    public void test()         // ②号test()方法
    {
        System.out.println("子类重写父类的方法，"
                + "其name字符串长度" + name.length());
    }
    public static void main(String[] args) {
        // 下面代码会引发空指针异常
        var s = new Sub();
    }
}