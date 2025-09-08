package com.study.huaweiod.字符串加密;

import java.util.Scanner;

/**
 * @author peterche
 * @description:
 * @date 2025-05-06
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        int[] a = new int[50];
        a[0] = 1;
        a[1] = 2;
        a[2] = 4;
        for (int i = 3; i < 50; i++) {
            a[i] = (a[i - 1] + a[i - 2] + a[i - 3]) % 26;
        }


        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            char[] charArray = str.toCharArray();
            for (int j = 0; j < str.length(); j++) {
                charArray[j] = (char) ((charArray[j] + a[j] - 97) % 26 + 97);
            }
            System.out.println(new String(charArray));
        }
    }
}