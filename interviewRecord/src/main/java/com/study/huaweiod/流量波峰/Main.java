package com.study.huaweiod.流量波峰;

import java.util.Scanner;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/30 21:04
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String[] strArray = str.split(" ");
        int[] array = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            array[i] = Integer.parseInt(strArray[i]);
        }

        int start = 0;
        int end = 2;
        int minDistance = Integer.MAX_VALUE;
        while (end < array.length) {
            for (int i = start + 1; i < end; i++) {
                if (array[start] < array[i] && array[i] > array[end]) {
                    minDistance = Math.min(minDistance, end - start);
                    start++;
                    break;
                }
            }
            end++;
        }
        if (minDistance == Integer.MAX_VALUE) {
            minDistance = -1;
        }
        System.out.println(minDistance);

        scanner.close();
    }
}
