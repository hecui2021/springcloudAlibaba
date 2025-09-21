package com.study.leetcode.括号生成;

import java.util.*;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/19 09:28
 */
public class Main {
    /**
     * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
     *
     *
     *
     * 示例 1：
     *
     * 输入：n = 3
     * 输出：["((()))","(()())","(())()","()(())","()()()"]
     * 示例 2：
     *
     * 输入：n = 1
     * 输出：["()"]
     * @param n
     * @return
     */
    public List<String> generateParenthesis(int n) {
        if (n == 1) {
            return Arrays.asList("()");
        }
        Set<String> set = new HashSet<>();
        for (String str : generateParenthesis(n - 1)) {
            for (int i = 0; i < str.length(); i++) {
                String newStr = str.substring(0, i) + "()" + str.substring(i);
                set.add(newStr);
            }
        }
        return new ArrayList<>(set);
    }
}
