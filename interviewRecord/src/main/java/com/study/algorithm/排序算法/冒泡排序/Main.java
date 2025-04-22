package com.study.algorithm.排序算法.冒泡排序;

import java.util.Arrays;

/**
 * @author peterche
 * @description:
 * @date 2025-04-21
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 1, 0, 10, 7, 8};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 基本思想：通过相邻元素比较和交换，逐步将最大值“冒泡”到末尾。
     *
     * 时间复杂度：O(n²)（最优情况O(n)）。
     *
     * 稳定性：稳定。
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 -i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
