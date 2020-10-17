package com.fengkuang.java.流程控制与数组04;
public class IfErrorTest2 {
    public static void main(String[] args) {
        var age = 45;
        if (age > 20) {
            System.out.println("青年人");
        }
        // 在原本的if条件中增加了else的隐含条件
        if (age > 40 && !(age > 20)) {
            System.out.println("中年人");
        }
        // 在原本的if条件中增加了else的隐含条件
        if (age > 60 && !(age > 20) && !(age > 40 && !(age > 20))) {
            System.out.println("老年人");
        }
    }
}