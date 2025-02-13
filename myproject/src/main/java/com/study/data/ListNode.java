package com.study.data;

/**
 * @author peterche
 * @description:
 * @date 2024-05-21
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode() {

    }
    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
}
