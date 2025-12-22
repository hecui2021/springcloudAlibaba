package com.study.leetcode.hot100.组合总和;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/10/29 21:25
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] candidates = {2, 3, 6, 7};
        List<List<Integer>> lists = main.combinationSum(candidates, 7);
        System.out.println(lists);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList();
        List<Integer> childList = new ArrayList();

        dfs(candidates, target, res, childList, 0);
        return res;
    }

    public void dfs(int[] candidates, int target, List<List<Integer>> res, List<Integer> childList, int index) {
        if (index == candidates.length) {
            return;
        }

        if (target == 0) {
            res.add(new ArrayList<Integer>(childList));
        }

        for (int i = index; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                childList.add(candidates[i]);
                dfs(candidates, target - candidates[i], res, childList, i);
                childList.remove(childList.size() - 1);
            }
        }
    }
}
