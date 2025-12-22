package com.study.leetcode.hot100.无重复字符的最长子串;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/10/23 22:41
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int i = main.lengthOfLongestSubstring("bbbbb");
        System.out.println(i);
    }

    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) {
            return s.length();
        }
        int start = 0;
        int end = 0;
        int max = 0;
        while (end < s.length()) {
            if (checkOk(s, start, end)) {
                max = Math.max(max, end - start + 1);
                end++;
                continue;
            }
            start++;
            end = start;
        }
        return max;
    }

    public boolean checkOk(String s, int start, int end) {
        Set<Character> set = new HashSet();
        for (int i = start; i <= end; i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                return false;
            }
            set.add(c);
        }
        return true;
    }


    public int lengthOfLongestSubstring2(String s) {
        Set<Character> occ = new HashSet<Character>();
        int left = 0, ans = 0;
        for(int i = 0; i < s.length(); i++){
            while(occ.contains(s.charAt(i))){
                occ.remove(s.charAt(left++));
            }
            occ.add(s.charAt(i));
            ans = Math.max(ans, i - left + 1);
        }
        return ans;
    }
}
