package com.study.leetcode.恢复二叉搜索树;

import com.study.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/10 14:43
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);

        node3.left = node1;
        node3.right = node4;
        node4.left = node2;

        main.recoverTree(node3);

    }


    public void recoverTree(TreeNode root) {
        Map<Integer, TreeNode> map = new HashMap();
        List<Integer> list = new ArrayList();
        bianli(root, map, list);

        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        bulleSort(array);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != array[i]) {
                TreeNode node = map.get(list.get(i));
                node.val = array[i];
            }
        }
    }

    public void bulleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void bianli(TreeNode root, Map<Integer, TreeNode> map, List<Integer> list) {
        if (root == null) {
            return;
        }
        bianli(root.left, map, list);
        map.put(root.val, root);
        list.add(root.val);
        bianli(root.right, map, list);
    }
}
