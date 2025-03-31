package com.study.huaweiod.组合出合法最小数;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author peterche
 * @description: 机考
 * @date 2025-03-31
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strs = sc.nextLine().split(" ");
        System.out.println(getResult(strs));
    }

    public static String getResult(String[] strs) {
        Arrays.sort(strs, (a, b) -> (a + b).compareTo(b + a));

        if (strs[0].charAt(0) == '0') {
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].charAt(0) != '0') {
                    strs[0] = strs[i] + strs[0];
                    strs[i] = "";
                    break;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str);
        }

        String ans = sb.toString().replaceAll("^0+", "");

        // 避免返回空串
        return "".equals(ans) ? "0" : ans;
    }
}
