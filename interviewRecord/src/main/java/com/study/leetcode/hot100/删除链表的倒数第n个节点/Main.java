package com.study.leetcode.hot100.删除链表的倒数第n个节点;

import com.study.ListNode;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/10/27 23:53
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        ListNode listNode = main.removeNthFromEnd(head, 1);
        System.out.println(listNode);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int sum = 0;
        ListNode cur = head;
        while (cur != null) {
            sum++;
            cur = cur.next;
        }

        cur = head;
        int count = 0;
        ListNode pre = null;

        while (cur != null) {
            count++;
            if (count == sum - n + 1) {
                if (sum - n + 1 == 1) {
                    return head.next;
                } else {
                    pre.next = cur.next;
                    return head;
                }
            }
            pre = cur;
            cur = cur.next;
        }
        return head;
    }
}
