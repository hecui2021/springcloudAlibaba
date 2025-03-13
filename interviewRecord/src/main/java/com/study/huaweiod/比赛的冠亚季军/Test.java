package com.study.huaweiod.比赛的冠亚季军;


import com.study.NodeList;

/**
 * @author peterche
 * @description:
 * @date 2025-02-17
 */
public class Test {

    /**
     * 题目描述
     * 有N（3 ≤ N < 10000）个运动员，他们的id为0到N-1,他们的实力由一组整数表示。他们之间进行比赛，需要决出冠亚军。比赛的规则是0号和1号比赛，2号和3号比赛，以此类推，
     * 每一轮，相邻的运动员进行比赛，获胜的进入下一轮；实力值大的获胜，实力值相等的情况，id小的情况下获胜；轮空的直接进入下一轮。
     *
     * 输入描述
     * 输入一行N个数字代表N的运动员的实力值(0<=实力值<=10000000000)。
     *
     * 输出描述
     * 输出冠亚季军的id，用空格隔开。
     * @param args
     */
    public static void main(String[] args) {

        int n = 4;

    }

    public static int getCount(NodeList head) {
        int count = 1;
        NodeList cur = head;
        while (cur.next != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }
}
