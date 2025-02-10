package com.study.huaweiod.分苹果;

import java.util.Scanner;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/2/10 23:18
 */
public class Test {

    /**
     * A 、 B 两个人把苹果分为两堆， A希望按照他的计算规则等分苹果，他的计算规则是按照二进制加法计算，
     * 并且不计算进位 12 + 5 = 9 （ 1100 + 0101 = 9 ）1001
     * B的计算规则是十进制加法，包括正常进位， B希望在满足 A的情况下获取苹果重量最多。
     *
     * 输入苹果的数量和每个苹果重量，输出满足 A的情况下 B获取的苹果总重量。
     *
     * 如果无法满足 A的要求，输出 − 1 -1 − 1 。
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] w = new long[n];

        long sum = 0;
        long minValue = Long.MAX_VALUE;
        long xorSum = 0;

        for (int i = 0; i < n; i++) {

            w[i] = scanner.nextLong();
            sum += w[i];
            minValue = Math.min(minValue, w[i]);
            xorSum ^= w[i];
        }

        // 所有元素的异或和为0时可以满足A等分的要求
        if (xorSum != 0) {

            System.out.println(-1);
        } else {

            System.out.println(sum - minValue);
        }
    }
}
