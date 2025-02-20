package com.study.huaweiod.补种未成活的胡杨;

import java.util.Scanner;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/2/10 23:18
 */
public class Test {

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
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("种植了" + n + "颗");
        // m颗未成活
        int m = in.nextInt();
        System.out.println(m + "颗不成活");
        int[] array = new int[m];

        for (int i = 0; i < m; i++) {
            array[i] = 1;
        }

        for (int i = 0; i < m; i++) {
            int mi = in.nextInt();
            array[mi] = 0;
        }
        System.out.println(m + "颗不成活的位置如上");
        int k = in.nextInt();
        System.out.println("补种" + k + "颗");


    }
}
