package com.study.huaweiod.用连续自然数之和来表达整数;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/24 23:28
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.close();

        int start = 1;
        int end = 1;
        List<String> list = new ArrayList<>();
        while (end <= t) {
            if (getSum(start, end) < t) {
                end++;
                continue;
            }
            if (getSum(start, end) == t) {
                if (start == end) {
                    list.add(t + "=" + t);
                } else {
                    StringBuffer buffer = new StringBuffer();
                    buffer.append(t).append("=");
                    for (int i = start; i <= end; i++) {
                        if (i != end) {
                            buffer.append(i).append("+");
                        } else {
                            buffer.append(i);
                        }
                    }
                    list.add(buffer.toString());
                }
                end++;
                continue;
            }
            start++;
        }
        Collections.reverse(list);
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("Result:" + list.size());
    }

    public static int getSum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
}
