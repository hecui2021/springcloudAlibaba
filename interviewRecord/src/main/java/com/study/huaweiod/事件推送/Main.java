package com.study.huaweiod.事件推送;

import java.util.*;

/**
 * @Author: peterche
 * @Description: 双重for会超时
 * @Date: 2025/9/9 15:21
 */
public class Main {
    /**
     * 题目描述
     * 同一个数轴X上有两个点的集合A={A1, A2, …, Am}和B={B1, B2, …, Bn}，Ai和Bj均为正整数，A、B已经按照从小到大排好序，A、B均不为空，给定一个距离R(正整数)，列出同时满足如下条件的所有（Ai, Bj）数对：
     *
     * Ai <= Bj
     * Ai, Bj之间的距离小于等于R
     * 在满足1,2的情况下,每个Ai只需输出距离最近的Bj
     * 输出结果按Ai从小到大的顺序排序
     * 输入描述
     * 第一行三个正整数m,n,R
     *
     * 第二行m个正整数,表示集合A
     *
     * 第三行n个正整数,表示集合B
     *
     * 输入限制：
     *
     * 1 <= R <= 100000
     * 1 <= n,m <= 100000
     * 1 <=Ai,Bj <= 1000000000
     * 输出描述
     * 每组数对输出一行Ai和Bj,以空格隔开
     *
     * 用例1
     * 输入
     * 4 5 5
     * 1 5 5 10
     * 1 3 8 8 20
     * 输出
     * 1 1
     * 5 8
     * 5 8
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int R = scanner.nextInt();
        int[] A = new int[m];
        for (int i = 0; i < m; i++) {
            A[i] = scanner.nextInt();;
        }
        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            B[i] = scanner.nextInt();;
        }

        for (int i = 0; i < m; i++) {
            int left = 0;
            int right = B.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (B[mid] < A[i]) {
                    left = mid + 1;
                } else if (B[mid] == A[i] && B[mid] - A[i] <= R) {
                    System.out.println(A[i] + " " + B[mid]);
                    break;
                } else {
                    if (B[mid -1] < A[i] && B[mid] - A[i] <= R) {
                        System.out.println(A[i] + " " + B[mid]);
                        break;
                    }
                    right = mid -1;
                }
            }
        }
    }
}
