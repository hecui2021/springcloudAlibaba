package com.study.data;

import java.util.Arrays;

/**
 * @author peterche
 * @description: 排序算法
 * @date 2024-05-21
 */
public class SortAlgorithm {

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {2,1,7,4,5,3,4,9};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 6.快速排序,时间复杂度为O(nlogn)，它的性能比冒泡排序和插入排序要好得多，特别是在大型列表上。
     * @param array
     */
    public static void quickSort(int[] array) {
        quick(array, 0, array.length - 1);
    }

    public static void quick(int[] array, int low, int higt) {
        if (low >= higt) {
            return;
        }
        int pivot = quickPartition(array, low, higt);
        quick(array, low,pivot - 1);
        quick(array, pivot + 1,higt);
    }

    public static int quickPartition(int[] array, int low, int high) {
        int temp = array[low];
        while (low < high) {
            while (low < high && array[high] >= temp) {
                high--;
            }
            array[low] = array[high];
            while (low < high && array[low] <= temp) {
                low++;
            }
            array[high] = array[low];
        }
        array[low] = temp;
        return low;
    }

    /**
     * 5.归并排序,时间复杂度为O(nlogn)，它的性能比冒泡排序和插入排序要好得多，特别是在大型列表上。
     * @param array
     */
    public static void mergeSort(int[] array) {

    }

    public static void merget(int[] array, int left, int mid, int right) {

    }

    /**
     * 4.希尔排序，时间复杂度为O(n^2)
     * @param array
     */
    public static void shellSort(int[] array) {
        for (int i = 0 ; i < array.length ; i++) {

        }
    }

    /**
     * 3.插入排序，时间复杂度为O(n^2)
     * @param array
     */
    public static void insertSort(int[] array) {
        for (int i = 0 ; i < array.length ; i++) {

        }
    }

    /**
     * 2.选择排序,时间复杂度为O(n^2)
     * @param array
     */
    public static void selectSort(int[] array) {
        for (int i = 0 ; i < array.length ; i ++) {
            int temp = array[i];
            for (int j = i + 1 ; j < array.length ; j++) {
                if (temp > array[j]) {
                    array[i] = array[j];
                    array[j] = temp;
                    temp = array[i];
                }
            }
        }
    }

    /**
     * 1.冒泡排序,时间复杂度为O(n^2)
     */
    public static void bubbleSort(int[] array) {
        for (int i = 0 ; i < array.length - 1 ; i++) {
            for (int j = 0 ; j < array.length - 1 - i ;j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
