package com.study.huaweiod.构造数列;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/25 22:47
 */
public class Main {
    /**
     * 题目描述
     * 构造数列，第一个数为n，后面的数不大于前一个的一半，数列奇偶相间或许全为奇数或者全为偶数，
     * 数列的元素都是正整数，能构造多少数列。
     *
     * 输入描述
     * 输入一个n
     *
     * 备注
     * 1 <= n < 10000
     * 输出描述
     * 输出可以构造的序列个数
     *
     * 用例1
     * 输入
     * 7
     * 输出
     * 6
     * 说明
     * 可以构成 [7], [7,3], [7,2], [7, 1], [7,3,1],[7,2,1]
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Long count = getCount(n, n, 0);
        System.out.println(count);
    }

    static Map<String, Long> map = new HashMap<>();

    /**
     *
     * @param n
     * @param type 0:不确定 1:奇偶相间 2:全为奇数 3:全为偶数
     * @return
     */
    public static Long getCount(int max, int n, int type) {
        String key = max + ":" + n + ":" + type;
        Long result = map.get(key);
        if (result != null) {
            return result;
        }

        long count = 1;// 数列只有n时
        for (int i = n - 1; i > 0; i--) {
            if (n == max) {
                type = 0;
            }
            if (i <= n / 2) {
                if (type == 0) {
                    // 当前n为数列第一个元素
                    if (n % 2 + i % 2 == 1) {
                        // 奇偶相间
                        type = 1;
                    } else if (n % 2 == 1 && i % 2 == 1) {
                        // 全为奇数
                        type = 2;
                    } else if (n % 2 == 0 && i % 2 == 0) {
                        // 全为偶数
                        type = 3;
                    }
                    count += getCount(max, i, type);
//                    System.out.println(n + "," + i);
                } else {
                    if (type == 1 && n % 2 + i % 2 == 1) {
                        count += getCount(max, i, type);
//                        System.out.println(n + "," + i);
                    } else if (type == 2 && n % 2 == 1 && i % 2 == 1) {
                        count += getCount(max, i, type);
//                        System.out.println(n + "," + i);
                    } else if (type == 3 && n % 2 == 0 && i % 2 == 0) {
                        count += getCount(max, i, type);
//                        System.out.println(n + "," + i);
                    }
                }
            }
        }
        map.put(key, count);
        return count;
    }
}
