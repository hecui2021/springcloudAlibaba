package com.study.huaweiod.端口合并;

import java.util.*;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/30 16:44
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 1 || n > 10) {
            System.out.println("[[]]");
            return;
        }

        scanner.nextLine();
        List<Set<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();

            String[] strArray = str.split(",");
            if (strArray.length < 1 || strArray.length > 100) {
                System.out.println("[[]]");
                return;
            }
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < strArray.length; j++) {
                set.add(Integer.parseInt(strArray[j]));
            }
            list.add(set);
        }
        scanner.close();

        String result = getResult(list);
        System.out.println(result);
    }

    private static String getResult(List<Set<Integer>> list) {

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1- i; j++) {
                Set<Integer> left = list.get(j);
                Set<Integer> right = list.get(j + 1);
                if (hebing(left, right)) {
                    left.addAll(right);
                    list.remove(j + 1);
                }
            }
        }
        return list.toString();
    }

    private static boolean hebing(Set<Integer> left, Set<Integer> right) {
        if (left.size() < 2 || right.size() < 2) {
            return false;
        }
        int count = 0;
        for (Integer i : left) {
            if (right.contains(i)) {
                count++;
            }
        }
        if (count >= 2) {
            return true;
        }
        return false;
    }
}
