package com.study.huaweiod.单词接龙;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/30 22:10
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.nextLine();

        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextLine());
        }
        String result = getStr(list.get(k), list);
        System.out.println(result);

        scanner.close();
    }

    public static String getStr(String cur, List<String> list) {
        if (cur == null) {
            return null;
        }
        list.remove(cur);

        char flag = cur.charAt(cur.length() - 1);

        String nextStr = null;

        for (String str : list) {
            if (str.startsWith(String.valueOf(flag))) {
                if (nextStr == null) {
                    nextStr = str;
                }
                if (str.length() > nextStr.length()) {
                    nextStr = str;
                }
                if (str.length() == nextStr.length() && nextStr.compareTo(str) > 0) {
                    nextStr = str;
                }
            }
        }
        if (nextStr == null) {
            return cur;
        }
        cur += nextStr;
        list.remove(nextStr);
        return getStr(cur, list);
    }
}
