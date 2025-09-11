package com.study.leetcode.二叉树的层序遍历;

import com.study.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/11 08:23
 */
public class Main {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList();
        cengxu(root, 0, result);
        return result;
    }

    public void cengxu(TreeNode root, int level, List<List<Integer>> list) {
        if (root == null) {
            return;
        }
        if (list.size() == level) {
            list.add(new ArrayList());
        }
        list.get(level).add(root.val);
        cengxu(root.left, level + 1, list);
        cengxu(root.right, level + 1, list);

    }
}
