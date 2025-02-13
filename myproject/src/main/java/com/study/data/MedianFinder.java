package com.study.data;

/**
 * @author peterche
 * @description:
 * @date 2024-05-13
 */
public class MedianFinder {
    int[] array = null;

    public MedianFinder() {

    }

    public void addNum(int num) {
        if (array == null) {
            array = new int[1];
            array[0] = num;
            return ;
        }
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = num;
        // 排序
        for (int i = 0 ; i < newArray.length - 1 ; i++) {
            for (int j = 0 ; j < newArray.length -1 - i; j++) {
                if (newArray[j] > newArray[j + 1]) {
                    int temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }
        array = newArray;
    }

    public double findMedian() {
        if (array.length % 2 == 0) {
            double count = array[array.length/2 - 1] + array[array.length/2];
            return count /2;
        } else {
            return array[array.length/2];
        }
    }
}

