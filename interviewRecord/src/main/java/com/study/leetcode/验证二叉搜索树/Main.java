package com.study.leetcode.验证二叉搜索树;

import com.study.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/10 14:13
 */
public class Main {
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList();
        bianli(root, list);

        int pre = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            int cur = list.get(i);
            if (cur <= pre) {
                return false;
            }
            pre = cur;
        }
        return true;
    }

    public void bianli(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        bianli(root.left, list);
        list.add(root.val);
        bianli(root.right, list);
    }
}
