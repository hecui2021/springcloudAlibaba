package com.study.huaweiod.密码解密;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String str1 = "20\\*19\\*20\\*";
        str1 = str1.replaceAll("19\\*", "s");

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        Map<String, String> map1 = new HashMap<>();
        map1.put("10\\*", "j");
        map1.put("11\\*", "k");
        map1.put("12\\*", "l");
        map1.put("13\\*", "m");
        map1.put("14\\*", "n");
        map1.put("15\\*", "o");
        map1.put("16\\*", "p");
        map1.put("17\\*", "q");
        map1.put("18\\*", "r");
        map1.put("19\\*", "s");
        map1.put("20\\*", "t");
        map1.put("21\\*", "u");
        map1.put("22\\*", "v");
        map1.put("23\\*", "w");
        map1.put("24\\*", "x");
        map1.put("25\\*", "y");
        map1.put("26\\*", "z");

        Map<String, String> map2 = new HashMap<>();
        map2.put("1", "a");
        map2.put("2", "b");
        map2.put("3", "c");
        map2.put("4", "d");
        map2.put("5", "e");
        map2.put("6", "f");
        map2.put("7", "g");
        map2.put("8", "h");
        map2.put("9", "i");

        for (String key : map1.keySet()) {
            str = str.replaceAll(key, map1.get(key));
        }
        for (String key : map2.keySet()) {
            str = str.replaceAll(key, map2.get(key));
        }
        System.out.println(str);

    }
}
