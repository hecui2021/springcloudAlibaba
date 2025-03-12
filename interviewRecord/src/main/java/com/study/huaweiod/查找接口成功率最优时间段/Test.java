package com.study.huaweiod.查找接口成功率最优时间段;


import java.util.ArrayList;
import java.util.List;

/**
 * @author peterche
 * @description:
 * @date 2025-02-17
 */
public class Test {
    /**
     * 题目描述
     * 服务之间交换的接口成功率作为服务调用关键质量特性，某个时间段内的接口失败率使用一个数组表示，
     *
     * 数组中每个元素都是单位时间内失败率数值，数组中的数值为0~100的整数，
     *
     * 给定一个数值(minAverageLost)表示某个时间段内平均失败率容忍值，即平均失败率小于等于minAverageLost，
     *
     * 找出数组中最长时间段，如果未找到则直接返回NULL。
     *
     * 输入描述
     * 输入有两行内容，第一行为{minAverageLost}，第二行为{数组}，数组元素通过空格(” “)分隔，
     *
     * minAverageLost及数组中元素取值范围为0~100的整数，数组元素的个数不会超过100个。
     *
     * 输出描述
     * 找出平均值小于等于minAverageLost的最长时间段，输出数组下标对，格式{beginIndex}-{endIndx}(下标从0开始)，
     *
     * 如果同时存在多个最长时间段，则输出多个下标对且下标对之间使用空格(” “)拼接，多个下标对按下标从小到大排序。
     * @param args
     */
    public static void main(String[] args) {
        int minAverageLost = 2;
//        int[] array = {0 ,1 ,2, 3, 4};
        int[] array = {0 ,0 ,100, 2, 2, 99, 0, 2};

        int maxLength = 0;
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int sum = getSum(array, i, j);
                int length = j - i + 1;
                if (sum <= minAverageLost * length) {
                    if (length > maxLength) {
                        maxLength = length;
                        personList.clear();
                        personList.add(new Person(i, j, sum, length));
                    } else if (length == maxLength) {
                        personList.add(new Person(i, j, sum, length));
                    }
                }
            }
        }
        System.out.println(personList.toString());
    }

    public static int getSum(int[] array, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += array[i];
        }
        return sum;
    }

    static class Person {
        public int start;
        public int end;
        public int sum;
        public int length;


        public Person(int start, int end, int sum, int length) {
            this.start = start;
            this.end = end;
            this.sum = sum;
            this.length = length;
        }
    }
}
