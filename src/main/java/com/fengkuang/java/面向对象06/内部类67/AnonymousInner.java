package com.fengkuang.java.面向对象06.内部类67;

abstract class Device {
    private String name;

    public abstract double getPrice();

    public Device() {
    }

    public Device(String name) {
        this.name = name;
    }

    // 此处省略了name的setter和getter方法
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

public class AnonymousInner {
    public void test(Device d) {
        System.out.println("购买了一个" + d.getName()
                + "，花掉了" + d.getPrice());
    }

    public static void main(String[] args) {
        var ai = new AnonymousInner();
        // 调用有参数的构造器创建Device匿名实现类的对象
        ai.test(new Device("电子示波器") {
            @Override
            public double getPrice() {
                return 67.8;
            }
        });
        // 调用无参数的构造器创建Device匿名实现类的对象
        var d = new Device() {
            // 初始化块
            {
                System.out.println("匿名内部类的初始化块...");
            }

            // 实现抽象方法
            @Override
            public double getPrice() {
                return 56.2;
            }

            // 重写父类的实例方法
            @Override
            public String getName() {
                return "键盘";
            }
        };
        ai.test(d);
    }
}