package com.study.algorithm.动态规划.爬楼梯问题;

/**
 * @author peterche
 * @description:
 * 问题描述
 * 假设你正在爬楼梯，每次可以爬 1 或 2 个台阶。问有多少种不同的方法可以爬到第 n 阶。
 * @date 2025-03-27
 */
public class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n <= 2) return n;

        int[] dp = new int[n + 1]; // 定义状态数组
        dp[0] = 1; // 初始条件
        dp[1] = 1; // 初始条件

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2]; // 状态转移方程
        }

        return dp[n]; // 返回结果
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Ways to climb " + n + " stairs: " + climbStairs(n));
    }
}
