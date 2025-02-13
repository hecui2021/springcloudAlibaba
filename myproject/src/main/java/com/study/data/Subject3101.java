package com.study.data;

/**
 * @author peterche
 * @description: 3101. 交替子数组计数
 * @date 2024-05-13
 */
public class Subject3101 {
    /**
     * 给你一个
     * 二进制数组
     * nums 。
     *
     * 如果一个
     * 子数组
     * 中 不存在 两个 相邻 元素的值 相同 的情况，我们称这样的子数组为 交替子数组 。
     *
     * 返回数组 nums 中交替子数组的数量。
     *
     *
     *
     * 示例 1：
     *
     * 输入： nums = [0,1,1,1]
     *
     * 输出： 5
     *
     * 解释：
     *
     * 以下子数组是交替子数组：[0] 、[1] 、[1] 、[1] 以及 [0,1] 。
     *
     * 示例 2：
     *
     * 输入： nums = [1,0,1,0]
     *
     * 输出： 10
     *
     * 解释：
     *
     * 数组的每个子数组都是交替子数组。可以统计在内的子数组共有 10 个。
     */
    public static long countAlternatingSubarrays(int[] nums) {
        long count = 0L;
        for (int i = 0 ; i < nums.length ; i++) {
            for (int j = i ; j < nums.length ; j++) {
                boolean flag = true;
                for (int k = i ; k < j ; k++) {
                    if (nums[k] == nums[k + 1]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    count++;
                }
            }
        }
        return count;
    }

    public long countAlternatingSubarrays2(int[] nums) {
        long ans = 0, cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            cnt = i > 0 && nums[i] == nums[i - 1] ? 1 : cnt + 1;
            ans += cnt; // 有 cnt 个以 i 为右端点的交替子数组
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] array = {1,0,1,0};
//        int[] array = {0,1,1,1};
        long l = countAlternatingSubarrays(array);
        System.out.println(l);
    }


}
