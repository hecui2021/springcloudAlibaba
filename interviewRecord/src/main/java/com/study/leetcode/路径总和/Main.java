package com.study.leetcode.路径总和;

import com.study.TreeNode;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/13 08:28
 */
public class Main {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPathSum(root, 0, targetSum);
    }

    public boolean hasPathSum(TreeNode root, int sum, int targetSum) {
        if (root == null) {
            return false;
        }
        sum += root.val;
        if (sum == targetSum && root.left == null && root.right == null) {
            return true;
        }
        return hasPathSum(root.left, sum, targetSum) || hasPathSum(root.right, sum, targetSum);
    }

}
