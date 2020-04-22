package com.wing.leetcode.module;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        for (int i = 0; i < 10 ; i++) {
            queue.enQueue(i + 1);
        }

        System.out.println("Queue is :" + queue);

        while (!queue.isEmpty()){
            System.out.println(queue.frunt());
            queue.deQueue();
        }
    }
}
