package com.study.huaweiod.WeAreATeam;

import java.util.Scanner;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author peterche
 * @description:
 * @date 2025-03-14
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String[] strArray = str.split(" ");
        int n = Integer.parseInt(strArray[0]);
        int m = Integer.parseInt(strArray[1]);

        if (n < 1 || n >= 100000 || m < 1 || m >= 100000) {
            System.out.println("Null");
            return;
        }

        Map<Integer, Set<Integer>> map = new HashMap();
        for (int i = 0; i < m; i++) {
            String msg = scanner.nextLine();
            String[] msgArray = msg.split(" ");
            int a = Integer.parseInt(msgArray[0]);
            int b = Integer.parseInt(msgArray[1]);
            int c = Integer.parseInt(msgArray[2]);

            if (a < 1 || a > n || b < 1 || b > n) {
                System.out.println("da pian zi");
            }

            if (c == 0) {
                Set<Integer> aSet = map.get(a);
                if (aSet == null) {
                    aSet = new HashSet();
                }
                Set<Integer> bSet = map.get(b);
                if (bSet == null) {
                    bSet = new HashSet();
                }
                bSet.add(a);
                bSet.add(b);
                bSet.addAll(aSet);
                for (Integer num : bSet) {
                    map.put(num, bSet);
                }

            } else if (c == 1) {
                Set<Integer> set = map.get(a);
                if (set != null && set.contains(b)) {
                    System.out.println("we are a team");
                } else {
                    System.out.println("we are not a team");
                }
            } else {
                System.out.println("da pian zi");
            }
        }
        scanner.close();

    }
}