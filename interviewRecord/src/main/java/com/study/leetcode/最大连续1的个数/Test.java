package com.study.leetcode.最大连续1的个数;


/**
 * @author peterche
 * @description: 485. 最大连续 1 的个数
 * @date 2025-02-17
 */
public class Test {
    public static void main(String[] args) {

    }

    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int left = 0;
        int right = 0;
        while (right < nums.length) {
            if (nums[right] == 1) {
                count = Math.max(count, right - left + 1);
            } else

            right++;
        }

    }
}
