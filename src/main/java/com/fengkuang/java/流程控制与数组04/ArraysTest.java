package com.fengkuang.java.流程控制与数组04;
import java.util.Arrays;
public class ArraysTest {
    public static void main(String[] args) {
        // 定义一个a数组
        var a = new int[]{3, 4, 5, 6};
        // 定义一个a2数组
        var a2 = new int[]{3, 4, 5, 6};
        // a数组和a2数组的长度相等，每个元素依次相等，将输出true
        System.out.println("a数组和a2数组是否相等：" + Arrays.equals(a, a2));
        // 通过复制a数组，生成一个新的b数组
        var b = Arrays.copyOf(a, 6);
        System.out.println("a数组和b数组是否相等：" + Arrays.equals(a, b));
        // 输出b数组的元素，将输出[3, 4, 5, 6, 0, 0]
        System.out.println("b数组的元素为：" + Arrays.toString(b));
        // 将b数组的第3个元素（包括）到第5个元素（不包括）赋为1
        Arrays.fill(b, 2, 4, 1);
        // 输出b数组的元素，将输出[3, 4, 1, 1, 0, 0]
        System.out.println("b数组的元素为：" + Arrays.toString(b));
        // 对b数组进行排序
        Arrays.sort(b);
        // 输出b数组的元素，将输出[0, 0, 1, 1, 3, 4]
        System.out.println("b数组的元素为：" + Arrays.toString(b));
    }
}