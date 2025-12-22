package com.study.huaweiod.相对开音节;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/30 18:22
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        String[] array = str.split(" ");
        int count = 0;
        for (int i = 0; i< array.length; i++) {
            if (isReverse(array[i])) {
                array[i] = reverse(array[i]);
//                System.out.println(array[i]);
            }
            count += getCount(array[i]);
        }
        System.out.println(count);
        scanner.close();
    }

    static Set<Character> set = new HashSet<>();

    public static int getCount(String str) {
        if (str.length() < 4) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            char first = str.charAt(i);
            char second = str.charAt(i + 1);
            char third = str.charAt(i + 2);
            char four = str.charAt(i + 3);
            if (!set.contains(first) && set.contains(second) && !set.contains(third) &&
                    third != 'r' && four == 'e') {
                count++;
            }
        }
        return count;
    }



    public static String reverse(String str) {
        if (str == null) {
            return null;
        }
        StringBuffer sb = new StringBuffer();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static boolean isReverse(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 97 && c <= 122) {
                continue;
            }
            return false;
        }
        return true;
    }
}
