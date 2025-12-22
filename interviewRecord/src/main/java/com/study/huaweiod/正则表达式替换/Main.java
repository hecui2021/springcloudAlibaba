package com.study.huaweiod.正则表达式替换;

import java.util.Scanner;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/30 17:48
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '_') {
                sb.append(str.charAt(i));
            } else {
                sb.append("(^|$|[,+])");
            }
        }
        System.out.println(sb);
        scanner.close();
    }
}
