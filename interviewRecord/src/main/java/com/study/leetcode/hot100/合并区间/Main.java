package com.study.leetcode.hot100.合并区间;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/10/26 21:33
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[][] intervals = {{2,3},{2,2},{3,3},{1,3},{5,7},{2,2},{4,6}};
        int[][] merge = main.merge(intervals);
        System.out.println(merge);
    }

    public int[][] merge(int[][] intervals) {
        for (int i = 0; i < intervals.length - 1; i++) {
            for (int j = 0; j < intervals.length - 1 - i; j++) {
                if (intervals[j][0] > intervals[j + 1][0]) {
                    int[] temp = intervals[j];
                    intervals[j] = intervals[j + 1];
                    intervals[j + 1] = temp;
                }
            }
        }

        int[][] result = sdf(intervals, 0);
        return result;
    }

    public int[][] sdf(int[][] array, int index) {
        if (index == array.length - 1) {
            return array;
        }
        int[] pre = array[index];
        int[] cur = array[index + 1];
        if (pre[1] < cur[0]) {
            return sdf(array, index + 1);
        }
        int right;
        if (pre[1] > cur[1]) {
            right = pre[1];
        } else {
            right = cur[1];
        }
        int[][] newArray = new int[array.length - 1][2];
        int[] newCur = {pre[0], right};
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = newCur;
        for (int i = index + 1; i < newArray.length; i++) {
            newArray[i] = array[i + 1];
        }
        return sdf(newArray, index);
    }
}
