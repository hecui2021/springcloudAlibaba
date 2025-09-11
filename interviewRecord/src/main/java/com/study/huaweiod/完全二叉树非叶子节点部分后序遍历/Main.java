package com.study.huaweiod.完全二叉树非叶子节点部分后序遍历;

import java.util.*;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/9 14:44
 */
public class Main {
    /**
     * 题目描述
     * 给定一个以顺序储存结构存储整数值的完全二叉树序列（最多1000个整数），请找出此完全二叉树的所有非叶子节点部分，然后采用后序遍历方式将此部分树（不包含叶子）输出。
     * <p>
     * 1、只有一个节点的树，此节点认定为根节点（非叶子）。
     * <p>
     * 2、此完全二叉树并非满二叉树，可能存在倒数第二层出现叶子或者无右叶子的情况
     * <p>
     * 其他说明：二叉树的后序遍历是基于根来说的，遍历顺序为：左-右-根
     * <p>
     * 输入描述
     * 一个通过空格分割的整数序列字符串
     * <p>
     * 输出描述
     * 非叶子部分树结构。备注：输出数字以空格分隔
     * <p>
     * 用例1
     * 输入
     * 1 2 3 4 5 6 7
     * 输出
     * 2 3 1
     * 说明
     * 找到非叶子部分树结构，然后采用后序遍历输出
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String[] strArray = str.split(" ");
        int[] array = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            array[i] = Integer.parseInt(strArray[i]);
        }
        System.out.println(getResult(array));
    }

    public static String getResult(int[] array) {
        if (array.length == 1) {
            return array[0] + "";
        }

        List<Integer> list = new ArrayList();
        dfs(array, 0, list);

        StringBuffer sb = new StringBuffer();
        for (Integer i : list) {
            sb.append(i + " ");
        }
        return sb.toString();
    }

    public static void dfs(int[] array, int root, List<Integer> list) {
        int left = root * 2 + 1;
        int right = root * 2 + 2;

        if (array.length > left) {
            dfs(array, left, list);
            if (array.length > right) {
                dfs(array, right, list);
            }
            list.add(array[root]);
        }
    }
}