package com.study.huaweiod.分苹果;

import java.util.Scanner;

/**
 * @Author: peterche
 * @Description: 分苹果
 * @Date: 2025/2/10 23:18
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int fail = 0;
        int sum = 0;

        int min = 0;
        for (int i = 0; i < n; i++) {
            fail ^= array[i];
            sum += array[i];
            min = Math.min(min, array[i]);
        }

        if (fail == 0) {
            System.out.println(sum - min);
        } else {
            System.out.println(-1);
        }

    }
}
