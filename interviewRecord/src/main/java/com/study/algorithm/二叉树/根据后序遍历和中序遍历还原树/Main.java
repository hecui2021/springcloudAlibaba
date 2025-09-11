package com.study.algorithm.二叉树.根据后序遍历和中序遍历还原树;

import com.study.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/8 20:47
 */
public class Main {
    public static void main(String[] args) {
        // 测试用例
        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};

        TreeNode root = buildTree(inorder, postorder);

        System.out.println("前序遍历结果（用于验证）：");
        preorderTraversal(root); // 应该输出：3 9 20 15 7
    }

    private static Map<Integer, Integer> inorderMap;
    private static int postIndex;

    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        // 1. 边界条件检查
        if (inorder == null || postorder == null || inorder.length != postorder.length) {
            return null;
        }

        // 2. 初始化HashMap，建立中序遍历值的索引映射
        inorderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        // 3. 初始化后序遍历索引（从最后一个元素开始，即根节点）
        postIndex = postorder.length - 1;

        // 4. 递归构建整棵树
        return buildTreeHelper(postorder, 0, inorder.length - 1);
    }

    /**
     * 递归构建二叉树的辅助方法
     * @param postorder 后序遍历数组
     * @param inStart 当前子树在中序遍历中的起始索引
     * @param inEnd 当前子树在中序遍历中的结束索引
     * @return 构建好的子树根节点
     */
    private static TreeNode buildTreeHelper(int[] postorder, int inStart, int inEnd) {
        if (inStart > inEnd) {
            return null;
        }

        // 1. 从后序遍历中获取当前根节点的值
        int rootVal = postorder[postIndex];
        TreeNode root = new TreeNode(rootVal);

        // 2. 后序遍历索引向前移动（处理下一个节点）
        postIndex--;

        // 3. 使用HashMap快速查找根节点在中序遍历中的位置
        int rootIndex = inorderMap.get(rootVal);

        // 4. 关键步骤：先构建右子树，再构建左子树
        // 原因：后序遍历的顺序是"左-右-根"，倒序遍历时顺序变为"根-右-左"
        root.right = buildTreeHelper(postorder, rootIndex + 1, inEnd);
        root.left = buildTreeHelper(postorder, inStart, rootIndex - 1);

        return root;
    }

    // 辅助方法：前序遍历打印二叉树（用于验证结果）
    public static void preorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
}
