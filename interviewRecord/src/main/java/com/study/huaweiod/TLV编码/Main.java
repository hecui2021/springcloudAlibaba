package com.study.huaweiod.TLV编码;

import java.util.Scanner;

/**
 * @author peterche
 * @description:
 * @date 2025-03-14
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputTag = scanner.nextLine();
        String str = scanner.nextLine();

        String[] array = str.split(" ");

        int index = 0;
        while (index < array.length) {
            String tag = array[index];
            int length = getLength(array[++index]);
            index += 2;
            if (inputTag.equals(tag)) {
                StringBuffer sb = new StringBuffer();
                for (int i = 0; i < length; i++) {
                    if (i ==0) {
                        sb.append(array[index + i]);
                    } else {
                        sb.append(" " + array[index + i]);
                    }
                }
                System.out.println(sb.toString());
                return;
            }
            index += length;
        }
        scanner.close();
    }

    public static int getLength(String length1) {
        while (length1.startsWith("0")) {
            length1 = length1.substring(1, length1.length());
        }
        return Integer.parseInt(length1);
    }
}
