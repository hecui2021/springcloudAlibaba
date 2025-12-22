package com.study.leetcode.hot100.盛最多水的容器;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/10/22 23:02
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] height = {1,8,6,2,5,4,8,3,7};
        int i = main.maxArea(height);
        System.out.println(i);
    }

    public int maxArea(int[] height) {
        int start = 0;
        int end = 1;
        int max = 0;
        while (end < height.length) {
            int sum = Math.min(height[start], height[end]) * (end - start);
            if (sum > max) {
                max = sum;
                end++;
                continue;
            }
            start++;
            end = start;
        }
        return max;
    }
}
