package com.wing.leetcode.recursion;

/**
 *
 * 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 *
 * 示例 1：
 *
 * 输入: n = 3
 * 输出: 6
 * 示例 2：
 *
 * 输入: n = 9
 * 输出: 45
 *  
 *
 * 限制：
 *
 * 1 <= n <= 10000
 *
 * https://leetcode-cn.com/problems/qiu-12n-lcof/
 */
public class SumNums {

    public static void main(String[] args) {
        System.out.println(solution(9));
    }
    public static int solution(int n) {
        if (n == 1 || n == 0){
            return n;
        }else {
            return n + solution(n -1);
        }
    }
}
