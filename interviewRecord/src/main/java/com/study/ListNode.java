package com.study;


/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/3/11 22:08
 */

public class ListNode {

    public int index;
    public int val;
    public String valStr;

    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(String valStr) {
        this.valStr = valStr;
    }

}
