package com.study.leetcode.hot100.有效的括号;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/11/2 22:23
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        boolean valid = main.isValid("()");
        System.out.println(valid);
    }

    public boolean isValid(String s) {
        List<Character> list = new ArrayList();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        while (true) {
            boolean flag = false;
            if (list.size() == 0) {
                return true;
            }
            for (int i = 0; i < list.size() - 1; i++) {
                Character cur = list.get(i);
                Character next = list.get(i + 1);
                if (cur == '(' && next == ')') {
                    list.remove(i);
                    list.remove(i);
                    flag = true;
                    break;
                }
                if (cur == '[' && next == ']') {
                    list.remove(i);
                    list.remove(i);
                    flag = true;
                    break;
                }
                if (cur == '{' && next == '}') {
                    list.remove(i);
                    list.remove(i);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return false;
            }
        }
    }
}
