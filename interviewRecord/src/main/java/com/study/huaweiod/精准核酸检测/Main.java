package com.study.huaweiod.精准核酸检测;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/30 18:52
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String peoples = scanner.nextLine();
        String[] peopleArray = peoples.split(",");
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            String[] child = str.split(",");
            for (int j = 0; j < child.length; j++) {
                array[i][j] = Integer.parseInt(child[j]);
            }
        }
        scanner.close();

        boolean[] visited = new boolean[n];

        Set<Integer> set = new HashSet<>();
        for (String str : peopleArray) {
            int index = Integer.parseInt(str);
            set.add(index);
            dfs(index, array, visited);
        }

        int count = 0;
        for (int i = 0; i< visited.length; i++) {
            if (visited[i] && !set.contains(i)) {
                count++;
            }
        }
        System.out.println(count);

    }

    public static void dfs(int index, int[][] array, boolean[] visited) {
        visited[index] = true;

        int[] child = array[index];
        for (int i = 0; i < child.length; i++) {
            if (!visited[i] && child[i] == 1) {
                dfs(i, array, visited);
            }
        }
    }
}
