package com.study.huaweiod.连续字母长度;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author peterche
 * @description:
 * @date 2025-02-17
 */
public class Test {

    /**
     * 题目描述
     * 给定一个字符串，只包含大写字母，求在包含同一字母的子串中，长度第 k 长的子串的长度，相同字母只取最长的那个子串。
     *
     * 输入描述
     * 第一行有一个子串(1<长度<=100)，只包含大写字母。
     *
     * 输出描述
     * 输出连续出现次数第k多的字母的次数。
     * @param args
     */
    public static void main(String[] args) {
        String str = "AAAAHHHBBCDHHHH";
        int k = 3;

        char lastChar = str.charAt(0);
        int count = 1;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);
            if (lastChar == c) {
                count++;
                continue;
            }
            Integer lastCount = map.get(lastChar);
            if (lastCount == null || lastCount < count) {
                map.put(lastChar, count);
            }

            System.out.println(lastChar + ":" + count);
            lastChar = c;
            count = 1;
        }
        Integer lastCount = map.get(lastChar);
        if (lastCount == null || lastCount < count) {
            map.put(lastChar, count);
        }
        System.out.println(lastChar + ":" + count);

        ArrayList<Integer> values = new ArrayList<>(map.values());

        Collections.sort(values, Collections.reverseOrder());
        // 如果k大于ArrayList中的元素数量，返回-1，否则返回第k大的长度值
        int rt = k > values.size() ? -1 : values.get(k - 1);
        System.out.println(rt); // 输出结果
    }
}
