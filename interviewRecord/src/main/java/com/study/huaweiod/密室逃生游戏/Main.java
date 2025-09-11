package com.study.huaweiod.密室逃生游戏;

import java.util.Scanner;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/8 08:53
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();
        String boxes = scanner.nextLine();
        String[] boxesArray = boxes.split(" ");
        for (int i = 0; i < boxesArray.length; i++) {
            String newKey = boxesArray[i].toLowerCase();
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < newKey.length(); j++) {
                if (newKey.charAt(j) >= 97 && newKey.charAt(j) <= 122) {
                    sb.append(newKey.charAt(j));
                }
            }
            newKey = getOrderString(sb.toString());
            if (key.equals(newKey)) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(-1);
    }

    public static String getOrderString(String str) {
        String[] array = str.split("");
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length- 1 - i; j++) {
                if (array[i].charAt(0) > array[j].charAt(0)) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
        }
        return sb.toString();
    }
}
