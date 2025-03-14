package com.study.huaweiod.字母组合过滤组合字符串;

/**
 * @author peterche
 * @description:
 * @date 2025-03-13
 */
import java.util.*;

public class DepthFirstSearch {
    private Map<Integer, List<Integer>> graph; // 图的邻接表

    // 构造函数
    public DepthFirstSearch() {
        graph = new HashMap<>(); // 初始化图
    }

    // 添加边：从源节点到目标节点
    public void addEdge(int source, int destination) {
        graph.putIfAbsent(source, new ArrayList<>()); // 如果源节点不存在，则添加
        graph.get(source).add(destination); // 添加目标节点到源节点的邻接表中
    }

    // 深度优先搜索的入口方法
    public void dfs(int start) {
        Set<Integer> visited = new HashSet<>(); // 用于记录访问过的节点
        dfsHelper(start, visited); // 调用递归助手方法
    }

    // 递归助手方法
    private void dfsHelper(int node, Set<Integer> visited) {
        if (visited.contains(node)) return; // 如果节点已访问，则返回
        visited.add(node); // 标记节点为已访问
        System.out.println(node); // 访问并打印当前节点

        // 遍历所有邻居节点
        for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
            dfsHelper(neighbor, visited); // 递归访问邻居节点
        }
    }

    public static void main(String[] args) {
        DepthFirstSearch dfs = new DepthFirstSearch();
        // 构建图：节点和边
        dfs.addEdge(1, 2);
        dfs.addEdge(1, 3);
        dfs.addEdge(2, 4);
        dfs.addEdge(2, 5);
        dfs.addEdge(3, 6);
        dfs.addEdge(3, 7);

        System.out.println("深度优先搜索结果：");
        dfs.dfs(1); // 从节点1开始搜索
    }
}
