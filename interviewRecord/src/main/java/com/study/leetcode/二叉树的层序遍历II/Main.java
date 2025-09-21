package com.study.leetcode.二叉树的层序遍历II;

import com.study.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/11 21:27
 */
public class Main {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList();
        bianli(root, 0, list);

        Collections.reverse(list);
        return list;
    }

    public void bianli(TreeNode root, int level, List<List<Integer>> list) {
        if (root == null) {
            return;
        }

        if (list.size() == level) {
            list.add(new ArrayList());
        }
        list.get(level).add(root.val);
        bianli(root.left, level + 1, list);
        bianli(root.right, level + 1, list);
    }
}
