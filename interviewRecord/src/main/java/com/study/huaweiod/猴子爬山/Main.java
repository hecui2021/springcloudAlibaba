package com.study.huaweiod.猴子爬山;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/26 22:02
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        Long count = getCount(n);
        System.out.println(count);

    }

    static Map<Integer, Long> map = new HashMap<>();

    public static Long getCount(int n) {
        if (n == 1 || n == 2) {
            return 1l;
        }
        if (n == 3) {
            return 2l;
        }

        Long count = map.get(n);
        if (count != null) {
            return count;
        }

        count = getCount(n - 1) + getCount(n - 3);
        map.put(n, count);
        return count;
    }
}
