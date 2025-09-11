package com.study.huaweiod.数据分类;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/8 14:43
 */
public class Main {
    // 输入获取
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        int b = sc.nextInt();

        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) arr[i] = sc.nextInt();

        System.out.println(getResult(c, b, arr));
    }

    // 算法入口
    public static int getResult(int c, int b, int[] arr) {
        HashMap<Integer, Integer> count = new HashMap<>();

        Arrays.stream(arr)
                .map(
                        a -> {
                            String str = Integer.toHexString(a);

                            if (str.length() % 2 != 0) {
                                str = "0" + str;
                            }

                            int sum = 0;
                            for (int i = 0; i < str.length() - 1; i += 2) {
                                sum += Integer.parseInt(str.substring(i, i + 2), 16);
                            }

                            int t = sum % b;
                            if (t < c) {
                                return t;
                            } else {
                                return -1;
                            }
                        })
                .forEach(
                        t -> {
                            if (t != -1) {
                                count.put(t, count.getOrDefault(t, 0) + 1);
                            }
                        });

        return count.values().stream().max((x, y) -> x - y).orElse(0);
    }
}
