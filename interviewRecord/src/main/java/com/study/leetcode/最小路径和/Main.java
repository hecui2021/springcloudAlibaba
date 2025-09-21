package com.study.leetcode.最小路径和;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/21 16:07
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        int i = main.minPathSum(grid);
        System.out.println(i);
    }

    public int minPathSum(int[][] grid) {
        int[][] minArr = new int[grid.length][grid[0].length];
        minArr[0][0] = grid[0][0];

        for (int i = 1; i < grid.length; i++) {
            minArr[i][0] = minArr[i - 1][0] + grid[i][0];
        }
        for (int j = 1; j < grid[0].length; j++) {
            minArr[0][j] = minArr[0][j - 1] + grid[0][j];
        }

        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[i].length; j++) {
                minArr[i][j] = Math.min(minArr[i - 1][j], minArr[i][j - 1]) + grid[i][j];
            }
        }
        return minArr[grid.length - 1][grid[0].length - 1];
    }
}
