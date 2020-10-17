package com.fengkuang.java.泛型09.类型通配符93;
import java.util.*;
public class Canvas {
//	// 同时在画布上绘制多个形状
//	public void drawAll(List<Shape> shapes)
//	{
//		for (Shape s : shapes)
//		{
//			s.draw(this);
//		}
//	}
    // 同时在画布上绘制多个形状，使用被限制的泛型通配符
    public void drawAll(List<? extends Shape> shapes) {
        for (Shape s : shapes) {
            s.draw(this);
        }
    }
    public static void main(String[] args) {
        List<Circle> circleList = new ArrayList<>();
        var c = new Canvas();
        // 由于List<Circle>并不是List<Shape>的子类型,
        // 所以下面代码引发编译错误
        c.drawAll(circleList);
    }
}