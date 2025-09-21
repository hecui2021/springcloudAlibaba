package com.study.leetcode.最长回文子串;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/19 08:24
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        String babad = main.longestPalindrome("babad");
        System.out.println(babad);
    }

    private int maxLength = 0;
    private String maxStr = null;
    public String longestPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String str = s.substring(i, j);
                if (isHuiwen(str) && j - i + 1 > maxLength) {
                    maxLength = j - i + 1;
                    maxStr = str;
                }
            }
        }
        return maxStr;
    }

    private boolean isHuiwen(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (end - start > 1) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
                continue;
            }
            return false;
        }
        if (end - start == 1 && s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return true;
    }
}
