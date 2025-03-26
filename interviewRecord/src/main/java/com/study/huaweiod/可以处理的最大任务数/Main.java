package com.study.huaweiod.可以处理的最大任务数;

import java.util.*;

/**
 * @author peterche
 * @description: 评测超时了
 * @date 2025-03-26
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        int min = Integer.MAX_VALUE;
        int max= 0;
        Set<Task> taskSet = new HashSet();
        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            String[] array = str.split(" ");
            int start = Integer.parseInt(array[0]);
            int end = Integer.parseInt(array[1]);
            min = Math.min(min, start);
            max = Math.max(max, end);
            taskSet.add(new Task(start, end));
        }
        scanner.close();

        int count = 0;
        for (int i = min; i <= max; i++) {
            Iterator<Task> iterator = taskSet.iterator();
            while (iterator.hasNext()) {
                Task task = iterator.next();
                if (task.start <= i && task.end >= i) {
                    count++;
                    iterator.remove();
                }
            }
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
