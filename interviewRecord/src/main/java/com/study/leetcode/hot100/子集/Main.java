package com.study.leetcode.hot100.子集;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/11/2 20:42
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = main.subsets(nums);
        System.out.println(subsets);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        res.add(new ArrayList());
        for (int i = 0; i < nums.length; i++) {
            int size = res.size();
            for (int j = 0; j < size; j++) {
                List<Integer> child = new ArrayList(res.get(j));
                child.add(nums[i]);
                res.add(child);
            }
        }
        return res;
    }

}
