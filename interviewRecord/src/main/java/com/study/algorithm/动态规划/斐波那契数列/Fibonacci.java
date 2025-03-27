package com.study.algorithm.动态规划.斐波那契数列;

/**
 * @author peterche
 * @description:
 * 问题描述
 * 计算第 n 个斐波那契数，其中：
 *
 * F(0) = 0
 * F(1) = 1
 * F(n) = F(n-1) + F(n-2)（n >= 2）
 * @date 2025-03-27
 */
public class Fibonacci {
    public static int fib(int n) {
        if (n <= 1) return n;

        int[] dp = new int[n + 1]; // 定义状态数组
        dp[0] = 0; // 初始条件
        dp[1] = 1; // 初始条件

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2]; // 状态转移方程
        }

        return dp[n]; // 返回结果
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci(" + n + ") = " + fib(n));
    }
}
