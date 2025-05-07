package com.study.huaweiod.完美走位;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author peterche
 * @description:
 * @date 2025-05-07
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] array = str.split("");
        int aCount = 0;
        int sCount = 0;
        int dCount = 0;
        int wCount = 0;

        for (int i = 0; i < array.length; i++) {
            if ("A".equals(array[i])) {
                aCount++;
            } else if ("S".equals(array[i])) {
                sCount++;
            } else if ("D".equals(array[i])) {
                dCount++;
            } else if ("W".equals(array[i])) {
                wCount++;
            }
        }

        int aCountResult = aCount - array.length / 4;
        int sCountResult = sCount - array.length / 4;
        int dCountResult = dCount - array.length / 4;
        int wCountResult = wCount - array.length / 4;

        if (aCountResult == 0 && sCountResult == 0 && dCountResult == 0 && wCountResult == 0) {
            System.out.println(0);
            return;
        }

        int left = 0;
        int right = 0;
        int min = array.length;
        while (right < array.length) {
            if (isOk(array, left, right, aCountResult, sCountResult, dCountResult, wCountResult)) {
                min = Math.min(min, right - left + 1);
                left++;
                continue;
            }
            right++;
        }
        System.out.println(min);

    }

    public static boolean isOk(String[] array, int left, int right,
                               int aCountResult, int sCountResult, int dCountResult, int wCountResult) {

        int aCount = 0;
        int sCount = 0;
        int dCount = 0;
        int wCount = 0;
        for (int i = left; i <= right; i++) {
            if ("A".equals(array[i])) {
                aCount++;
            } else if ("S".equals(array[i])) {
                sCount++;
            } else if ("D".equals(array[i])) {
                dCount++;
            } else if ("W".equals(array[i])) {
                wCount++;
            }
        }

        if (aCountResult > 0 && aCount < aCountResult) {
            return false;
        }
        if (sCountResult > 0 && sCount < sCountResult) {
            return false;
        }
        if (dCountResult > 0 && dCount < dCountResult) {
            return false;
        }
        if (wCountResult > 0 && wCount < wCountResult) {
            return false;
        }
        return true;
    }
}