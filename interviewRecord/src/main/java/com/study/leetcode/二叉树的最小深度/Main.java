package com.study.leetcode.二叉树的最小深度;

import com.study.TreeNode;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/13 08:17
 */
public class Main {
    public int minDepth(TreeNode root) {
        return minDepth(root, 0);
    }

    public int minDepth(TreeNode root, int deep) {
        if (root == null) {
            return deep;
        }
        if (root.left == null && root.right == null) {
            return deep + 1;
        } else if (root.left == null) {
            return minDepth(root.right, deep + 1);
        } else if (root.right == null) {
            return minDepth(root.left, deep + 1);
        }
        return Math.min(minDepth(root.left, deep + 1), minDepth(root.right, deep + 1));
    }
}
