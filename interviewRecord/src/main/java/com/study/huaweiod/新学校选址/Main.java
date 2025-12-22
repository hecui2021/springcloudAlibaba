package com.study.huaweiod.新学校选址;

import java.util.Scanner;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/30 17:26
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        sort(array);

        int min = -1;
        int index = -1;
        for (int i = array[0]; i <= array[array.length - 1]; i++) {
            int sum = getMin(i, array);
            if (min > sum || min == -1) {
                min = sum;
                index = i;
            }
        }
        System.out.println(index);
        scanner.close();
    }

    private static int getMin(int min, int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += Math.abs(min - array[i]);
        }
        return sum;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 -i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
