package com.study.leetcode.将有序数组转换为二叉搜索树;

import com.study.TreeNode;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/11 21:40
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode treeNode = main.sortedArrayToBST(nums);
        System.out.println(treeNode);

    }

    public TreeNode sortedArrayToBST(int[] nums) {
        int mid = nums.length / 2;
        if (nums.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(nums[mid]);
        int[] left = new int[mid];
        int[] right = new int[nums.length - mid - 1];
        for (int i = 0; i < nums.length; i++) {
            if (i < mid) {
                left[i] = nums[i];
            } else if (i > mid) {
                right[i - mid - 1] = nums[i];
            }
        }
        root.left = sortedArrayToBST(left);
        root.right = sortedArrayToBST(right);
        return root;
    }
}
