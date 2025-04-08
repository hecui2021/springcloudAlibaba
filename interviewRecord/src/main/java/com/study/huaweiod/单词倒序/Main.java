package com.study.huaweiod.单词倒序;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/3/29 12:34
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        scanner.close();
        int start = -1;
        int end = 0;
        while (end < inputStr.length()) {
            if (isZimu(inputStr, end)) {
                if (start == -1) {
                    start = end;
                }
                end++;
                continue;
            }
            // 当前字符不是字母
            if (start != -1) {
                String oldStr = inputStr.substring(start, end);
                String newStr = "";
                for (int i = oldStr.length() - 1; i >= 0; i--) {
                    newStr += oldStr.charAt(i);
                }
//            inputStr = inputStr.replaceAll(oldStr, newStr);
                inputStr = inputStr.substring(0, start) + newStr + inputStr.substring(end, inputStr.length());

                start = -1;
            }
            end++;
        }
        System.out.println(inputStr);
    }

    public static boolean isZimu(String inputStr, int end) {
        if (inputStr.charAt(end) == ' ') {
            return false;
        }
        if (inputStr.charAt(end) == ',') {
            return false;
        }
        if (inputStr.charAt(end) == '.') {
            return false;
        }
        if (inputStr.charAt(end) == '?') {
            return false;
        }
        return true;
    }
}
