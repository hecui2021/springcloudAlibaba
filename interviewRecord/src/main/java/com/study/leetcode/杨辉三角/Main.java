package com.study.leetcode.杨辉三角;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/23 15:12
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        List<List<Integer>> generate = main.generate(5);
        System.out.println(generate);
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
