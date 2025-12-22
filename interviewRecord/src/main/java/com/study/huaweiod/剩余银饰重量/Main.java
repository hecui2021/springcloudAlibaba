package com.study.huaweiod.剩余银饰重量;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/24 23:46
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        Collections.sort(list);
        Collections.reverse(list);

        while (list.size() >= 3) {
            int z = list.remove(0);
            int y = list.remove(0);
            int x = list.remove(0);

            if (x == y && y == z) {
                continue;
            }

            if (x == y && y != z) {
                list.add(z - y);
            } else if (x != y && y == z) {
                list.add(y - x);
            } else {
                if (z - y > y - x) {
                    list.add(z -y - (y - x));
                } else {
                    list.add(y - x - (z - y));
                }
            }
            Collections.sort(list);
            Collections.reverse(list);
        }
        if (list.size() == 0) {
            System.out.println(0);
        } else {
            System.out.println(list.get(0));
        }
    }
}
