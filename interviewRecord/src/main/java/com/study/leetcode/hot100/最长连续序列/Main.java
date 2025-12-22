package com.study.leetcode.hot100.最长连续序列;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/10/22 15:55
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = {100, 4, 200, 1, 3, 2};
        int i = main.longestConsecutive(nums);
        System.out.println(i);
    }

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int max = 0;
        for (int num : set) {
            int count = 0;
            if (!set.contains(num - 1)) {
                while (true) {
                    if (set.contains(num)) {
                        count++;
                        num++;
                        continue;
                    }
                    break;
                }
            }

            max = Math.max(max, count);
        }
        return max;
    }
}
