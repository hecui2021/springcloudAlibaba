package com.study.huaweiod.高效的任务规划;

import java.util.Scanner;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/30 19:46
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            int n = scanner.nextInt();
            int[][] array = new int[n][2];
            for (int k = 0; k < n; k++) {
                int b = scanner.nextInt();
                int j = scanner.nextInt();
                array[k] = new int[]{b, j};
            }
            int result = getResult(array);
            System.out.println(result);
        }
    }

    private static int getResult(int[][] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1- i; j++) {
                if (array[j][1] < array[j + 1][1]) {
                    int[] temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        int sum = 0;
        for (int i= 0; i < array.length; i++) {
            sum += array[i][0];
        }
        sum += array[array.length - 1][1];
        return sum;
    }
}
