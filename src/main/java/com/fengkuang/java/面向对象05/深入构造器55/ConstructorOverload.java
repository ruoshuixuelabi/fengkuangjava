package com.fengkuang.java.面向对象05.深入构造器55;
public class ConstructorOverload {
    public String name;
    public int count;
    // 提供无参数的构造器
    public ConstructorOverload() {
    }
    // 提供带两个参数的构造器，
    // 对该构造器返回的对象执行初始化
    public ConstructorOverload(String name, int count) {
        this.name = name;
        this.count = count;
    }
    public static void main(String[] args) {
        // 通过无参数构造器创建ConstructorOverload对象
        var oc1 = new ConstructorOverload();
        // 通过有参数构造器创建ConstructorOverload对象
        var oc2 = new ConstructorOverload("轻量级Java EE企业应用实战", 300000);
        System.out.println(oc1.name + " " + oc1.count);
        System.out.println(oc2.name + " " + oc2.count);
    }
}