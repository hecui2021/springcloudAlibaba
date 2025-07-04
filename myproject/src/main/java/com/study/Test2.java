package com.study;

/**
 * @author peterche
 * @description:
 * @date 2025-07-01
 */
public class Test2 {
    public static void main(String[] args) {
        String s = "";

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        StringBuffer reverse = sb.reverse();
        reverse.toString();
    }
}
