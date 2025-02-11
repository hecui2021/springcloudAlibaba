package com.study.huaweiod.补种未成活的胡杨;

import java.util.Scanner;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/2/10 23:18
 */
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("种植了" + n + "颗");
        // m颗未成活
        int m = in.nextInt();
        System.out.println(m + "颗不成活");

        for (int i = 0; i < m; i++) {
            int mi = in.nextInt();
        }

    }
}
