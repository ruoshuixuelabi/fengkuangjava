package com.fengkuang.java.面向对象05.继承与组合58;
class Animal {
    private void beat() {
        System.out.println("心脏跳动...");
    }
    public void breathe() {
        beat();
        System.out.println("吸一口气，吐一口气，呼吸中...");
    }
}
// 继承Animal，直接复用父类的breathe()方法
class Bird extends Animal {
    public void fly() {
        System.out.println("我在天空自在的飞翔...");
    }
}
// 继承Animal，直接复用父类的breathe()方法
class Wolf extends Animal {
    public void run() {
        System.out.println("我在陆地上的快速奔跑...");
    }
}
public class InheritTest {
    public static void main(String[] args) {
        var b = new Bird();
        b.breathe();
        b.fly();
        var w = new Wolf();
        w.breathe();
        w.run();
    }
}