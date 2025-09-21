package com.study.leetcode.跳跃游戏II;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/19 14:08
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = {2, 3, 1, 1, 4};
        int jump = main.jump(nums);
        System.out.println(jump);
    }
    /**
     * 给定一个长度为 n 的 0 索引整数数组 nums。初始位置在下标 0。
     *
     * 每个元素 nums[i] 表示从索引 i 向后跳转的最大长度。换句话说，如果你在索引 i 处，你可以跳转到任意 (i + j) 处：
     *
     * 0 <= j <= nums[i] 且
     * i + j < n
     * 返回到达 n - 1 的最小跳跃次数。测试用例保证可以到达 n - 1。
     *
     *
     *
     * 示例 1:
     *
     * 输入: nums = [2,3,1,1,4]
     * 输出: 2
     * 解释: 跳到最后一个位置的最小跳跃数是 2。
     *      从下标为 0 跳到下标为 1 的位置，跳 1 步，然后跳 3 步到达数组的最后一个位置。
     * 示例 2:
     *
     * 输入: nums = [2,3,0,1,4]
     * 输出: 2
     * @param nums
     * @return
     */
    public int jump(int[] nums) {
        int position = nums.length - 1;
        int steps = 0;
        while (position > 0) {
            for (int i = 0; i < position; i++) {
                if (i + nums[i] >= position) {
                    position = i;
                    steps++;
                }
            }
        }
        return steps;
    }
}
