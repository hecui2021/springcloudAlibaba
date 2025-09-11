package com.study.huaweiod.文件目录大小;

import java.util.*;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/8 10:11
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int selectId = scanner.nextInt();
        scanner.nextLine();

        Map<Integer, TreeNode> map = new HashMap();
        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            String[] array = str.split(" ");
            int id = Integer.parseInt(array[0]);
            int size = Integer.parseInt(array[1]);
            String nodeArrayString = array[2].substring(1, array[2].length() - 1);
            int[] nodeArrayInt = null;
            if (!"".equals(nodeArrayString)) {
                String[] nodeArray = nodeArrayString.split(",");
                nodeArrayInt = new int[nodeArray.length];
                for (int k = 0; k< nodeArray.length; k++) {
                    nodeArrayInt[k] = Integer.parseInt(nodeArray[k]);
                }
            }

            TreeNode treeNode = new TreeNode(id, size, nodeArrayInt);
            map.put(id, treeNode);
        }
        aa(selectId, map);
        System.out.println(sum);
    }

    static int sum = 0;

    public static void aa(int id, Map<Integer, TreeNode> map) {
        TreeNode treeNode = map.get(id);
        if (treeNode == null) {
            return;
        }
        sum += treeNode.size;
        int[] nodeArray = treeNode.nodeArray;
        if (nodeArray == null) {
            return;
        }
        for (int i = 0; i < nodeArray.length; i++) {
            aa(nodeArray[i], map);
        }
    }


    static class TreeNode {
        public int id;
        public int size;
        public int[] nodeArray;

        public TreeNode(int id, int size, int[] nodeArray) {
            this.id = id;
            this.size = size;
            this.nodeArray = nodeArray;
        }
    }
}
