package com.wing.leetcode.module;

public class ListNode {

    int val;

    ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public ListNode getNext() {
        return next;
    }

    public ListNode setNext(ListNode next) {
        this.next = next;
        return this;
    }

    public ListNode setNext(int x) {
        next = new ListNode(x);
        return next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
