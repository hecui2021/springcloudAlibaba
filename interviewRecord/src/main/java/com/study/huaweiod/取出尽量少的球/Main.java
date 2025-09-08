package com.study.huaweiod.取出尽量少的球;

import java.util.*;

/**
 * @author peterche
 * @description:
 * @date 2025-04-22
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sum = scanner.nextInt();
        int length = scanner.nextInt();
        long[] array = new long[length];

        long arraySum = 0;
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
            arraySum += array[i];
        }

        if (arraySum < sum) {
            System.out.println("[]");
            return;
        }

        long maxCapacity = sum / length;

        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0; i < length; i++) {
            if (array[i] > maxCapacity) {
                sb.append(array[i] - maxCapacity);
            } else {
                sb.append(0);
            }
            if (i != length - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
