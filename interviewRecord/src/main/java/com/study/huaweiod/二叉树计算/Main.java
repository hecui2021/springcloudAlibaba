package com.study.huaweiod.二叉树计算;

import java.util.*;
/**
 * @author peterche
 * @description:
 * @date 2025-03-24
 */
public class Main {
    public static Map<Integer, Integer> inMap = new HashMap();

    public static int preStart = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inStr = scanner.nextLine();
        String[] inStrArray = inStr.split(" ");
        int[] inArray = new int[inStrArray.length];

        for (int i = 0; i < inStrArray.length; i++) {
            inArray[i] = Integer.parseInt(inStrArray[i]);
            inMap.put(inArray[i], i);
        }

        String preStr = scanner.nextLine();
        String[] preStrArray = preStr.split(" ");
        int[] preArray = new int[preStrArray.length];
        for (int i = 0; i < preStrArray.length; i++) {
            preArray[i] = Integer.parseInt(preStrArray[i]);
        }
        scanner.close();

        TreeNode root = buildTree(preArray, preStart, preArray.length - 1);

        updateTreeNodeVal(root);

        List<Integer> list = new ArrayList();
        bianli(root, list);
        String result = "";
        for (Integer val : list) {
            if (result == "") {
                result += val;
            } else {
                result += " " + val;
            }
        }
        System.out.println(result);
    }

    public static void bianli(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        bianli(root.left, list);
        list.add(root.val);
        bianli(root.right, list);
    }

    public static int updateTreeNodeVal(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int oldVal = root.val;
        int sumLeft = updateTreeNodeVal(root.left);
        int sumRight = updateTreeNodeVal(root.right);

        int val = sumLeft + sumRight;
        root.val = val;
        return val + oldVal;
    }

    public static TreeNode buildTree(int[] preArray, int inStart, int inEnd) {
        if (inStart > inEnd) {
            return null;
        }

        // 从前序遍历中获取当前根节点
        TreeNode root = new TreeNode(preArray[preStart]);
        // 移动到下一个节点
        preStart++;

        // 在中序遍历中找到根节点的索引
        int index = inMap.get(root.val);

        // 递归构建左子树和右子树
        root.left = buildTree(preArray, inStart, index - 1);
        root.right = buildTree(preArray, index + 1, inEnd);
        return root;
    }

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
