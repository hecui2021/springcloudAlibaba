package com.study.huaweiod;

import java.util.*;

/**
 * @Author: peterche
 * @Description:  拼写单词
 * @Date: 2025/10/28 16:59
 */
public class Test {
    Set<String> set = new HashSet<>();
    public int countCharacters(String[] words, String chars) {
        int count = 0;
        for (String str : words) {set.add(str);}
        int start = 0;
        int end = 0;
        while (end < chars.length()) {
            if (isOk(chars, start, end)) {count++;end++;start = end;continue;}end++;
        }return count;}
    public boolean isOk(String str, int start, int end) {

        StringBuffer sb = new StringBuffer();
        for (int i = start; i <= end; i++) {
            sb.append(str.charAt(i));
        }
        char[] charArray = sb.toString().toCharArray();
        List<String> list = new ArrayList<>();
        for (char c : charArray) {
            list.add(c + "");
        }
        for (String s : set) {
            char[] charArray1 = s.toCharArray();
            for (char c : charArray1) {
                if (!list.remove(c + "")) {
                    return false;
                }}}
        return true;}}
