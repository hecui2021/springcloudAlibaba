package com.study.huaweiod.流浪地球;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/2/10 23:18
 */
public class Test {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(i + 1);
        }

        int e = in.nextInt();

        for (int i = 0; i < e; i++) {

        }
    }
}
