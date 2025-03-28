package com.study.huaweiod.查找重复代码;

import java.util.Scanner;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/3/28 21:50
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        scanner.close();

        int max = 0;
        String ans = "";
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];
        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                if (str1.charAt(i - 1) == str2.charAt(j -1)) {
                    dp[i][j] = dp[i -1][j -1] + 1;
                    if (dp[i][j] > max) {
                        max= dp[i][j];
                        ans = str1.substring(i - max, i);
                    }

                } else {
                    dp[i][j] = 0;
                }
            }
        }
        System.out.println(ans);
    }
}
