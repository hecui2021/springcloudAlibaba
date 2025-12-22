package com.study.huaweiod.对称美学;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/28 23:35
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            String input = scanner.nextLine();
            String[] array = input.split(" ");
            double n = Double.parseDouble(array[0]);
            double k = Double.parseDouble(array[1]);
            char str = getStr(n, k);
            if (str == 'B') {
                System.out.println("blue");
            } else {
                System.out.println("red");
            }
        }
        scanner.close();
    }

    public static char getStr(double n, double k) {
        if (n == 1) {
            return 'R';
        }
        if (n == 2) {
            if (k == 1) {
                return 'R';
            } else {
                return 'B';
            }
        }

        double half = Math.pow(2, n - 2);

        if (k >= half) {
            return getStr(n - 1, k - half);
        }
        char str = getStr(n - 1, k);
        if (str == 'B') {
            return 'R';
        } else {
            return 'B';
        }
    }
}
