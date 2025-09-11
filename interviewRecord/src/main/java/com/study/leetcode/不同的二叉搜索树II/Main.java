package com.study.leetcode.不同的二叉搜索树II;

import com.study.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/10 08:33
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        List<TreeNode> treeNodes = main.generateTrees(10);
        System.out.println(treeNodes);
    }

    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new LinkedList<TreeNode>();
        }
        return generateTrees(1, n);
    }

    public List<TreeNode> generateTrees(int start, int end) {
        List<TreeNode> allTrees = new LinkedList<TreeNode>();
        if (start > end) {
            allTrees.add(null);
            return allTrees;
        }

        // 枚举可行的根节点
        for (int i = start; i <= end; i++) {
            // 获得所有可行的左子树集合
            List<TreeNode> leftTrees = generateTrees(start, i -1);

            // 获得所有可行的右子树集合
            List<TreeNode> rightTrees = generateTrees(i + 1, end);

            for (TreeNode left : leftTrees) {
                for (TreeNode right : rightTrees) {
                    TreeNode current = new TreeNode(i);
                    current.left = left;
                    current.right = right;
                    allTrees.add(current);

                }
            }
        }
        return allTrees;
    }
}
