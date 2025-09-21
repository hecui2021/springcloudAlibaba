package com.study.leetcode.跳跃游戏;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/20 21:12
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = {2,3,1,1,4};
        boolean b = main.canJump(nums);
        System.out.println(b);
    }

    public boolean canJump(int[] nums) {
        int position = nums.length - 1;
        while (position > 0) {
            boolean flag = false;
            for (int i = 0; i < position; i++) {
                if (i + nums[i] >= position) {
                    position = i;
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return false;
            }
        }
        // if (position == 0) {
        //     return true;
        // }
        return true;
    }
}
