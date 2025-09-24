package com.study.leetcode.杨辉三角II;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/23 15:24
 */
public class Main {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = generate(rowIndex + 1);
        return list.get(rowIndex);
    }

    public List<List<Integer>> generate(int numRows) {
        if (numRows == 1) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            List<List<Integer>> result = new ArrayList<>();
            result.add(list);
            return result;
        }
        List<List<Integer>> resultList = generate(numRows - 1);
        List<Integer> list = resultList.get(resultList.size() - 1);

        List<Integer> curList = new ArrayList();
        curList.add(1);
        for (int i = 1; i < numRows - 1; i++) {
            curList.add(list.get(i - 1) + list.get(i));
        }
        curList.add(1);
        resultList.add(curList);
        return resultList;
    }
}
