package com.study.leetcode.hot100.缺失的第一个正数;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/10/26 22:30
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = {3, 4, -1, 1, 9, -5};
        int i = main.firstMissingPositive(nums);
        System.out.println(i);
    }

    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                nums[i] = n + 1;
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] < n) {
                nums[nums[i] - 1] = 0 - nums[nums[i] - 1];
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return n + 1;
    }

    public int firstMissingPositive2(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            if (nums[i] <= 0) {
                nums[i] = n + 1;
            }
        }
        for (int i = 0; i < n; ++i) {
            int num = Math.abs(nums[i]);
            if (num <= n) {
                nums[num - 1] = -Math.abs(nums[num - 1]);
            }
        }
        for (int i = 0; i < n; ++i) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return n + 1;
    }

}


