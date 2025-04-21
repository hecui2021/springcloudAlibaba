package com.study.huaweiod.插队;

import java.util.*;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/4/21 22:21
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        List<Person> list = new ArrayList();
        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            String[] array = str.split(" ");
            if ("p".equals(array[0])) {
                // 输出
                Person p = list.get(0);
                list.remove(p);
                System.out.println(p.index);
            } else {
                // 插入
                list = add(list, array);
            }
        }
    }

    public static List<Person> add(List<Person> list, String[] array) {
        int index = Integer.parseInt(array[1]);
        int pritory = Integer.parseInt(array[2]);
        if (list.size() == 0) {
            list.add(new Person(index, pritory));
            return list;
        }
        List<Person> newList = new ArrayList();

        int resultIndex = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).pritory > pritory) {
                resultIndex = list.get(i).index;
                break;
            }
        }
        if (resultIndex == -1) {
            list.add(new Person(index, pritory));
            return list;
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).index == resultIndex) {
                newList.add(new Person(index, pritory));
            }
            newList.add(list.get(i));
        }
        return newList;
    }

    public static class Person {
        // 序号
        public int index;
        // 优先级
        public int pritory;

        public Person(int index, int pritory) {
            this.index = index;
            this.pritory = pritory;
        }
    }
}