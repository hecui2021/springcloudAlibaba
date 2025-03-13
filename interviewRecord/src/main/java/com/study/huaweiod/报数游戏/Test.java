package com.study.huaweiod.报数游戏;


import com.study.NodeList;

/**
 * @author peterche
 * @description:约瑟夫问题，链表解决
 * @date 2025-02-17
 */
public class Test {
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
        int n = 100;
        int m = 4;

        NodeList head = new NodeList(1);
        NodeList cur = head;
        for (int i = 2; i <= n; i++) {
            cur.next = new NodeList(i);
            cur = cur.next;
        }
        cur.next = head;//成环

        int count = getCount(head);
        System.out.println("count:" + count);

        cur = head;
        NodeList prev = null;
        while (getCount(cur) >= m) {
            for (int i = 1; i < m; i++) {
                prev = cur;
                cur = cur.next;
            }
            // 移除当前节点
            prev.next = cur.next;
            cur = prev.next;
        }

        print(cur);
    }

    public static int getCount(NodeList head) {
        int count = 1;
        NodeList cur = head;
        while (cur.next != head) {
            cur = cur.next;
            count++;
        }
        return count;
    }

    public static void print(NodeList head) {
        NodeList cur = head;
        while (cur.next != head) {
            System.out.println(cur.val);
            cur = cur.next;
        }
        System.out.println(cur.val);
    }


}
