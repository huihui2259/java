package myjava;

import java.util.List;

public class ConstructList {
    public static ListNode constructList(int[] res) {
        ListNode dummy = new ListNode();
        ListNode head = dummy;
        for (int i : res) {
            ListNode tmp = new ListNode(i);
            head.next = tmp;
            head = head.next;
        }
        head.next = null;
        return dummy.next;
    }

    public static ListNode constructList(List<Integer> list) {
        ListNode dummy = new ListNode();
        ListNode head = dummy;
        for (int i : list) {
            ListNode tmp = new ListNode(i);
            head.next = tmp;
            head = head.next;
        }
        head.next = null;
        return dummy.next;
    }
}
