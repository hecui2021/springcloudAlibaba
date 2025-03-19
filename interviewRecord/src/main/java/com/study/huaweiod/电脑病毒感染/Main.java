package com.study.huaweiod.电脑病毒感染;

import java.util.*;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/3/20 07:34
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        scanner.nextLine();

        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);

        String[] mArray = new String[m];
        for (int i = 0; i < m; i++) {

            String tStr = scanner.nextLine();
            mArray[i] = tStr;
        }
        int index = scanner.nextInt();
        scanner.close();

        dist[index - 1] = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                String[] indexArray = mArray[j].split(" ");
                int indexI = Integer.parseInt(indexArray[0]) - 1;
                int indexJ = Integer.parseInt(indexArray[1]) - 1;
                int indexT = Integer.parseInt(indexArray[2]);

                if (dist[indexJ] > dist[indexI] + indexT) {
                    dist[indexJ] = dist[indexI] + indexT;
                }
            }
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                System.out.println(-1);
                return;
            }
            if (dist[i] > max) {
                max = dist[i];
            }
        }
        System.out.println(max);
    }
}
