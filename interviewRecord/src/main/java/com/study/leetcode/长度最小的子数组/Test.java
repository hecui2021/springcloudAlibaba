package com.study.leetcode.长度最小的子数组;

/**
 * @author peterche
 * @description:
 * @date 2025-02-17
 */
public class Test {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);

//        int[] array = {1, 1, 1, 1, 1, 1, 1, 1};
        int[] array = {2, 3, 1, 2, 4, 3};
        int minarrays = minarrays2(array, 7);
        System.out.println(minarrays);

    }

    /**
     * 滑动窗口算法
     * @param nums
     * @param target
     * @return
     */
    public static int minarrays2(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int count = Integer.MAX_VALUE;

        int left = 0, right = 0, sum = 0;
        while (right < nums.length) {
            sum += nums[right];
            while (sum >= target) {
                count = Math.min(count, right - left + 1);
                sum -= nums[left];
                left++;
            }
            right++;
        }
        return count == Integer.MAX_VALUE ? 0 : count;
    }

    /**
     * 暴力解法，时间复杂度太高
     * @param arr
     * @param target
     * @return
     */
    public static int minarrays(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int count = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == target) {
                    count = Math.min(j - i + 1, count);
                }
            }
        }
        if (count == Integer.MAX_VALUE) {
            return 0;
        }
        return count;
    }
}
