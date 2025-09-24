package com.study.leetcode.交错字符串;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/22 23:32
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        boolean interleave = main.isInterleave("aabcc", "dbbca", "aadbbcbcac");
        System.out.println(interleave);
    }

    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() == 0 ) {
            return s2.equals(s3);
        } else if (s2.length() == 0) {
            return s1.equals(s3);
        }
        char c1 = s1.charAt(0);
        char c2 = s2.charAt(0);
        char c3 = s3.charAt(0);

        if (c1 == c3 && c2 != c3) {
            return isInterleave(s1.substring(1), s2, s3.substring(1));
        } else if (c1 != c3 && c2 == c3) {
            return isInterleave(s1, s2.substring(1), s3.substring(1));
        } else if (c1 == c3 && c2 == c3) {
            return isInterleave(s1, s2.substring(1), s3.substring(1)) ||
                    isInterleave(s1.substring(1), s2, s3.substring(1));
        }
        return false;
    }
}
