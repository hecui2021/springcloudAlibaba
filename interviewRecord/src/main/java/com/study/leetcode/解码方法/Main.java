package com.study.leetcode.解码方法;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/22 16:26
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int i = main.numDecodings("301");
        System.out.println(i);
    }

    public int numDecodings(String s) {
        int[] arr = new int[s.length()];
        String[] array = s.split("");
        for (int i = 0; i < array.length; i++) {
            arr[i] = Integer.parseInt(array[i]);
        }
        if (arr[0] == 0) {
            return 0;
        }
        return dfs(arr, arr.length - 1);

    }

    Map<Integer, Integer> map = new HashMap();

    public int dfs(int[] arr, int index) {
        if (index == 0) {
            return 1;
        }
        if (index == 1) {
            if (arr[0] == 1 && arr[1] != 0) {
                return 2;
            } else if (arr[0] == 2 && arr[1] <= 6 && arr[1] != 0) {
                return 2;
            } else if (arr[0] >= 3 && arr[1] == 0) {
                return 0;
            }
            return 1;
        }
        Integer value = map.get(index);
        if (value != null) {
            return value;
        }

        int pre = arr[index - 1];
        int cur = arr[index];
        int count = 0;
        if (pre == 1) {
            if (cur != 0) {
                count = dfs(arr, index - 1) + dfs(arr, index - 2);
            } else {
                count = dfs(arr, index - 2);
            }
        } else if (pre == 2 && cur <= 6) {
            if (cur != 0) {
                count = dfs(arr, index - 1) + dfs(arr, index - 2);
            } else {
                count = dfs(arr, index - 2);
            }
        } else {
            if (cur != 0) {
                count = dfs(arr, index - 1);
            } else {
                return 0;
            }
        }
        map.put(index, count);
        return count;
    }
}
