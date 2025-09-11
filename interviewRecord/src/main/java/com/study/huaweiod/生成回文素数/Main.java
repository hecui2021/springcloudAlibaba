package com.study.huaweiod.生成回文素数;

import java.util.*;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/9 08:41
 */
public class Main {
    /**
     * 题目描述
     * 求出大于或等于 N 的最小回文素数。
     *
     * 如果一个数大于 1，且其因数只有 1 和它自身，那么这个数是素数。 例如，2，3，5，7，11 以及 13 是素数。
     *
     * 如果一个数从左往右读与从右往左读是一样的，那么这个数是回文数，例如，12321 是回文数。
     *
     * 输入描述
     * 一个数
     *
     * 输出描述
     * 一个数
     *
     * 用例1
     * 输入
     * 6
     * 输出
     * 7
     * 用例2
     * 输入
     * 8
     * 输出
     * 11
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while (true) {
            if (isSushu(n) && isHuiwenshu(n)) {
                break;
            }
            n++;
        }
        System.out.println(n);
    }

    public static boolean isSushu(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isHuiwenshu(int n) {
        String str = n + "";
        int start = 0;
        int end = str.length() - 1;
        while (end - start > 0) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
