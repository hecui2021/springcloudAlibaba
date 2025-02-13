package com.study.data;

/**
 * @author peterche
 * @description:
 * @date 2024-07-04
 */
public class 所有数对中数位不同之和 {
    /**
     * 车尔尼有一个数组 nums ，它只包含 正 整数，所有正整数的数位长度都 相同 。
     *
     * 两个整数的 数位不同 指的是两个整数 相同 位置上不同数字的数目。
     *
     * 请车尔尼返回 nums 中 所有 整数对里，数位不同之和。
     *
     *
     *
     * 示例 1：
     *
     * 输入：nums = [13,23,12]
     *
     * 输出：4
     *
     * 解释：
     * 计算过程如下：
     * - 13 和 23 的数位不同为 1 。
     * - 13 和 12 的数位不同为 1 。
     * - 23 和 12 的数位不同为 2 。
     * 所以所有整数数对的数位不同之和为 1 + 1 + 2 = 4 。
     *
     * 示例 2：
     *
     * 输入：nums = [10,10,10,10]
     *
     * 输出：0
     *
     * 解释：
     * 数组中所有整数都相同，所以所有整数数对的数位不同之和为 0 。
     */
    public static long sumDigitDifferences(int[] nums) {
        long count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                count += getCount(nums[i], nums[j]);
            }
        }
        return count;
    }

    public static int getCount(int a, int b) {
        int count = 0;
        while (true) {
            if (a % 10 != b % 10) {
                count++;
            }
            if (a < 10 || b < 10) {
                break;
            }
            a /= 10;
            b /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = {13,23,12};
        long count = sumDigitDifferences(nums);
        System.out.println(count);

    }
}
