package com.study;


import sun.net.www.http.HttpClient;

import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author peterche
 * @description:
 * 滑动窗口算法
 * 动态规划算法
 * 约瑟夫问题
 * 深度优先搜索算法
 *
 * @date 2025-02-17
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // 读取座位总数
        scanner.nextLine();  // 读取换行符
        String str = scanner.nextLine();
        scanner.close();

        Lock lock = new ReentrantLock();
        lock.lock();
    }
}
