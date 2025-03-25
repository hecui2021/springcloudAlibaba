package com.study.huaweiod.二叉树计算;

/**
 * @author peterche
 * @description: 已知二叉树的前序遍历和中序遍历，可以通过递归的方法重建二叉树。前序遍历的第一个节点是根节点，中序遍历中根节点的左侧是左子树，右侧是右子树。通过递归地处理左子树和右子树，可以重建整个二叉树。
 * @date 2025-03-24
 */
import java.util.HashMap;
import java.util.Map;

public class NodeTreeReBuild {
    private Map<Integer, Integer> inorderMap; // 用于存储中序遍历的值和索引
    private int preIndex; // 用于跟踪前序遍历的索引

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // 初始化中序遍历的映射
        inorderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        preIndex = 0; // 从前序遍历的第一个节点开始
        return buildTreeHelper(preorder, 0, inorder.length - 1);
    }

    private TreeNode buildTreeHelper(int[] preorder, int inStart, int inEnd) {
        // 递归终止条件
        if (inStart > inEnd) {
            return null;
        }

        // 从前序遍历中获取当前根节点
        int rootVal = preorder[preIndex];
        TreeNode root = new TreeNode(rootVal);
        preIndex++; // 移动到下一个节点

        // 在中序遍历中找到根节点的索引
        int inIndex = inorderMap.get(rootVal);

        // 递归构建左子树和右子树
        root.left = buildTreeHelper(preorder, inStart, inIndex - 1);
        root.right = buildTreeHelper(preorder, inIndex + 1, inEnd);

        return root;
    }

    // 测试代码
    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        NodeTreeReBuild builder = new NodeTreeReBuild();
        TreeNode root = builder.buildTree(preorder, inorder);

        // 打印重建的二叉树（前序遍历）
        System.out.println("重建的二叉树（前序遍历）:");
        printPreorder(root);
    }

    // 辅助方法：打印前序遍历结果
    private static void printPreorder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}