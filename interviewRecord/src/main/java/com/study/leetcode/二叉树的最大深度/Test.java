package com.study.leetcode.二叉树的最大深度;


import com.study.TreeNode;

/**
 * @author peterche
 * @description:104. 二叉树的最大深度
 *
 * @date 2025-02-17
 */
public class Test {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);
        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;

        int i = maxDepth(node1);
        System.out.println(i);
    }

    public int maxDepth3(TreeNode root) {
        bianli(root, 1);
        return maxDeep;
    }

    int maxDeep = 0;

    public void bianli(TreeNode root, int deep) {
        if (root == null) {
            return;
        }
        if (maxDeep < deep) {
            maxDeep = deep;
        }
        bianli(root.left, deep + 1);
        bianli(root.right, deep + 1);
    }

    public int maxDepth2(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = maxDepth(root.left);
            int rightHeight = maxDepth(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    public static int maxDepth(TreeNode root) {
        dfs(root, deep);
        return res;
    }

    static int res = 0;
    static int deep = 0;

    public static void dfs(TreeNode root, int deep) {
        if (root == null) {
            return;
        }
        deep++;
        if (root.left == null && root.right == null) {
            if (deep > res) {
                res = deep;
            }
        }
        dfs(root.left, deep);
        dfs(root.right, deep);
    }
}
