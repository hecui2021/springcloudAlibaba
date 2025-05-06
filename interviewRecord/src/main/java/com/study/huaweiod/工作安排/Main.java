package com.study.huaweiod.工作安排;

import java.util.*;

/**
 * @author peterche
 * @description:
 * @date 2025-04-28
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        int n = scanner.nextInt();

        int[] weight = new int[n];
        int[] value = new int[n];
        for (int i = 0; i < n; i++) {
            weight[i] = scanner.nextInt();
            value[i] = scanner.nextInt();
        }

        // int[][] dp = new int[n + 1][time + 1];

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 0; j <= time; j++) {
        //         if (weight[i - 1] > j) {
        //             dp[i][j] = dp[i - 1][j];
        //         } else {
        //             dp[i][j] = Math.max(dp[i -1][j], dp[i - 1][j - weight[i - 1]] + value[i - 1]);
        //         }
        //     }
        // }

        int[] dp = new int[time + 1];
        for (int i = 0; i < weight.length; i++) {
            for (int w = time; w >= weight[i]; w--) {
                dp[w] = Math.max(dp[w], dp[w - weight[i]] + value[i]);
            }
        }
        System.out.println(dp[time]);

    }
}
