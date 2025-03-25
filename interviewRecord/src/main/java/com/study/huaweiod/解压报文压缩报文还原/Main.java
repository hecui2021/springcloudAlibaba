package com.study.huaweiod.解压报文压缩报文还原;

import java.util.*;

/**
 * @author peterche
 * @description:
 * @date 2025-03-25
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();

        while (str.contains("[")) {
            int start = 0;
            int end = 0;
            for (int i = 0; i < str.length(); i++) {
                if ('[' == str.charAt(i)) {
                    start = i;
                }
                if (']' == str.charAt(i) && start != -1) {
                    end = i;
                    int n = Integer.parseInt(String.valueOf(str.charAt(start - 1)));
                    String old = str.substring(start - 1, end + 1);
                    String replaceStr = str.substring(start + 1, end);
                    String replaceNewStr = "";
                    for (int j = 0; j < n ; j++) {
                        replaceNewStr += replaceStr;
                    }
                    if (start > 2) {
                        str = str.substring(0, start -1) + replaceNewStr + str.substring(end + 1, str.length());
                    } else {
                        str = replaceNewStr + str.substring(end + 1, str.length());
                    }
                    start = -1;
                }
            }
        }
        System.out.println(str);
    }
}
