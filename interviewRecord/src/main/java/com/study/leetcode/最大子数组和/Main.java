package com.study.leetcode.最大子数组和;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/19 14:40
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
//        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums = {1, 1, -2};
        int i = main.maxSubArray(nums);
        System.out.println(i);
    }

    public int maxSubArray2(int[] nums) {
        int pre = 0, maxSum = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxSum = Math.max(maxSum, pre);
        }
        return maxSum;
    }

    /**
     * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
     *
     * 子数组是数组中的一个连续部分。
     *
     *
     *
     * 示例 1：
     *
     * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
     * 输出：6
     * 解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
     * 示例 2：
     *
     * 输入：nums = [1]
     * 输出：1
     * 示例 3：
     *
     * 输入：nums = [5,4,-1,7,8]
     * 输出：23
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int start = 0;
        int minSum = nums[0];
        int sum = minSum;
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            if (sum < minSum) {
                minSum = sum;
                start = i;
            }
        }
        if (minSum > 0) {
            start = -1;
        }
        if (start == nums.length - 1) {
            return getMax(nums);
        }

        int end = nums.length - 1;
        minSum = nums[end];
        sum = minSum;
        for (int j = nums.length - 2; j > start; j--) {
            sum += nums[j];
            if (sum < minSum) {
                minSum = sum;
                end = j;
            }
        }

        if (minSum > 0) {
            end = nums.length;
        }

        sum = 0;
        for (int i = start + 1; i < end; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public int getMax(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}
