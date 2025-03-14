package com.study.huaweiod.vlan资源池;

import java.util.Scanner;

/**
 * @author peterche
 * @description:
 * @date 2025-03-14
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String poolString = scanner.nextLine();
        int n = scanner.nextInt();

        String[] poolArray = poolString.split(",");
        int[] array = new int[4096];
        for (int i = 0; i < poolArray.length; i++) {
            if (poolArray[i].contains("-")) {
                String[] indexArray = poolArray[i].split("-");
                for (int j = Integer.parseInt(indexArray[0]); j <= Integer.parseInt(indexArray[1]); j++) {
                    array[j] = 1;
                }
            } else {
                array[Integer.parseInt(poolArray[i])] = 1;
            }
        }
        array[n] = 0;

        // 0101110000

        int start = 0;
        int end = 0;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                if (start == 0) {
                    start = i;
                }
                end = i;
                continue;
            }
            if (start != 0) {
                if (start == end) {
                    if (sb.length() == 0) {
                        sb.append(start);
                    } else {
                        sb.append("," + start);
                    }
                } else {
                    if (sb.length() == 0) {
                        sb.append(start + "-" + end);
                    } else {
                        sb.append("," + start + "-" + end);
                    }
                }
                start = 0;
                end = 0;
            }
        }
        System.out.println(sb);
        scanner.close();
    }
}


