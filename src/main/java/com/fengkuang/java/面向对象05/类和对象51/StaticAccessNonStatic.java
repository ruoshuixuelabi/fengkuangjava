package com.fengkuang.java.面向对象05.类和对象51;

public class StaticAccessNonStatic {
    public void info() {
        System.out.println("简单的info方法");
    }

    public static void main(String[] args) {
        // 因为main()方法是静态方法，而info()是非静态方法，
        // 调用main()方法的是该类本身，而不是该类的实例，
        // 因此省略的this无法指向有效的对象
//        info();
//		// 创建一个对象作为调用者来调用info()方法
//		new StaticAccessNonStatic().info();
    }
}