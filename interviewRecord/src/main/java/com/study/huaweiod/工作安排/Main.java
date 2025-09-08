package com.study.huaweiod.工作安排;

import java.util.Scanner;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/4/24 21:35
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int time = scanner.nextInt();
        int n = scanner.nextInt();

        int[] weightArray = new int[n];
        int[] valueArray = new int[n];

        for (int i = 0; i < n; i++) {
            weightArray[i] = scanner.nextInt();
            valueArray[i] = scanner.nextInt();
        }

        int[][] dp = new int[n + 1][time + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= time; j++) {
                if (weightArray[i -1] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weightArray[i - 1]] + valueArray[i - 1]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println(dp[n][time]);
    }
}
