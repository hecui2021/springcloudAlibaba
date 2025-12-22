package com.study.huaweiod.猜数字;

import java.util.Scanner;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/10/1 14:45
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // 读取座位总数
        scanner.nextLine();  // 读取换行符
        String str = scanner.nextLine();


        scanner.close();
    }
}
