package com.fengkuang.java.Java集合08.Java11增强的Collection和Iterator接口82;
import java.util.stream.*;
public class IntStreamTest {
    public static void main(String[] args) {
        var is = IntStream.builder()
                .add(20)
                .add(13)
                .add(-2)
                .add(18)
                .build();
        // 下面调用聚集方法的代码每次只能执行一个
//		System.out.println("is所有元素的最大值：" + is.max().getAsInt());
//		System.out.println("is所有元素的最小值：" + is.min().getAsInt());
//		System.out.println("is所有元素的总和：" + is.sum());
//		System.out.println("is所有元素的总数：" + is.count());
//		System.out.println("is所有元素的平均值：" + is.average());
//		System.out.println("is所有元素的平方是否都大于20:"
//			+ is.allMatch(ele -> ele * ele > 20));
//		System.out.println("is是否包含任何元素的平方大于20:"
//			+ is.anyMatch(ele -> ele * ele > 20));
        // 将is映射成一个新Stream，新Stream的每个元素是原Stream元素的2倍+1
        var newIs = is.map(ele -> ele * 2 + 1);
        // 使用方法引用的方式来遍历集合元素
        newIs.forEach(System.out::println); // 输出41 27 -3 37
    }
}