package com.study.huaweiod.MELON的难题;

import java.util.Scanner;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/3/18 21:29
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        String str = scanner.nextLine();
        String[] strArray = str.split(" ");

        int sum = 0;

        int[] array = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            array[i] = Integer.parseInt(strArray[i]);
            sum += array[i];
        }

        if (sum % 2 != 0) {
            System.out.println(-1);
            return;
        }

        int[][] dp = new int[n + 1][sum /2 + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum /2 + 1; j++) {
                if (array[i - 1] > j) {
                    dp[i][j] = dp[i -1][j];
                } else {
                    dp[i][j] = Math.max(dp[i -1][j], dp[i - 1][j - array[i - 1]] + 1);
                }
            }
        }

        System.out.println(array.length - dp[array.length][sum / 2]);

        scanner.close();
    }

    public static int getSum(int[] array, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += array[i];
        }
        return sum;
    }
}
