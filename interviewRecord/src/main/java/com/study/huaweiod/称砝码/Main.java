package com.study.huaweiod.称砝码;

import java.util.Scanner;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/28 15:08
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // 种类
        int[] typeArray = new int[n + 1];
        for (int i = 1; i<= n; i++) {
            typeArray[i] = scanner.nextInt();
        }

        // 数量
        int[] numArray = new int[n + 1];
        for (int i = 1; i<= n; i++) {
            numArray[i] = scanner.nextInt();
        }
        scanner.close();

        int count = getResult(n, typeArray, numArray);
        System.out.println(count);
    }

    private static int getResult(int n, int[] typeArray, int[] numArray) {
        int max = 0;
        for (int i = 1; i <= n; i++) {
            max += typeArray[i] * numArray[i];
        }
        boolean[] dp = new boolean[max + 1];
        dp[0] = true;

        for (int i = 1; i <= n; i++) {
            for (int j = max; j >= typeArray[i]; j--) {
                for (int k = 1; k <= numArray[i]; k++) {
                    if (j >= typeArray[i] * k) {
                        if (dp[j - typeArray[i] * k]) {
                            dp[j] = true;
                        }
                    }
                }
            }
        }

        int count = 0;
        for (int i = 0;i < dp.length; i++) {
            if (dp[i]) {
                count++;
            }
        }
        return count;
    }
}
