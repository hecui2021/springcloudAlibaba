package com.study.data;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author peterche
 * @description:
 * @date 2024-05-21
 */
public class LCR077 {

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next  = new ListNode(4);
        head.next.next  = new ListNode(1);
//        head.next.next.next  = new ListNode(3);

        LCR077 lcr077 = new LCR077();
        lcr077.sortList(head);

        System.out.println(JSONObject.toJSON(head));
    }

    public ListNode sortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }
        int[] array = new int[list.size()];
        for (int i = 0 ; i < list.size() ; i++) {
            array[i] = list.get(i);
        }
        sort(array, 0, array.length - 1);

        int index = 0;
        cur = head;
        while (cur != null) {
            cur.val = array[index];
            index++;
            cur = cur.next;
        }
        return head;
    }

    public void sort(int[] array, int low, int higt) {
        if (low >= higt) {
            return;
        }
        int partitiion = partitiion(array, low, higt);
        sort(array, low, partitiion - 1);
        sort(array, partitiion + 1, higt);
    }

    public int partitiion(int[] array, int low, int higt) {
        int temp = array[low];
        while (low < higt) {
            while (low < higt && array[higt] >= temp) {
                higt--;
            }
            array[low] = array[higt];
            while (low < higt && array[low] <= temp) {
                low++;
            }
            array[higt] = array[low];
        }
        array[low] = temp;
        return low;
    }
}
