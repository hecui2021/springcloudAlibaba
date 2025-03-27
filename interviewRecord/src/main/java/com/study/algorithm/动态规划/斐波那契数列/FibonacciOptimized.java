package com.study.algorithm.动态规划.斐波那契数列;

/**
 * @author peterche
 * @description: 斐波那契数列的空间优化
 * 在某些情况下，可以通过优化空间复杂度来减少内存使用。
 * @date 2025-03-27
 */
public class FibonacciOptimized {
    public static int fib(int n) {
        if (n <= 1) return n;

        int prev2 = 0; // F(0)
        int prev1 = 1; // F(1)

        for (int i = 2; i <= n; i++) {
            int curr = prev1 + prev2; // 状态转移方程
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1; // 返回结果
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci(" + n + ") = " + fib(n));
    }
}
