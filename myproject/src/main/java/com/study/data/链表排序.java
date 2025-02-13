package com.study.data;

import java.util.List;

/**
 * @author peterche
 * @description:
 * @date 2024-06-19
 */
public class 链表排序 {

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(3);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(0);

        quickSort(head, null);
        System.out.println(head);
    }

    public static void quickSort(ListNode begin, ListNode end) {
        if (begin == null || begin == end) {
            return;
        }
        ListNode index = paration(begin, end);
        quickSort(begin, index);
        quickSort(index.next, end);

    }

//    public static ListNode paration(ListNode begin, ListNode end) {
//        ListNode index = begin;
//
//        while (begin != end) {
//            while (begin != end && end.val > begin.val) {
//                end = end.next;
//            }
//        }
//    }

    public static ListNode paration(ListNode begin, ListNode end) {
        if (begin == null || begin == end) {
            return begin;
        }

        int val = begin.val;
        ListNode index = begin;
        ListNode cur = begin.next;

        while (cur != end) {
            if (cur.val <val) {
                index = index.next;
                int tmp = cur.val;
                cur.val = index.val;
                index.val = tmp;
            }
            cur = cur.next;
        }
        begin.val = index.val;
        index.val = val;

        return index;
    }
}
