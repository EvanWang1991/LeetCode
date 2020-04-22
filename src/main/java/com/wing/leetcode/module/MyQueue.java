package com.wing.leetcode.module;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {

    private List<Integer> data;

    private int p_start;

    public MyQueue(){
        data = new ArrayList();

        p_start = 0;
    }

    public boolean enQueue(int value){
        data.add(value);
        return true;
    }

    public Integer frunt(){
        if (isEmpty()){
            return null;
        }
        return data.get(p_start);
    }

    public boolean isEmpty(){
        return p_start >= data.size();
    }

    public boolean deQueue(){
        if(isEmpty()){
            return false;
        }

        p_start++;

        return true;
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "data=" + data +
                '}';
    }
}
