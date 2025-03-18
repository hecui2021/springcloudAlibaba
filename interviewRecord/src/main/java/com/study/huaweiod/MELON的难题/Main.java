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

        int max = 0;
        int start = 0;
        int end = 0;
        while (end < array.length) {
            if (getSum(array, start, end) == sum /2) {
                max = Math.max(max, end - start + 1);
                start++;
                continue;
            }
            end++;
        }
        System.out.println(array.length - max);

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
