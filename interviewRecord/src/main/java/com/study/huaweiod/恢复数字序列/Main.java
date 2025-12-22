package com.study.huaweiod.恢复数字序列;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/10/1 12:26
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int k = scanner.nextInt();

        solve(str, k);
    }

    // n :连续的n个数字
    private static void solve(String s, int n) {
        HashMap<Character,Integer> originalMap = new HashMap<>();
        //统计原始字符串每个数字的次数
        for (char ch:s.toCharArray()){
            originalMap.put(ch,originalMap.getOrDefault(ch,0)+1);
        }
        // 从1到1000000，一步步搜索，同时遍历这n个数，得到每个数字的次数
        // 若次数一样，则最小值就是i
        for(int i=1;i<=1000000;i++){
            HashMap<Character,Integer> targetMap = new HashMap<>();
            for(int j=0;j<n;j++){//连续n个数
                String temp = (i+j)+"";
                for (char ch:temp.toCharArray()){
                    targetMap.put(ch,targetMap.getOrDefault(ch,0)+1);
                }
            }

            if (originalMap.equals(targetMap)) {
                System.out.println(i);
                return;
            }

        }
    }

}
