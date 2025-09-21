package com.study.leetcode.从中序与后序遍历序列构造二叉树;

import com.study.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/11 16:06
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};
        TreeNode treeNode = main.buildTree(inorder, postorder);
        System.out.println(treeNode);
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        inorderMap = new HashMap();
        for (int i = 0; i < n; i++) {
            inorderMap.put(inorder[i], i);
        }
        TreeNode root = dfs(inorder, postorder, 0, n - 1, 0, n - 1);
        return root;
    }
    private Map<Integer, Integer> inorderMap;

    public TreeNode dfs(int[] inorder, int[] postorder, int inorder_left, int inorder_right,
                        int postorder_left, int postorder_right) {
        if (inorder_left > inorder_right) {
            return null;
        }

        int rootVal = postorder[postorder_right];
        int rootIndex = inorderMap.get(rootVal);
        int leftSize = inorderMap.get(rootVal) - inorder_left;
        TreeNode root = new TreeNode(rootVal);
        root.left = dfs(inorder, postorder, inorder_left, rootIndex - 1, postorder_left, postorder_left + leftSize - 1);
        root.right = dfs(inorder, postorder, rootIndex + 1, inorder_right, postorder_left + leftSize, postorder_right - 1);

        // root.left = dfs(inorder, postorder, inorder_left, inorder_left + leftSize - 1, postorder_left, postorder_left + leftSize - 1);
        // root.right = dfs(inorder, postorder, inorder_left + leftSize + 1, inorder_right, postorder_left + leftSize, postorder_right - 1);
        return root;
    }

}
