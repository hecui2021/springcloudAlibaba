package com.study.leetcode.hot100.全排列;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/10/29 16:19
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = {1, 2, 3};
        List<List<Integer>> permute = main.permute(nums);
        System.out.println(permute);
    }

    public List<List<Integer>> permute(int[] nums) {
        return permute(new ArrayList<>(), nums, 0);
    }

    public List<List<Integer>> permute(List<List<Integer>> list, int[] nums, int index) {
        if (index == nums.length) {
            return list;
        }

        List<List<Integer>> resultList = new ArrayList();
        if (index == 0) {
            List<Integer> childList = new ArrayList();
            childList.add(nums[0]);
            resultList.add(childList);
            return permute(resultList, nums, index + 1);
        }

        for (int i = 0; i < list.size(); i++) {
            List<Integer> childList = list.get(i);
            List<Integer> first = new ArrayList();
            first.add(nums[index]);
            first.addAll(childList);
            resultList.add(first);

            for (int j = 0; j < childList.size(); j++) {
                List<Integer> befor = new ArrayList();
                befor.addAll(childList.subList(0, j + 1));
                befor.add(nums[index]);
                befor.addAll(childList.subList(j + 1, childList.size()));
                resultList.add(befor);
            }
        }
        return permute(resultList, nums, index + 1);
    }
}
