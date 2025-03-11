package com.study.huaweiod.查找充电设备组合;


/**
 * @author peterche
 * @description:
 * @date 2025-02-17
 */
public class Test {

    /**
     * 某个充电站，可提供 n n n 个充电设备，每个充电设备均有对应的输出功率。
     *
     * 任意个充电设备组合的输出功率总和，均构成功率集合 P P P 的 1 1 1 个元素。
     *
     * 功率集合 P P P 的最优元素，表示最接近充电站最大输出功率 p m a x p_{max} p
     *  ma x
     * ​
     *   的元素。
     *
     * 输入描述
     * 输入为 3 3 3 行：
     *
     * 第 1 1 1 行为充电设备个数 n n n
     * 第 2 2 2 行为每个充电设备的输出功率
     * 第 3 3 3 行为充电站最大输出功率 p m a x p_{max} p
     *  ma x
     * ​
     *
     * 输出描述
     * 功率集合 P P P 的最优元素
     *
     * 备注
     * 充电设备个数 0 < n < = 1000 0<n<=1000 0  <   n  <=   1000
     * 最优元素必须小于或等于充电站最大输出功率 p m a x < = 1000 p_{max}<=1000 p
     *  ma x
     * ​
     *    <=   1000
     * @param args
     */
    public static void main(String[] args) {
//        int[] arr = {50, 20, 20, 60};
//        int pMax = 90;

//        int[] arr = {50, 40};
//        int pMax = 30;

        int[] arr = {2, 3, 10};
        int pMax = 9;

        int result = canPartition(arr, pMax);
        System.out.println(result);
    }

    private static int canPartition(int[] nums, int pMax) {
        int n = nums.length;
        int[][] dp = new int[n + 1][pMax + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= pMax; j++) {
                if (nums[i - 1] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - nums[i - 1]] + nums[i - 1]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][pMax];
    }
}
