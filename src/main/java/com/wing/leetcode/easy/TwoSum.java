package com.wing.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};

        System.out.println(Arrays.toString(solution(nums, 9)));
    }

    public static int[] solution(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {

                return new int[]{map.get(temp), i};

            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
