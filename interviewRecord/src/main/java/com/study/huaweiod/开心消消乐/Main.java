package com.study.huaweiod.开心消消乐;

import java.util.Scanner;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/10/1 13:35
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int count = getResult(array);
    }

    private static int getResult(int[][] array) {
        return 0;

    }
}
