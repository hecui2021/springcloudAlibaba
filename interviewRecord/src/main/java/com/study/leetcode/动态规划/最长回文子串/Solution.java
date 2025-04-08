package com.study.leetcode.动态规划.最长回文子串;

/**
 * @Author: peterche
 * @Description: 5. 最长回文子串
 * @Date: 2025/4/8 22:39
 */
public class Solution {
    public String longestPalindrome(String s) {
        int length = s.length();
        if (length < 2) {
            return s;
        }

        int maxLen = 1;
        int start = 0;

        boolean[][] dp = new boolean[length + 1][length + 1];
        for (int i = 0; i < length; i++) {
            dp[i][i] = true;
        }

        char[] charArray = s.toCharArray();
        for (int len = 2; len <= length; len++) {
            // 左标记
            for (int i = 0; i < length; i++) {
                int j = len + i - 1;
                if (j >= length) {
                    break;
                }
                char left = charArray[i];
                char right = charArray[j];
                if (left != right) {
                    // 左右边界不相同
                    dp[i][j] = false;
                    continue;
                }

                if (j - i < 3) {
                    dp[i][j] = true;
                } else{
                    dp[i][j] = dp[i + 1][j - 1];
                }

                if (dp[i][j] && len > maxLen) {
                    maxLen = len;
                    start = i;
                }
            }
        }
        return s.substring(start, start + maxLen);

    }
}
