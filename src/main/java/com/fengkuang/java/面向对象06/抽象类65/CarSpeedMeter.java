package com.fengkuang.java.面向对象06.抽象类65;

public class CarSpeedMeter extends SpeedMeter {
    private double radius;

    public CarSpeedMeter(double radius) {
        this.radius = radius;
    }

    @Override
    public double calGirth() {
        return radius * 2 * Math.PI;
    }

    public static void main(String[] args) {
        var csm = new CarSpeedMeter(0.34);
        csm.setTurnRate(15);
        System.out.println(csm.getSpeed());
    }
}