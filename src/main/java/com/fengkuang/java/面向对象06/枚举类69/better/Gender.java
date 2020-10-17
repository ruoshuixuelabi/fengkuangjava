package com.fengkuang.java.面向对象06.枚举类69.better;
public enum Gender {
    MALE, FEMALE;
    private String name;
    public void setName(String name) {
        switch (this) {
            case MALE:
                if (name.equals("男")) {
                    this.name = name;
                } else {
                    System.out.println("参数错误");
                    return;
                }
                break;
            case FEMALE:
                if (name.equals("女")) {
                    this.name = name;
                } else {
                    System.out.println("参数错误");
                    return;
                }
                break;
        }
    }
    public String getName() {
        return this.name;
    }
}