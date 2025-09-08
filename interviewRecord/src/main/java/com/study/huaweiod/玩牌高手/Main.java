package com.study.huaweiod.玩牌高手;

import java.util.*;

/**
 * @author peterche
 * @description:
 * @date 2025-05-07
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String[] strArray = str.split(",");
        int[] array = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            array[i] = Integer.parseInt(strArray[i]);
        }

        int sum = 0;
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (i <= 2) {
                sum = Math.max(sum, 0);
            } else {
                sum = Math.max(sum, map.get(i - 3));
            }
            map.put(i, sum);
        }
        System.out.println(map.get(array.length - 1));

    }
}
