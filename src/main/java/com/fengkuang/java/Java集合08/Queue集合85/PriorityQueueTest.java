package com.fengkuang.java.Java集合08.Queue集合85;
import java.util.*;
public class PriorityQueueTest {
    public static void main(String[] args) {
        var pq = new PriorityQueue();
        // 下面代码依次向pq中加入四个元素
        pq.offer(6);
        pq.offer(-3);
        pq.offer(20);
        pq.offer(18);
        // 输出pq队列，并不是按元素的加入顺序排列
        System.out.println(pq); // 输出[-3, 6, 20, 18]
        // 访问队列第一个元素，其实就是队列中最小的元素：-3
        System.out.println(pq.poll());
    }
}