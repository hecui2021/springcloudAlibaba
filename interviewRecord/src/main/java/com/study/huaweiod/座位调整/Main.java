package com.study.huaweiod.座位调整;

import java.util.Scanner;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/29 18:39
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String[] strArray = str.split(",");
        int[] array = new int[strArray.length];

        int start = -1;
        int end = start;
        int count = 0;
        for (int i = 0; i < strArray.length; i++) {
            array[i] = Integer.parseInt(strArray[i]);

            if (array[i] == 0) {
                if (start == -1) {
                    start = i;
                }
                end = i;
                continue;
            }
            count += getCount(start, end);
            start = -1;
        }
        scanner.close();

        System.out.println(count);
    }

    private static int getCount(int start, int end) {
        if (start == -1) {
            return 0;
        }
        if (start == end) {
            return 0;
        }
        return (end - start) / 2;
    }
}
