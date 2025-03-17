package com.study.huaweiod.报数游戏;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author peterche
 * @description:约瑟夫问题，链表解决
 * @date 2025-02-17
 */
public class Main {
    /**
     * 题目描述
     * 100个人围成一圈，每个人有一个编码，编号从1开始到100。
     *
     * 他们从1开始依次报数，报到为M的人自动退出圈圈，然后下一个人接着从1开始报数，直到剩余的人数小于M。
     *
     * 请问最后剩余的人在原先的编号为多少？
     *
     * 输入描述
     * 输入一个整数参数 M
     *
     * 输出描述
     * 如果输入参数M小于等于1或者大于等于100，输出“ERROR!”；
     *
     * 否则按照原先的编号从小到大的顺序，以英文逗号分割输出编号字符串
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        if (m <= 1 || m >= 100) {
            System.out.println("ERROR!");
            return;
        }

        List<Integer> list = new ArrayList();
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }

        list = getList(list, m);

        Collections.sort(list);

        String str = "";
        for (Integer i : list) {
            if (str == "") {
                str += i;
            } else {
                str += "," + i;
            }
        }
        System.out.println(str);

        scanner.close();
    }

    public static List<Integer> getList(List<Integer> list, int m) {
        for (int i = 0; i < list.size(); i++) {
            if (i + 1 == m) {
                List<Integer> newList = list.subList(m, list.size());
                newList.addAll(list.subList(0, m- 1));
                return getList(newList, m);
            }
        }
        return list;
    }
}
