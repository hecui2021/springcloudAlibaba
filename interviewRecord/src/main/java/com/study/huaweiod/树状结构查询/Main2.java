package com.study.huaweiod.树状结构查询;

import java.util.*;

/**
 * @author peterche
 * @description:
 * @date 2025-03-26
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 输入行数

        HashMap<String, HashSet<String>> tree = new HashMap<>(); // 创建一个HashMap用于存储树的关系

        // 读取输入的树的关系，并将子节点和父节点存入HashMap中
        for (int i = 0; i < n; i++) {
            String childNode = sc.next(); // 子节点
            String parentNode = sc.next(); // 父节点

            tree.computeIfAbsent(parentNode, k -> new HashSet<>()).add(childNode); // 将子节点添加到父节点的集合中
        }

        String targetNode = sc.next(); // 输入要查询的节点

        if (!tree.containsKey(targetNode)) { // 如果树中不包含要查询的节点，则输出空行并结束程序
            System.out.println("");
            return;
        }

        LinkedList<String> queue = new LinkedList<>(tree.get(targetNode)); // 创建一个队列，用于存储要遍历的节点

        ArrayList<String> result = new ArrayList<>(); // 创建一个ArrayList，用于存储查询节点的所有下层节点

        // 遍历队列，将节点添加到结果集中，并将该节点的子节点添加到队列中
        while (!queue.isEmpty()) {
            String node = queue.removeFirst(); // 从队列中取出节点
            result.add(node); // 将节点添加到结果集中

            if (tree.containsKey(node)) { // 如果节点在树中有子节点，则将子节点添加到队列中
                queue.addAll(tree.get(node));
            }
        }

        result.sort(String::compareTo); // 对结果集进行排序

        result.forEach(System.out::println); // 打印结果集中的每个节点
    }
}
