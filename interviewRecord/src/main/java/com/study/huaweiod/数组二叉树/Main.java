package com.study.huaweiod.数组二叉树;

import java.util.*;

/**
 * @author peterche
 * @description:
 * @date 2025-05-07
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String[] strArray = str.split(" ");


        List<Integer> list = new ArrayList();
        list.add(0);
        for (int i = 0; i < strArray.length; i++) {
            list.add(Integer.parseInt(strArray[i]));
        }

        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 1; i < list.size(); i++) {
            int value = list.get(i);
            if (value == -1) {
                continue;
            }
            if (2 * i >= list.size() || 2 * i + 1 >= list.size()) {
                if (value < min) {
                    min = value;
                    index = i;
                }
                continue;
            }
            int valueLeft = list.get(2 * i);
            int valueRight = list.get(2 * i + 1);
            if (valueLeft == -1 && valueRight == -1) {
                if (value < min) {
                    min = value;
                    index = i;
                }
            }
        }

        String result = "";
        while (index > 1) {
            result = list.get(index) +  " " + result;
            index = index / 2;
        }
        result = list.get(1) + " " + result;
        result = result.substring(0, result.length() - 1);
        System.out.println(result);
    }
}
