package com.study.huaweiod.最多提取子串;

import java.util.*;

/**
 * @author peterche
 * @description:
 * @date 2025-04-29
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();

        String[] array = A.split("");

        int result = 0;
        while (true) {
            int count = 0;
            int index = 0;
            for (int i = 0; i < B.length(); i++) {
                for (int j = index; j < array.length; j++) {
                    if ((B.charAt(i) + "").equals(array[j])) {
                        // 当前字母相同
                        array[j] = "";
                        count++;
                        index = j + 1;
                        break;
                    }
                }
            }
            if (count == B.length()) {
                result++;
            } else {
                break;
            }
        }
        System.out.println(result);

    }

}
