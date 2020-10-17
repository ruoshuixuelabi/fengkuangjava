package com.fengkuang.java.面向对象06.Java9改进的接口66;
public class OutputFactory {
    public Output getOutput() {
//		return new Printer();
        return new BetterPrinter();
    }

    public static void main(String[] args) {
        var of = new OutputFactory();
        var c = new Computer(of.getOutput());
        c.keyIn("轻量级Java EE企业应用实战");
        c.keyIn("疯狂Java讲义");
        c.print();
    }
}
