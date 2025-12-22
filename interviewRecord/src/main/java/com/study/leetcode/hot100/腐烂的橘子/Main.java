package com.study.leetcode.hot100.腐烂的橘子;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/11/2 19:05
 */
public class Main {
    public static void main(String[] args) {
        int[][] grid = {{2,1,1},{0,1,1},{1,0,1}};
        Main main = new Main();
        int i = main.orangesRotting(grid);
        System.out.println(i);
    }

    public int orangesRotting(int[][] grid) {
        int xLength = grid.length;
        int yLength = grid[0].length;

        int max = 2;
        while (true) {
            boolean flag = false;
            for (int i = 0; i < xLength; i++) {
                for (int j = 0; j < yLength; j++) {
                    if (grid[i][j] == max) {
                        if (i - 1 >= 0 && i - 1 < xLength && grid[i - 1][j] == 1) {
                            grid[i - 1][j] = grid[i][j] + 1;
                            flag = true;
                        }
                        if (i + 1 >= 0 && i + 1 < xLength && grid[i + 1][j] == 1) {
                            grid[i + 1][j] = grid[i][j] + 1;
                            flag = true;
                        }
                        if (j - 1 >= 0 && j - 1 < yLength && grid[i][j - 1] == 1) {
                            grid[i][j - 1] = grid[i][j] + 1;
                            flag = true;
                        }
                        if (j + 1 >= 0 && j + 1 < yLength && grid[i][j + 1] == 1) {
                            grid[i][j + 1] = grid[i][j] + 1;
                            flag = true;
                        }
                    }
                }
            }
            if (!flag) {
                break;
            }
            max++;
        }
        for (int i = 0; i < xLength; i++) {
            for (int j = 0; j < yLength; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }
        return Math.max(max - 2, 0);
    }
}
