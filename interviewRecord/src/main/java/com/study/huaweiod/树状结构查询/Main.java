package com.study.huaweiod.树状结构查询;

import java.util.*;

/**
 * @author peterche
 * @description:
 * @date 2025-03-26
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        Map<String, TreeNode> map = new HashMap();
        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            String[] array = str.split(" ");
            String childVal = array[0];
            String parentVal = array[1];

            TreeNode parent = map.get(parentVal);
            if (parent == null) {
                parent = new TreeNode(parentVal, null, new HashSet());
            }
            TreeNode current = new TreeNode(childVal, parent, new HashSet());
            parent.childSet.add(current);
            map.put(parentVal, parent);
            map.put(childVal, current);
        }
        String selectNodeStr = scanner.nextLine();
        TreeNode selectNode = map.get(selectNodeStr);
        if (selectNode == null) {
            return;
        }
        List<String> list = new ArrayList();
        print(selectNode, list);

        Collections.sort(list);

        for (String s : list) {
            System.out.println(s);
        }

    }

    public static void print(TreeNode node, List<String> list) {
        if (node == null || node.childSet.isEmpty()) {
            return;
        }
        for (TreeNode child : node.childSet) {
            list.add(child.val);
            print(child, list);
        }
    }

    public static class TreeNode {
        public String val;
        public TreeNode parent;
        public Set<TreeNode> childSet;

        public TreeNode(String val, TreeNode parent, Set<TreeNode> childSet) {
            this.val = val;
            this.parent = parent;
            this.childSet = childSet;
        }
    }
}