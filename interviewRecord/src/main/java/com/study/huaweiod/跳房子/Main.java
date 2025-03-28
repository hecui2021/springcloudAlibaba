package com.study.huaweiod.跳房子;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author peterche
 * @description:
 * @date 2025-03-28
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int k = scanner.nextInt();
        scanner.close();

        String[] array = str.substring(1, str.length() - 1).split(",");
        int[] resultRrray = new int[2];
        int count = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int iValue = Integer.parseInt(array[i]);
                int jValue = Integer.parseInt(array[j]);
                if (i != j && iValue + jValue == k) {
                    if (count > i + j) {
                        count = i + j;
                        if (i > j) {
                            resultRrray[0] = jValue;
                            resultRrray[1] = iValue;
                        } else {
                            resultRrray[0] = iValue;
                            resultRrray[1] = jValue;
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.toString(resultRrray));
    }
}
