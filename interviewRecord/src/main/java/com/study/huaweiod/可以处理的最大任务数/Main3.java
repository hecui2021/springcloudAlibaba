package com.study.huaweiod.可以处理的最大任务数;

import java.util.Scanner;

/**
 * @author peterche
 * @description: 80%成功
 * @date 2025-03-26
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        int[] resultArray = new int[100001];
        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            String[] array = str.split(" ");
            int start = Integer.parseInt(array[0]);
            int end = Integer.parseInt(array[1]);
            resultArray[start]++;
        }
        scanner.close();

        int count = 0;
        for (int i = 1; i < resultArray.length; i++) {
            count += resultArray[i];
        }
        System.out.println(count);
    }

    public static class Task {
        public int start;
        public int end;

        public Task(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
