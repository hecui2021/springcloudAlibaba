package com.study.huaweiod.比赛;


import java.util.*;

/**
 * @author peterche
 * @description:
 * @date 2025-02-17
 */
public class Test {

    /**
     * 题目描述
     * 一个有N个选手参加比赛，选手编号为1~N（3<=N<=100），有M（3<=M<=10）个评委对选手进行打分。
     *
     * 打分规则为每个评委对选手打分，最高分10分，最低分1分。
     *
     * 请计算得分最多的3位选手的编号。 如果得分相同，则得分高分值最多的选手排名靠前
     *
     * (10分数量相同，则比较9分的数量，以此类推，用例中不会出现多个选手得分完全相同的情况)。
     *
     * 输入描述
     * 第一行为半角逗号分割的两个正整数，第一个数字表示M（3<=M<=10）个评委，第二个数字表示N（3<=N<=100）个选手。
     *
     * 第2到M+1行是半角逗号分割的整数序列，表示评委为每个选手的打分，0号下标数字表示1号选手分数，1号下标数字表示2号选手分数，依次类推。
     *
     * 输出描述
     * 选手前3名的编号。
     *
     * 注：若输入异常，输出-1，如M、N、打分不在范围内。
     * @param args
     */
    public static void main(String[] args) {

        // 选手数量，选手编号为1~N（3<=N<=100）
        int n = 5;

        // 评委数量，M（3<=M<=10）
        int m = 4;
        int[][] array = {{10, 6, 9, 7, 6}, {9, 10, 6, 7, 5}, {8, 10, 6, 5, 10}, {9, 10, 8, 4, 9}};

        if (n < 3 || n > 100) {
            System.out.println(-1);
            return;
        }

        if (m < 3 || m > 10) {
            System.out.println(-1);
            return;
        }

        System.out.println(array);

        Map<Integer, Integer> map = new HashMap<>();

        List<Persion> persionList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Persion persion = new Persion();
            persion.index = i + 1;
            for (int j = 0; j < m; j++) {
                if (array[j][i] < 1 || array[j][i] > 10) {
                    System.out.println(-1);
                    return;
                }
                persion.sum += array[j][i];
                persion.soreArray[array[j][i]]++;
            }
            persionList.add(persion);
        }
        System.out.println(persionList);

        Collections.sort(persionList, new Comparator<Persion>() {

            @Override
            public int compare(Persion o1, Persion o2) {
                if (o1.sum > o2.sum) {
                    return -1;
                } else if (o1.sum < o2.sum) {
                    return 1;
                }
                // 总分相同
                for (int i = 10; i > 0; i--) {
                    if (o1.soreArray[i] > o2.soreArray[i]) {
                        return -1;
                    } else if (o1.soreArray[i] < o2.soreArray[i]) {
                        return 1;
                    }
                }
                return 0;
            }
        });
        System.out.println(persionList.get(0).index);
        System.out.println(persionList.get(1).index);
        System.out.println(persionList.get(2).index);

    }

    static class Persion {
        public int index;
        public int sum;
        public int[] soreArray = new int[11];

    }

}
