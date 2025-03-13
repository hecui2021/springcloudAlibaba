package com.study.huaweiod.最大社交距离;


import java.util.Arrays;

/**
 * @author peterche
 * @description:
 * @date 2025-02-17
 */
public class Test {

    /**
     * 题目描述
     * 疫情期间需要大家保证一定的社交距离，公司组织开交流会议。座位一排共 N 个座位，编号分别为[0,N-1],
     *
     * 要求员工一个接着一个进入会议室，并且可以在任何时候离开会议室。
     *
     * 满足：
     *
     * 每当一个员工进入时，需要坐到最大社交距离（最大化自己和其他人的距离的座位）；
     * 如果有多个这样的座位，则坐到索引最小的那个座位。
     * 输入描述
     * 会议室座位总数 seatNum
     *
     * 1 ≤ seatNum ≤ 500
     * 员工的进出顺序 seatOrLeave 数组
     *
     * 元素值为 1，表示进场
     *
     * 元素值为负数，表示出场（特殊：位置 0 的员工不会离开）
     *
     * 例如 -4 表示坐在位置 4 的员工离开（保证有员工坐在该座位上）
     *
     * 输出描述
     * 最后进来员工，他会坐在第几个位置，如果位置已满，则输出-1。
     *
     * 0 0 0 0 0 0 0 0 0 0
     * 1 0 0 0 0 0 0 0 0 0
     * 1 0 0 0 0 0 0 0 0 1
     * 1 0 0 0 1 0 0 0 0 1
     * 1 0 1 0 1 0 0 0 0 1
     * 1 0 1 0 0 0 0 0 0 1
     * 1 0 1 0 0 1 0 0 0 1
     *
     * @param args
     */
    public static void main(String[] args) {
        int n = 6;
//        int[] array = {1, 1, 1, 1, -4, 1};
        int[] array = {1, 1, 1, 1, 1, 1, 1};

        int[] seat = new int[n];

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                int index = getIndex(seat);
                System.out.println(index);
                if (index == -1) {
                    System.out.println(-1);
                    return;
                }
                seat[index] = 1;
            } else if (array[i] < 0) {
                seat[0 -array[i]] = 0;
            }
            System.out.println(Arrays.toString(seat));
        }
    }

    public static int getIndex(int[] array) {
        if (array[0] == 0) {
            return 0;
        }
        if (array[array.length - 1] == 0) {
            return array.length - 1;
        }
        int start = 0;
        int maxLength = 0;
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == 1) {
                int length = (i - start) / 2;
                if (length > maxLength) {
                    maxLength = length;
                    index = (start + i) / 2;
                }
                start = i;
            }
        }
        if (maxLength == 0) {
            // 数组满了
            return -1;
        }
        return index;
    }


}
