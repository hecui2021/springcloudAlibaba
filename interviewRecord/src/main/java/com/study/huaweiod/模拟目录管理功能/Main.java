package com.study.huaweiod.模拟目录管理功能;

import java.util.*;

/**
 * @author peterche
 * @description:
 * @date 2025-03-26
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeNode current = new TreeNode("/", null, new ArrayList());
        String result = null;
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            if ("pwd".equals(str)) {
                result = current.val;
                continue;
            }
            String[] array = str.split(" ");
            String command = array[0];
            String path = array[1];
            if ("mkdir".equals(command)) {
                // 在当前目录创建子目录
                if (getChild(current.childList, path) != null) {
                    // 当前路径已有此目录，不操作
                    continue;
                }
                String childVal = current.val + path + "/";
                current.childList.add(new TreeNode(childVal, current, new ArrayList()));
                continue;
            }

            // 以下都是cd命令
            if ("..".equals(path)) {
                if (current.parent == null) {
                    // 上层目录不存在则不执行任何操作
                    continue;
                }
                current = current.parent;
                continue;
            }
            // cd下层目录
            path = current.val + path + "/";//重写绝对路径
            TreeNode child = getChild(current.childList, path);
            if (child != null) {
                // 下层目录存在
                current = child;
            }
        }
        scanner.close();
        System.out.println(result);
    }

    public static TreeNode getChild(List<TreeNode> childList, String path) {
        for (TreeNode node : childList) {
            if (path.equals(node.val)) {
                return node;
            }
        }
        return null;
    }

    public static class TreeNode {
        public String val;

        public TreeNode parent;

        public List<TreeNode> childList;

        public TreeNode(String val, TreeNode parent, List<TreeNode> childList) {
            this.val = val;
            this.parent = parent;
            this.childList = childList;
        }
    }
}
