package com.study.leetcode.爬楼梯;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/21 23:28
 */
public class Main {
    Map<Integer, Integer> map = new HashMap();
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        Integer value = map.get(n);
        if (value != null) {
            return value;
        }
        value = climbStairs(n - 1) + climbStairs(n - 2);
        map.put(n, value);
        return value;
    }
}
