package com.study.huaweiod.补种未成活的胡杨;

import java.util.Scanner;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/2/10 23:18
 */
public class Main {

    /**
     * 近些年来，我国防沙治沙取得显著成果。某沙漠新种植 N N N 棵胡杨（编号 1 − N 1-N 1  −   N ），排成一排。
     *
     * 一个月后，有 M M M 棵胡杨未能成活。
     *
     * 现可补种胡杨 K K K 棵，请问如何补种（只能补种，不能新种），可以得到最多的连续胡杨树？
     *
     * 输入描述
     * N N N 总种植数量， 1 ≤ N ≤ 100000 1 ≤ N ≤ 100000 1  ≤   N  ≤   100000
     *
     * M M M 未成活胡杨数量， M M M 个空格分隔的数，按编号从小到大排列， 1 ≤ M ≤ N 1 ≤ M ≤ N 1  ≤   M  ≤   N
     *
     * K K K 最多可以补种的数量， 0 ≤ K ≤ M 0 ≤ K ≤ M 0  ≤   K  ≤   M
     *
     * 输出描述
     * 最多的连续胡杨棵树
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        // 读取换行
        scanner.nextLine();
        String mStr = scanner.nextLine();
        int k = scanner.nextInt();

        // 10101
        int[] array = new int[n];
        String[] mArray = mStr.split(" ");
        for (int i = 0; i < mArray.length; i++) {
            array[Integer.parseInt(mArray[i]) - 1] = 1;
        }

        int start = 0;
        int end = 0;
        int max = 0;
        while (end < array.length) {
            while (getCount(array, start, end) > k) {
                start++;
            }
            max = Math.max(max, end - start + 1);
            end++;
        }
        System.out.println(max);

        scanner.close();
    }

    public static int getCount(int[] array, int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (array[i] == 1) {
                count++;
            }
        }
        return count;
    }
}
