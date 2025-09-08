package com.study.huaweiod.通信误码;

import java.util.*;

/**
 * @author peterche
 * @description:
 * @date 2025-04-23
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            Integer count = map.get(array[i]);
            if (count == null) {
                map.put(array[i], 1);
            } else {
                map.put(array[i], count + 1);
            }
        }

        List<Integer> list = new ArrayList(map.values());
        Collections.sort(list);

        int max = list.get(list.size() - 1);

        int result = 0;
        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            int value = map.get(key);

            if (value == max) {
                int resultMax = getMax(array, key);
                if (resultMax > result) {
                    result = resultMax;
                }
            }
        }
        System.out.println(result);
    }

    public static int getMax(int[] array, int key) {
        int left = -1;
        int right = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                if (left == -1) {
                    left = i;
                }
                right = i;
            }
        }
        return right - left + 1;
    }
}
