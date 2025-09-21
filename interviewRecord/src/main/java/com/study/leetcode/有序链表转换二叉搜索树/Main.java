package com.study.leetcode.有序链表转换二叉搜索树;

import com.study.ListNode;
import com.study.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/12 07:15
 */
public class Main {
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> list = toList(head);
        TreeNode root = dfs(list);
        return root;
    }

    private TreeNode dfs(List<Integer> list) {
        if (list.size() == 0) {
            return null;
        }

        int mid = list.size() / 2;
        TreeNode root = new TreeNode(list.get(mid));
        List<Integer> left = new ArrayList();
        List<Integer> right = new ArrayList();

        for (int i = 0; i < list.size(); i++) {
            if (i < mid) {
                left.add(list.get(i));
            } else if (i > mid) {
                right.add(list.get(i));
            }
        }
        root.left = dfs(left);
        root.right = dfs(right);
        return root;
    }

    private List<Integer> toList(ListNode head) {
        List<Integer> list = new ArrayList();
        ListNode cur = head;
        while (cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }
        return list;
    }
}
