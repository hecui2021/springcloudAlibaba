package com.study.leetcode.分割等和子集;


/**
 * @author peterche
 * @description:416. 分割等和子集
 * @date 2025-02-17
 */
public class Test {

    /**
     * 给你一个 只包含正整数 的 非空 数组 nums 。请你判断是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。
     *
     *
     *
     * 示例 1：
     *
     * 输入：nums = [1,5,11,5]
     * 输出：true
     * 解释：数组可以分割成 [1, 5, 5] 和 [11] 。
     * 示例 2：
     *
     * 输入：nums = [1,2,3,5]
     * 输出：false
     * 解释：数组不能分割成两个元素和相等的子集。
     * @param args
     */
    public static void main(String[] args) {
//        int[] nums = {1,5,11,5};
//        int[] nums = {1, 2, 3, 5};
        int[] nums = {2, 2, 1, 1};
        boolean b = canPartition(nums);
        System.out.println(b);

    }

    private static boolean canPartition(int[] nums) {
        int[][] dp = new int[nums.length + 1][nums.length + 1];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            dp[i][0] = 0;
            dp[0][i] = 0;
            sum += nums[i];
        }
        if (sum % 2 != 0) {
            return false;
        }

        for (int i = 1; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (j >= 1) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - 1] + nums[i - 1]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
                if (dp[i][j] * 2 == sum) {
                    return true;
                }
            }
        }
        return false;
    }


}
