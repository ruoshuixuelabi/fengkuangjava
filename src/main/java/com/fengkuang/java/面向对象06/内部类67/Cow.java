package com.fengkuang.java.面向对象06.内部类67;

public class Cow {
    private double weight;

    // 外部类的两个重载的构造器
    public Cow() {
    }

    public Cow(double weight) {
        this.weight = weight;
    }

    // 定义一个非静态内部类
    private class CowLeg {
        // 非静态内部类的两个实例变量
        private double length;
        private String color;

        // 非静态内部类的两个重载的构造器
        public CowLeg() {
        }

        public CowLeg(double length, String color) {
            this.length = length;
            this.color = color;
        }

        // 下面省略length、color的setter和getter方法
        public void setLength(double length) {
            this.length = length;
        }

        public double getLength() {
            return this.length;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getColor() {
            return this.color;
        }

        // 非静态内部类的实例方法
        public void info() {
            System.out.println("当前牛腿颜色是："
                    + color + ", 高：" + length);
            // 直接访问外部类的private修饰的成员变量
            System.out.println("本牛腿所在奶牛重：" + weight);   // ①
        }
    }

    public void test() {
        var cl = new CowLeg(1.12, "黑白相间");
        cl.info();
    }

    public static void main(String[] args) {
        var cow = new Cow(378.9);
        cow.test();
    }
}