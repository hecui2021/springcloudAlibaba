package com.study.huaweiod.查找充电设备组合;

import java.util.*;

/**
 * @author peterche
 * @description:
 * @date 2025-02-17
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String nStr = scanner.nextLine();
        int pMax = scanner.nextInt();
        scanner.close();

        String[] nArray = nStr.split(" ");

        int[][] dp = new int[n + 1][pMax + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= pMax; j++) {
                int pi = Integer.parseInt(nArray[i - 1]);
                if (pi > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - pi] + pi);
                }
            }
        }
        System.out.println(dp[n][pMax]);
    }
}
