package com.study.leetcode.将x减到0的最小操作数;

/**
 * @author peterche
 * @description: 1658 将x减到0的最小操作数
 * @date 2025-02-18
 */
public class Test {
    public static void main(String[] args) {
//        int[] array = {1, 1, 4, 2, 3};
//        int[] array = {5, 6, 7, 8, 9};
//        int[] array = {3, 2, 20, 1, 1, 3};
//        int[] array = {3, 2, 20, 1, 1, 3};
//        int[] array = {1, 1};
        int[] array = {8828,9581,49,9818,9974,9869,9991,10000,10000,10000,9999,9993,9904,8819,1231,6309};
        int i = minOperations(array, 134365);
        System.out.println(i);
    }

    /**
     * 给你一个整数数组 nums 和一个整数 x 。每一次操作时，你应当移除数组 nums 最左边或最右边的元素，然后从 x 中减去该元素的值。请注意，需要 修改 数组以供接下来的操作使用。
     *
     * 如果可以将 x 恰好 减到 0 ，返回 最小操作数 ；否则，返回 -1 。
     *
     *
     *
     * 示例 1：
     *
     * 输入：nums = [1,1,4,2,3], x = 5
     * 输出：2
     * 解释：最佳解决方案是移除后两个元素，将 x 减到 0 。
     * 示例 2：
     *
     * 输入：nums = [5,6,7,8,9], x = 4
     * 输出：-1
     * 示例 3：
     *
     * 输入：nums = [3,2,20,1,1,3], x = 10
     * 输出：5
     * 解释：最佳解决方案是移除后三个元素和前两个元素（总共 5 次操作），将 x 减到 0
     * @param nums
     * @param x
     * @return
     */
    public static int minOperations(int[] nums, int x) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp += nums[i];
        }
        x = temp - x;
        if (x < 0) {
            return -1;
        } else if (x == 0) {
            return nums.length;
        }

        int left = 0;
        int right = 0;
        int count = -1;
        int sum = 0;

        while (right < nums.length) {
            sum += nums[right];
            while (sum >= x) {
                if (sum == x) {
                    count = Math.max(count, right - left + 1);
                }
                sum -= nums[left++];
            }
            right++;
        }
        return count == -1 ? -1 : nums.length - count;
    }
}
