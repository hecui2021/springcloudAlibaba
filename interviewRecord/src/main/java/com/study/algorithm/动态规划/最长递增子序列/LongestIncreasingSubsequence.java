package com.study.algorithm.动态规划.最长递增子序列;

/**
 * @author peterche
 * @description:
 * 问题描述
 * 给定一个整数数组 nums，找到其中最长的严格递增子序列的长度。
 * @date 2025-03-27
 */
public class LongestIncreasingSubsequence {

    /**
     * 思路
     * 定义状态：
     * 用 dp[i] 表示以 nums[i] 结尾的最长递增子序列的长度。
     * 状态转移方程：
     * 对于每个 i，遍历 j 从 0 到 i-1，如果 nums[j] < nums[i]，则 dp[i] = max(dp[i], dp[j] + 1)。
     * 初始条件：
     * 每个元素本身至少是一个长度为 1 的子序列，因此 dp[i] = 1。
     * 最终结果：
     * 返回 dp 数组中的最大值。
     * @param nums
     * @return
     */
    public static int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int[] dp = new int[n]; // 定义状态数组
        int maxLength = 1; // 记录最长递增子序列的长度

        // 初始化 dp 数组
        for (int i = 0; i < n; i++) {
            dp[i] = 1; // 每个元素本身至少是一个长度为 1 的子序列
        }

        // 动态规划求解
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1); // 状态转移方程
                }
            }
            maxLength = Math.max(maxLength, dp[i]); // 更新最大值
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println("Length of LIS: " + lengthOfLIS(nums));
    }
}
