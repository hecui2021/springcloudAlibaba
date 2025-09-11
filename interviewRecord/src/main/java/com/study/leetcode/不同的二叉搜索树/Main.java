package com.study.leetcode.不同的二叉搜索树;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/10 09:16
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int i = main.numTrees(10);
        System.out.println(i);
    }

    public int numTrees(int n) {
        return getCount(1, n);
    }

    Map<String, Integer> map = new HashMap();

    public int getCount(int start, int end) {
        String key = start + ":" + end;
        Integer value = map.get(key);
        if (value != null) {
            return value;
        }
        if (start > end) {
            map.put(key, 1);
            return 1;
        }
        int count = 0;
        for (int i = start; i <= end; i++) {
            int left = getCount(start, i -1);
            int right = getCount(i + 1, end);

            count += left * right;
        }

        map.put(key, count);
        return count;
    }
}
