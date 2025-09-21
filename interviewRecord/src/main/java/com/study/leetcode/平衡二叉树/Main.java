package com.study.leetcode.平衡二叉树;

import com.study.TreeNode;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/12 07:30
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node8 = new TreeNode(8);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node4.left = node8;

        boolean balanced = main.isBalanced(node3);
        System.out.println(balanced);
    }

    int minDeep = 0;
    int maxDeep = 0;
    public boolean isBalanced(TreeNode root) {
        bianli(root, 0);
        if (maxDeep - minDeep > 1) {
            return false;
        }
        return true;
    }

    public void bianli(TreeNode root, int deep) {
        if (root == null) {
            if (minDeep == 0) {
                minDeep = deep;
            }
            if (maxDeep == 0) {
                maxDeep = deep;
            }
            minDeep = Math.min(minDeep, deep);
            maxDeep = Math.max(maxDeep, deep);
            return;
        }
        bianli(root.left, deep + 1);
        bianli(root.right, deep + 1);
    }
}
