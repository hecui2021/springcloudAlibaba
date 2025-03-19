package com.study.huaweiod.打印任务排序;

import java.util.*;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/3/19 22:10
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        String[] strArray = str.split(",");

        Task[] taskArray = new Task[strArray.length];

        for (int i = 0; i < strArray.length; i++) {
            taskArray[i] = new Task(i, -1, Integer.parseInt(strArray[i]));
        }

        List<Task> list = new ArrayList();

        do {
            taskArray = getList(taskArray, list);
        } while (list.size() < strArray.length);

        Collections.sort(list, new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o1.index - o2.index;
            }
        });

        String result = "";
        for (Task task : list) {
            if (result == "") {
                result += task.resultIndex;
            } else {
                result += "," + task.resultIndex;
            }
        }
        System.out.println(result);

        scanner.close();
    }

    public static Task[] getList(Task[] array, List<Task> list) {
        int max = 0;
        int resultIndex = 0;

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].val > max) {
                max = array[i].val;
                resultIndex = list.size();

                index = i;
            }
        }
        array[index].resultIndex = resultIndex;
        list.add(array[index]);

        Task[] newArray = new Task[array.length - 1];

        for (int i = index + 1; i < array.length; i++) {
            newArray[i - index - 1] = array[i];
        }

        for (int i = 0; i < index; i++) {
            newArray[array.length -index - 1 + i] = array[i];
        }
        return newArray;
    }

    public static class Task {
        public int index;
        public int resultIndex;
        public int val;

        public Task(int index, int resultIndex, int val) {
            this.index = index;
            this.resultIndex = resultIndex;
            this.val = val;
        }
    }
}