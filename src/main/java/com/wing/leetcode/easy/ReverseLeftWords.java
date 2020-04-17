package com.wing.leetcode.easy;

public class ReverseLeftWords {
    public static void main(String[] args) {
        System.out.println(solution("abcdefg", 2));
    }

    /**
     * 示例 1：
     *
     * 输入: s = "abcdefg", k = 2
     * 输出: "cdefgab"
     * 示例 2：
     *
     * 输入: s = "lrloseumgh", k = 6
     * 输出: "umghlrlose"
     *
     */
    public static String solution(String s, int n){
        return s.substring(n, s.length()) + s.substring(0, n);
    }
}
