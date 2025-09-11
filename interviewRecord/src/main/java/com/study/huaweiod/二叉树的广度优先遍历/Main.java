package com.study.huaweiod.二叉树的广度优先遍历;

import java.util.*;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/8 15:09
 */
public class Main {
    /**
     * 题目描述
     * 有一棵二叉树，每个节点由一个大写字母标识(最多26个节点）。
     *
     * 现有两组字母，分别表示后序遍历（左孩子->右孩子->父节点）和中序遍历（左孩子->父节点->右孩子）的结果，请你输出层序遍历的结果。
     *
     * 输入描述
     * 每个输入文件一行，第一个字符串表示后序遍历结果，第二个字符串表示中序遍历结果。（每串只包含大写字母）
     *
     * 中间用单空格分隔。
     *
     * 输出描述
     * 输出仅一行，表示层序遍历的结果，结尾换行。
     *
     * 用例1
     * 输入
     * CBEFDA CBAEDF
     * 输出
     * ABDCEF
     * 说明
     * 二叉树为：
     *
     *      A
     *     /   \
     *   B     D
     *  /      /  \
     * C      E    F
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] array = str.split(" ");

        String[] postorder = array[0].split("");
        String[] inorder = array[1].split("");

        TreeNode root = buildTree(inorder, postorder);

        List<List<String>> result = levelOrderRecursive(root);

        for (List<String> list : result) {
            for (String s : list) {
                System.out.print(s);
            }
        }

        System.out.println("");
    }

    public static List<List<String>> levelOrderRecursive(TreeNode treeNode) {
        List<List<String>> result = new ArrayList<>();

        if (treeNode == null) {
            return result;
        }

        levelOrderHelper(treeNode, 0, result);

        return result;
    }

    private static void levelOrderHelper(TreeNode treeNode, int level, List<List<String>> result) {
        if (treeNode == null) {
            return;
        }

        // 如果当前层还没有列表，创建一个
        if (result.size() == level) {
            result.add(new ArrayList<>());
        }

        // 将当前节点值加到对应层
        result.get(level).add(treeNode.val);

        levelOrderHelper(treeNode.left, level + 1, result);
        levelOrderHelper(treeNode.right, level + 1, result);
    }

    private static Map<String, Integer> inorderMap;
    private static int postIndex;

    public static TreeNode buildTree(String[] inorder, String[] postorder) {
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
    private static TreeNode buildTreeHelper(String[] postorder, int inStart, int inEnd) {
        if (inStart > inEnd) {
            return null;
        }

        // 1. 从后序遍历中获取当前根节点的值
        String rootVal = postorder[postIndex];
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

    public static class TreeNode {
        public String val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode() {

        }
        public TreeNode(String val) {
            this.val = val;
        }

        public TreeNode(String val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
