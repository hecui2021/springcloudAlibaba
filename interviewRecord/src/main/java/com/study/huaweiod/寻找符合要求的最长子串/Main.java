package com.study.huaweiod.寻找符合要求的最长子串;

import java.util.*;

/**
 * @author peterche
 * @description:
 * @date 2025-03-28
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputK = scanner.nextLine();
        String inputStr = scanner.nextLine();
        scanner.close();

        int start = 0;
        int end = 0;
        int maxLength = 1;
        while (end < inputStr.length()) {
            if (isOk(inputStr, start, end, inputK)) {
                maxLength = end - start + 1;
                end++;
                continue;
            }
            start = end + 1;
            end = end + 1;
        }
        System.out.println(maxLength);
    }

    public static boolean isOk(String inputStr, int start, int end, String inputK) {
        Map<String, Integer> map = new HashMap();
        for (int i = start; i <= end; i++) {
            String str = inputStr.charAt(i) + "";
            if (inputK.equals(str)) {
                return false;
            }
            Integer count = map.get(str);
            if (count != null && count > 2) {
                return false;
            }
            count = count == null ? 1 : count + 1;
            map.put(inputStr.charAt(i) + "", count);
        }
        return true;
    }
}
