package com.fengkuang.java.面向对象06.枚举类69.best;
public enum Gender {
    // 此处的枚举值必须调用对应构造器来创建
    MALE("男"), FEMALE("女");
    private final String name;
    // 枚举类的构造器只能使用private修饰
    private Gender(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}