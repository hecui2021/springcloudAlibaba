package com.study.leetcode.三角形最小路径和;

import java.util.List;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/23 22:31
 */
public class Main {



    public int minimumTotal2(List<List<Integer>> triangle) {
        int index = 0;
        int count = triangle.get(0).get(0);
        if (triangle.size() == 1) {
            return count;
        }

        for (int i = 1; i < triangle.size(); i++) {
            List<Integer> list = triangle.get(i);
            if (list.get(index) > list.get(index + 1)) {
                index++;
            }
            count += list.get(index);
        }
        return count;
    }
}
