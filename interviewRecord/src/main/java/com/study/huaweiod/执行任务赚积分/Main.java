package com.study.huaweiod.执行任务赚积分;

import java.util.*;


/**
 * @author peterche
 * @description:
 * @date 2025-04-22
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();

        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < n; i++) {
            int sla = scanner.nextInt();
            int v = scanner.nextInt();
            Integer savedV = map.get(sla);
            if (savedV == null || savedV < v) {
                map.put(sla, v);
            }
        }
        List<Integer> list = new ArrayList<>(map.values());

        Collections.sort(list, (o1, o2) -> o2 - o1);

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (i + 1 <= t) {
                sum += list.get(i);
            }
        }
        System.out.println(sum);


    }
}