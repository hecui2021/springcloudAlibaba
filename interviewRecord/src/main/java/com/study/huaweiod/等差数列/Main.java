package com.study.huaweiod.等差数列;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/26 22:22
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += getResult(i);
        }
        System.out.println(sum);
    }

    static Map<Integer, Integer> map = new HashMap<>();

    public static int getResult(int n) {
        if (n == 1) {
            return 2;
        }
        Integer result = map.get(n);
        if (result != null) {
            return result;
        }
        result = getResult(n - 1) + 3;
        map.put(n, result);
        return result;
    }
}
