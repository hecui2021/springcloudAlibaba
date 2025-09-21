package com.study.leetcode.路径总和II;

import com.study.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/13 08:51
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        TreeNode root = new TreeNode(-2);
        TreeNode node1 = new TreeNode(-3);
        root.right = node1;
        List<List<Integer>> lists = main.pathSum(root, -5);
        System.out.println(lists);

    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList();
        List<Integer> list = new ArrayList();
        pathSum(root, targetSum, result, list, 0);
        return result;
    }

    public void pathSum(TreeNode root, int targetSum, List<List<Integer>> result, List<Integer> list, int sum) {
        if (root == null) {
            return;
        }
        sum += root.val;
        List<Integer> list2 = new ArrayList(list);
        list2.add(root.val);
        if (sum == targetSum &&root.left == null && root.right == null) {
            result.add(list2);
            return;
        }
        pathSum(root.left, targetSum, result, list2, sum);
        pathSum(root.right, targetSum, result, list2, sum);
    }
}
