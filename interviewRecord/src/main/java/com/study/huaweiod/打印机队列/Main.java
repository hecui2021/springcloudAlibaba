package com.study.huaweiod.打印机队列;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/28 12:07
 */
public class Main {
    static private List<List<Task>> list = new ArrayList<>();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            String[] array = str.split(" ");
            if (array.length == 2) {
                // out
                int p = Integer.parseInt(array[1]);
                Integer id = out(p);
                System.out.println(id == null ? "NULL" : id);
            } else {
                // in
                int p = Integer.parseInt(array[1]);
                int num = Integer.parseInt(array[2]);
                in(p, num, i + 1);
            }
        }
    }

    public static void in(int p, int num, int id) {
        if (list.size() < p) {
            list.add(new ArrayList<>());
        }
        list.get(p - 1).add(new Task(id, num));
    }

    public static Integer out(int p) {
        // 获取打印机列表
        List<Task> pList = list.get(p - 1);
        if (pList.size() == 0) {
            return null;
        }

        Task maxTask = pList.get(0);

        if (pList.size() == 1) {
            pList.remove(maxTask);
            return maxTask.id;
        }
        for (int i = 1; i < pList.size(); i++) {
            if (pList.get(i).num > maxTask.num) {
                maxTask = pList.get(i);
            }
        }
        pList.remove(maxTask);
        return maxTask.id;
    }

    static class Task {
        public int id;
        public int num;

        public Task(int id, int num) {
            this.id = id;
            this.num = num;
        }

    }
}
