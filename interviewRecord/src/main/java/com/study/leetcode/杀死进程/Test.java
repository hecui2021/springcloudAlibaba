package com.study.leetcode.杀死进程;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/10/24 19:11
 */
public class Test {
    /**
     * zengchong z00489454
     * 系统中存在 n 个进程，形成一个有根树结构。给你两个整数数组 pid 和 ppid ，其中 pid[i] 是第 i 个进程的 ID ，ppid[i] 是第 i 个进程的父进程 ID 。
     *
     * 每一个进程只有 一个父进程 ，但是可能会有 一个或者多个子进程 。只有一个进程的 ppid[i] = 0 ，意味着这个进程 没有父进程 。
     *
     * 当一个进程 被杀掉 的时候，它所有的子进程和后代进程都要被杀掉。
     *
     * 给你一个整数 kill 表示要杀掉​​进程的 ID ，返回杀掉该进程后的所有进程 ID 的列表。可以按 任意顺序 返回答案。
     *
     *   3-1
     *   3-5
     *      5-10
     *   0-3
     *
     *
     *
     * 输入：pid = [1,3,10,5], ppid = [3,0,5,3], kill = 5
     * 输出：[5,10]
     *
     *
     * 输入：pid = [1], ppid = [0], kill = 1
     * 输出：[1]
     * @param args
     */
    public static void main(String[] args) {
        int[] pid = {1,3,10,5};
//        int[] pid = {1};
        int[] ppid = {3,0,5,3};
//        int[] ppid = {0};
        int killId = 5;
//        int killId = 1;
        Test test = new Test();
        test.ask(pid,ppid, killId);
    }

    public void ask(int[] pid, int[] ppid, int killId) {
        Map<Integer, TreeNode> map = new HashMap<>();
        for (int i = 0; i < pid.length; i++) {
            int id = pid[i];
            int fatherId = ppid[i];
            if (fatherId != 0) {
                TreeNode father = map.get(fatherId);
                if (father == null) {
                    List<TreeNode> childList = new ArrayList<>();
                    childList.add(new TreeNode(id, null));
                    map.put(fatherId, new TreeNode(fatherId, childList));
                } else {
//                    List<Integer> childList = father.childList;
                    List<TreeNode> childList = father.childList;
                    if (childList == null) {
                        childList = new ArrayList<>();
                    }
                    childList.add(new TreeNode(id, null));
                    father.childList = childList;
                    map.put(fatherId, father);
                }
            }

            TreeNode child = map.get(id);
            if (child == null) {
                map.put(id, new TreeNode(id, null));
            }
        }
//        System.out.println(map);

        TreeNode treeNode = map.get(killId);
        bianli(treeNode);

    }

    public void bianli(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        System.out.println(treeNode.id);
        List<TreeNode> childList = treeNode.childList;
        if (childList != null) {
            for (TreeNode node : childList) {
                bianli(node);
            }
        }

    }

    static class TreeNode {
        public int id;
        public List<TreeNode> childList;

        public TreeNode(int id, List<TreeNode> childList) {
            this.id = id;
            this.childList = childList;
        }
    }
}
