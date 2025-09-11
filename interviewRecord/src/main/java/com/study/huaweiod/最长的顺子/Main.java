package com.study.huaweiod.最长的顺子;

import java.util.*;
/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/8 11:20
 */
public class Main {
    /**
     * 题目描述
     * 斗地主起源于湖北十堰房县，据说是一位叫吴修全的年轻人根据当地流行的扑克玩法“跑得快”改编的，如今已风靡整个中国，并流行于互联网上。
     *
     * 牌型：单顺，又称顺子，最少5张牌，最多12张牌(3…A)不能有2，也不能有大小王，不计花色。
     *
     * 例如： 3-4-5-6-7-8，7-8-9-10-J-Q，3-4-5-6-7-8-9-10-J-Q-K-A
     *
     * 可用的牌 3<4<5<6<7<8<9<10<J<Q<K<A<2<B(小王)<C(大王)，每种牌除大小王外有四种花色
     *
     * (共有13×4+2张牌)
     *
     * 输入：
     *
     * 手上有的牌
     * 已经出过的牌(包括对手出的和自己出的牌)
     * 输出：
     *
     * 对手可能构成的最长的顺子(如果有相同长度的顺子，输出牌面最大的那一个)，
     * 如果无法构成顺子，则输出 NO-CHAIN。
     * 输入描述
     * 输入的第一行为当前手中的牌
     *
     * 输入的第二行为已经出过的牌
     *
     * 输出描述
     * 最长的顺子
     *
     * 用例1
     * 输入
     * 3-3-3-3-4-4-5-5-6-7-8-9-10-J-Q-K-A
     * 4-5-6-7-8-8-8
     * 输出
     * 9-10-J-Q-K-A
     * 用例2
     * 输入
     * 3-3-3-3-8-8-8-8
     * K-K-K-K
     * 输出
     * NO-CHAIN
     * 说明
     * 剩余的牌无法构成顺子
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        Map<String, Integer> map = new HashMap();
        String[] array1 = str1.split("-");
        for (int i = 0; i < array1.length; i++) {
            Integer count = map.get(array1[i]);
            if (count == null) {
                count = 1;
            } else {
                count++;
            }
            map.put(array1[i], count);
        }
        String[] array2 = str2.split("-");
        for (int i = 0; i < array2.length; i++) {
            Integer count = map.get(array2[i]);
            if (count == null) {
                count = 1;
            } else {
                count++;
            }
            map.put(array2[i], count);
        }

        int[] array = new int[15];
        for (String key : map.keySet()) {
            Integer count = map.get(key);
            if (count >= 4) {
                if ("J".equals(key)) {
                    array[11] = 1;
                } else if ("Q".equals(key)) {
                    array[12] = 1;
                } else if ("K".equals(key)) {
                    array[13] = 1;
                } else if ("A".equals(key)) {
                    array[14] = 1;
                } else if (!"B".equals(key) && !"C".equals(key)) {
                    array[Integer.parseInt(key)] = 1;
                }
            }
        }

        int start = 3;
        int end = 0;
        int resultStart = 0;
        int resultEnd = 0;

        for (int i = 3; i < array.length; i++) {
            if (array[i] == 0) {
                end = i;
                continue;
            }
            if (end - start >= resultEnd - resultStart && end - start >= 4) {
                resultStart = start;
                resultEnd = end;
            }
            start = i + 1;
        }
        if (end - start >= resultEnd - resultStart && end - start >= 4) {
            resultStart = start;
            resultEnd = end;
        }
        if (resultEnd == 0) {
            System.out.println("NO-CHAIN");
            return;
        }

        String result = "";
        for (int i = resultStart; i <= resultEnd; i++) {
            String value = i + "";
            if (i == 11) {
                value = "J";
            } else if (i == 12) {
                value = "Q";
            } else if (i == 13) {
                value = "K";
            } else if (i == 14) {
                value = "A";
            }
            if ("".equals(result)) {
                result += value;
            } else {
                result += "-" + value;
            }
        }
        System.out.println(result);
    }
}

