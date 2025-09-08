package com.study.huaweiod.等和子数组最小和;

import java.util.*;

/**
 * @author peterche
 * @description:
 * @date 2025-05-09
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int sum = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
            max = Math.max(max, array[i]);
        }

        int num = 0;
        for (int i = 2; i <= n; i++) {
            if (sum % i == 0 && sum / i >= max) {
                // 可以平分
                num = i;
            }
        }
        System.out.println(sum / num);

    }
}
