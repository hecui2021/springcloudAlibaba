package com.study.huaweiod.连续字母长度;


import java.util.*;

/**
 * @author peterche
 * @description:
 * @date 2025-02-17
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int k = scanner.nextInt();

        char lastChar = str.charAt(0);
        int start = 0;
        int end = 0;
        Map<Character, Integer> map = new HashMap();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == lastChar) {
                end++;
                continue;
            }
            // 下一个子串
            Integer count = map.get(lastChar);
            if (count == null || count < end - start + 1) {
                // 当前不存在更长的相同子串
                map.put(lastChar, end - start + 1);
            }
            lastChar = str.charAt(i);
            start = i;
            end = i;
        }
        Integer count = map.get(lastChar);
        if (count == null || count < end - start + 1) {
            map.put(lastChar, end - start + 1);
        }

        ArrayList<Integer> values = new ArrayList<>(map.values());

        Collections.sort(values, Collections.reverseOrder());
        // 如果k大于ArrayList中的元素数量，返回-1，否则返回第k大的长度值
        int rt = k > values.size() ? -1 : values.get(k - 1);
        System.out.println(rt); // 输出结果
    }

}
