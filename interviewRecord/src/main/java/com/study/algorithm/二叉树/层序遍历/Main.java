package com.study.algorithm.二叉树.层序遍历;

import com.study.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/8 21:06
 */
public class Main {
    public static void main(String[] args) {
        // 构建测试二叉树：
        //       1
        //      / \
        //     2   3
        //    / \   \
        //   4   5   6
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        System.out.println("递归层序遍历: " + levelOrderRecursive(root));

    }

    public static List<List<Integer>> levelOrderRecursive(TreeNode treeNode) {
        List<List<Integer>> result = new ArrayList<>();

        if (treeNode == null) {
            return result;
        }

        levelOrderHelper(treeNode, 0, result);

        return result;
    }

    private static void levelOrderHelper(TreeNode treeNode, int level, List<List<Integer>> result) {
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
}
