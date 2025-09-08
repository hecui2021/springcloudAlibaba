package com.study.huaweiod.二元组个数;

import java.util.*;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/8 08:06
 */
public class Main {

    /**
     * 题目描述
     * 给定两个数组a，b，若a[i] == b[j] 则称 [i, j] 为一个二元组，求在给定的两个数组中，二元组的个数。
     *
     * 输入描述
     * 第一行输入 m 第二行输入m个数，表示第一个数组
     *
     * 第三行输入 n 第四行输入n个数，表示第二个数组
     *
     * 输出描述
     * 二元组个数。
     *
     * 用例1
     * 输入
     * 4
     * 1 2 3 4
     * 1
     * 1
     * 输出
     * 1
     * 用例2
     * 输入
     * 6
     * 1 1 2 2 4 5
     * 3
     * 2 2 4
     * 输出
     * 5
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int[] arraya = new int[m];
        for (int i = 0; i < m; i++) {
            arraya[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int[] arrayb = new int[n];
        for (int i = 0; i < n; i++) {
            arrayb[i] = scanner.nextInt();
        }

        int count = 0;
        for (int i = 0; i < arraya.length; i++) {
            for (int j = 0; j < arrayb.length; j++) {
                if (arraya[i] == arrayb[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
