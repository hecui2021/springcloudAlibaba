package com.study.huaweiod.二叉树的中序遍历;
import java.util.*;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/3/28 22:39
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        scanner.close();

        String[] array = inputStr.split("");
        Person[] personArray = new Person[array.length];
        for (int i = 0; i < personArray.length; i++) {
            personArray[i] = new Person(array[i], i);
        }
        Map<String,TreeNode> map = new HashMap();
        TreeNode first = null;
        while (true) {
            int start = -1;
            for (int i = 0; i < personArray.length; i++) {
                if ("{".equals(personArray[i].val)) {
                    start = i;
                    continue;
                }
                if ("}".equals(personArray[i].val) && start != -1)  {
                    String key = personArray[start - 1].val + personArray[start - 1].index;
                    TreeNode root = map.get(key);
                    if (root == null) {
                        root = new TreeNode(personArray[start - 1].val);
                        map.put(key, root);
                    }

                    if (i - start == 2) {
                        // 只有左子树
                        String leftKey = personArray[start + 1].val + personArray[start + 1].index;
                        TreeNode left = map.get(leftKey);
                        if (left == null) {
                            left = new TreeNode(personArray[start + 1].val);
                            map.put(leftKey, left);
                        }
                        root.left = left;
                    } else if (i - start == 3) {
                        // 只有右子树
                        String rightKey = personArray[start + 2].val + personArray[start + 2].index;
                        TreeNode right = map.get(rightKey);
                        if (right == null) {
                            right = new TreeNode(personArray[start + 2].val);
                            map.put(rightKey, right);
                        }
                        root.right = right;
                    } else if (i - start == 4) {
                        // 左子树和右子树都有
                        String leftKey = personArray[start + 1].val + personArray[start + 1].index;
                        String rightKey = personArray[start + 3].val + personArray[start + 3].index;
                        TreeNode left = map.get(leftKey);
                        if (left == null) {
                            left = new TreeNode(personArray[start + 1].val);
                            map.put(leftKey, left);
                        }
                        TreeNode right = map.get(rightKey);
                        if (right == null) {
                            right = new TreeNode(personArray[start + 3].val);
                            map.put(rightKey, right);
                        }
                        root.left = left;
                        root.right = right;
                    }
                    Person[] personNewArray = new Person[personArray.length - (i - start) - 1];
                    for (int j = 0; j < personNewArray.length; j++) {
                        if (j <= start -1) {
                            personNewArray[j] = personArray[j];
                        } else {
                            personNewArray[j] = personArray[j + (i - start) + 1];
                        }
                    }
                    personArray = personNewArray;
                    start = -1;
                }
            }
            if (personArray.length == 1) {
                first = map.get(personArray[0].val + personArray[0].index);
                break;
            }
        }
        print(first);
        System.out.println();

    }

    public static void print(TreeNode root) {
        if (root == null) {
            return;
        }
        print(root.left);
        System.out.print(root.val);
        print(root.right);
    }

    public static class Person {
        public String val;
        public int index;

        public Person(String val, int index) {
            this.val = val;
            this.index = index;
        }
    }

    public static class TreeNode {
        public String val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(String val) {
            this.val = val;
        }
    }
}
