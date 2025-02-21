package com.study.leetcode.找到字符串中所有字母异味词;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author peterche
 * @description: 438 找到字符串中所有字母异味词
 * @date 2025-02-21
 */
public class Test {
    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
//        String s = "abab", p = "ab";
        List<Integer> anagrams = findAnagrams(s, p);
        System.out.println(anagrams);
    }

    /**
     * 给定两个字符串 s 和 p，找到 s 中所有 p 的 异位词 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。
     *
     *
     *
     * 示例 1:
     *
     * 输入: s = "cbaebabacd", p = "abc"
     * 输出: [0,6]
     * 解释:
     * 起始索引等于 0 的子串是 "cba", 它是 "abc" 的异位词。
     * 起始索引等于 6 的子串是 "bac", 它是 "abc" 的异位词。
     *  示例 2:
     *
     * 输入: s = "abab", p = "ab"
     * 输出: [0,1,2]
     * 解释:
     * 起始索引等于 0 的子串是 "ab", 它是 "ab" 的异位词。
     * 起始索引等于 1 的子串是 "ba", 它是 "ab" 的异位词。
     * 起始索引等于 2 的子串是 "ab", 它是 "ab" 的异位词。
     * @param s
     * @param p
     * @return
     */
    public static List<Integer> findAnagrams(String s, String p) {
        int left = 0, right = p.length() - 1;
        List<Integer> list = new ArrayList<>();

        while (right < s.length()) {
            if (isOk(s, p, left, right)) {
                list.add(left);
            }
            left++;
            right++;
        }
        return list;
    }

    public static boolean isOk(String s, String p, int left, int right) {
        int[] arrayS= new int[26];
        int[] arrayP= new int[26];

        for (int i = 0; i < p.length(); i++) {
            arrayP[p.charAt(i) - 'a']++;
        }
        for (int i = left; i <= right; i++) {
            arrayS[s.charAt(i) - 'a']++;
        }
        return Arrays.equals(arrayS, arrayP);
    }


}
