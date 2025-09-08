package com.study.huaweiod.寻找密码;

import java.util.*;

/**
 * @author peterche
 * @description:
 * @date 2025-04-22
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();

        String[] array = str.split(" ");

        List<String> list = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            boolean flag = true;
            for (int j = 0; j < array[i].length(); j++) {
                String childStr = array[i].substring(0, j + 1);
                if (!isOk(array, childStr)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                // 有存在的
                list.add(array[i]);
            }
        }
        list.sort(Main::compare);

        System.out.println(list.get(list.size() - 1));

    }

    // 自定义排序规则：按长度升序，相同长度按字典序
    public static int compare(String a, String b) {
        if (a.length() == b.length()) {
            return a.compareTo(b);
        }
        return Integer.compare(a.length(), b.length());
    }

    public static boolean isOk(String[] array, String str) {
        for (int i = 0; i < array.length; i++) {
            if (str.equals(array[i])) {
                return true;
            }
        }
        return false;
    }

}