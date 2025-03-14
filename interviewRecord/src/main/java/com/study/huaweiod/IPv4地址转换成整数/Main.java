package com.study.huaweiod.IPv4地址转换成整数;

import java.util.Scanner;

/**
 * @author peterche
 * @description:
 * @date 2025-03-14
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] array = str.split("#");
        if (array.length != 4) {
            System.out.println("invalid IP");
            return;
        }
        long result = 0l;
        for (int i = 0; i < array.length; i++) {
            int num = Integer.parseInt(array[i]);
            if (i == 0) {
                if (num < 1 || num > 128) {
                    System.out.println("invalid IP");
                    return;
                }
            } else {
                if (num < 0 || num > 255) {
                    System.out.println("invalid IP");
                    return;
                }
            }
            result = result * 256 + num;
        }
        System.out.println(result);

        scanner.close();
    }
}

