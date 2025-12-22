package com.study.huaweiod.TLV解析Ⅱ;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/30 18:04
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String msg = scanner.nextLine();

        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < msg.length(); i++) {
            int tag = Integer.parseInt(msg.substring(i, i + 2), 16);
            int length = Integer.parseInt(msg.substring(i + 2, i + 4), 16);
            int offset = (i + 5) / 2;
            map.put(tag, new int[]{length, offset});

            i += length * 2 + 3;
        }

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int tag = scanner.nextInt();
            int[] array = map.get(tag);
            if (array != null) {
                System.out.println(array[0] + " " + array[1]);
            } else {
                System.out.println("0 0");
            }
        }


        scanner.close();
    }
}
