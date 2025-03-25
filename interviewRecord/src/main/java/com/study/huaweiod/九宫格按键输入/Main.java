package com.study.huaweiod.九宫格按键输入;

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

        // 是否为数字模式
        boolean modeIsNum = true;

        String result = "";

        // 上一个出现的数字
        int lastNum = -1;
        // 上一个数字出现的次数
        int lastNumTimes = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                modeIsNum = !modeIsNum;
                result += getStr(lastNum, lastNumTimes);
                lastNum = -1;
                lastNumTimes = 0;
                continue;
            } else if (str.charAt(i) == '/') {
                result += getStr(lastNum, lastNumTimes);
                lastNum = -1;
                lastNumTimes = 0;
                continue;
            }
            //当前字符和上一个字符不同，或者当前为数字模式，直接拼接结果
            if (Integer.parseInt(String.valueOf(str.charAt(i))) != lastNum || modeIsNum) {
                result += getStr(lastNum, lastNumTimes);
                lastNum = Integer.parseInt(String.valueOf(str.charAt(i)));
                lastNumTimes = 1;
                continue;
            }
            lastNumTimes++;
        }
        result += getStr(lastNum, lastNumTimes);
        System.out.println(result);
    }

    public static String getStr(int num, int numTimes) {
        if (num <0 || num > 9) {
            return "";
        }
        String[] array = {"", ",.", "abc", "def", "ghi", "jkl", "mno", "pqs", "tuv", "wxyz"};
        String str = array[num];
        String[] newArray = str.split("");
        int count = numTimes % newArray.length;
        return newArray[count - 1];
    }

}
