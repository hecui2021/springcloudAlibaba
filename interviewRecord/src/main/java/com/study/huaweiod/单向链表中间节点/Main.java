package com.study.huaweiod.单向链表中间节点;

import com.study.ListNode;

import java.util.*;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/28 18:37
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String rootAddress = input.split(" ")[0];

        int n = Integer.parseInt(input.split(" ")[1]);

        Map<String, Integer> map = new HashMap<>();
        Map<String, ListNode> nodeMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            String[] array = str.split(" ");
            if (array.length < 3) {
                continue;
            }
            // 保存每个节点-值的映射
            map.put(array[0], Integer.parseInt(array[1]));
            if ("-1".equals(array[2])) {
                nodeMap.put(array[0], null);
            } else {
                nodeMap.put(array[0], new ListNode(array[2]));
            }
        }
        scanner.close();

        List<String> nodeList = new ArrayList<>();
        dfs(rootAddress, nodeMap, nodeList);

        String resultNodeAddress = nodeList.get(nodeList.size() / 2);

        int resultVal = map.get(resultNodeAddress);
        System.out.println(resultVal);

    }

    public static void dfs(String nodeAddress, Map<String, ListNode> nodeMap, List<String> nodeList) {
        if (nodeAddress == null) {
            return;
        }
        nodeList.add(nodeAddress);
        ListNode listNode = nodeMap.get(nodeAddress);
        if (listNode != null) {
            dfs(listNode.valStr, nodeMap, nodeList);
        }
    }
}
