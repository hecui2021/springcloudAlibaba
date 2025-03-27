package com.study.algorithm.动态规划.最长公共子序列;

/**
 * @author peterche
 * @description:
 * 问题描述
 * 给定两个字符串 text1 和 text2，返回它们的最长公共子序列的长度。子序列是指从原字符串中删除一些字符（可以不连续）后得到的新字符串。
 * @date 2025-03-27
 */
public class LongestCommonSubsequence {

    /**
     * 思路
     * 定义状态：
     * 用 dp[i][j] 表示 text1 的前 i 个字符和 text2 的前 j 个字符的最长公共子序列的长度。
     * 状态转移方程：
     * 如果 text1[i-1] == text2[j-1]，则 dp[i][j] = dp[i-1][j-1] + 1。
     * 否则，dp[i][j] = max(dp[i-1][j], dp[i][j-1])。
     * 初始条件：
     * 当 i == 0 或 j == 0 时，dp[i][j] = 0。
     * 最终结果：
     * 返回 dp[m][n]，其中 m 和 n 分别是 text1 和 text2 的长度。
     * @param text1
     * @param text2
     * @return
     */
    public static int lcs(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        System.out.println("LCS length: " + lcs(text1, text2));
    }
}
