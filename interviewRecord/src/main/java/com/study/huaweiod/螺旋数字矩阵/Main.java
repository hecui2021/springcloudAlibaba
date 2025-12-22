package com.study.huaweiod.螺旋数字矩阵;

import java.util.Scanner;
import java.util.StringJoiner;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/10/1 13:52
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // 行
        int m = scanner.nextInt();

        // 列
        int k = n % m == 0 ? n / m : n / m + 1;
        int[][] array = new int[m][k];

        int step = 1;
        int x = 0;
        int y = 0;
        while (step <= n) {
            while (y < k && array[x][y] == 0 && step <= n) {
                array[x][y++] = step++;
            }
            y -= 1;
            x += 1;
            while (x < m && array[x][y] == 0 && step <= n) {
                array[x++][y] = step++;
            }
            x -= 1;
            y -= 1;
            while (y >= 0 && array[x][y] == 0 && step <= n) {
                array[x][y--] = step++;
            }
            x -= 1;
            y += 1;
            while (x >= 0 && array[x][y] == 0 && step <= n) {
                array[x--][y] = step++;
            }
            x += 1;
            y += 1;
        }
        // 打印螺旋矩阵字符串
        for (int i = 0; i < m; i++) {
            StringJoiner row = new StringJoiner(" ");
            for (int j = 0; j < k; j++) {
                if (array[i][j] == 0) {
                    row.add("*");
                } else {
                    row.add(array[i][j] + "");
                }
            }
            System.out.println(row);
        }
    }
}
