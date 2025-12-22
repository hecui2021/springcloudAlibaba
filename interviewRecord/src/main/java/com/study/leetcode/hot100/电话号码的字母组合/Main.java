package com.study.leetcode.hot100.电话号码的字母组合;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/10/22 14:08
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        String digits = "23";
        List<String> strings = main.letterCombinations(digits);
        System.out.println(strings);
    }


    Map<Integer, String> map;
    public List<String> letterCombinations(String digits) {
        map = new HashMap();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");

        return dfs(new ArrayList(), 0, digits);
    }

    public List<String> dfs(List<String> list, int count, String digits) {
        List<String> resultList = new ArrayList();

        String str = map.get(Integer.parseInt(digits.charAt(count) + ""));
        if (str == null) {
            return list;
        }
        String[] array = str.split("");
        for (String s : array) {
            if (list.size() == 0) {
                resultList.add(s);
                continue;
            }
            for (String preStr : list) {
                resultList.add(preStr + s);
            }
        }
        if (count == digits.length() - 1) {
            return resultList;
        }
        return dfs(resultList, count + 1, digits);
    }
}
