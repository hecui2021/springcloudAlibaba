package com.study.leetcode.从前序与中序遍历序列构造二叉树;

import com.study.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/11 09:13
 */
public class Main {
    private Map<Integer, Integer> indexMap;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;

        // 构造哈希映射，帮助我们快速定位到根节点
        indexMap = new HashMap();
        for (int i = 0; i < n; i++) {
            indexMap.put(inorder[i], i);
        }
        return myBuildTree(preorder, inorder, 0, n - 1, 0, n - 1);
    }

    public TreeNode myBuildTree(int[] preorder, int[] inorder, int preorder_left, int preorder_right,
                                int inorder_left, int inorder_right) {
        if (preorder_left > preorder_right) {
            return null;
        }
        // 前序遍历的第一个元素就是根节点
        int preorder_root = preorder_left;

        // 在中序遍历中定位到根节点
        int inorder_root = indexMap.get(preorder[preorder_root]);

        // 构造根节点
        TreeNode root = new TreeNode(preorder[preorder_root]);

        // 得到左子树的节点数量
        int size_left = inorder_root - inorder_left;

        // 递归构造左子树，并连接到根节点
        // 先序遍历中「从 左边界+1 开始的 size_left_subtree」个元素就对应了中序遍历中「从 左边界 开始到 根节点定位-1」的元素
        root.left = myBuildTree(preorder, inorder, preorder_left + 1, preorder_left + size_left,
                inorder_left, inorder_root - 1);

        root.right = myBuildTree(preorder, inorder, preorder_left + size_left + 1,preorder_right,
                inorder_root + 1, inorder_right);
        return root;
    }
}
