package myjava;

import java.nio.Buffer;

public class ReverseKGroup {

    // Definition for singly-linked list.

    public ListNode reverseKGroup(ListNode head, int k) {

        if (k == 1 || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode();
        dummy.next = head;
        // 需要记录当组的首尾和首的前一个，尾的后一个
        ListNode preHead = dummy;
        ListNode Head = preHead.next;
        ListNode Tail = head;
        ListNode proTail = Tail.next;

        while (true) {
            // 会一直循环，直到某一组的节点数量不足k
            // 循环k次，找到这组k的头尾指针
            int i = 0;
            while (i < k - 1 && Tail != null) {
                Tail = Tail.next;
                i++;
            }
            if (Tail == null) {
                //
                break;
            }
            // 下一次的开头
            proTail = Tail.next;
            // 截断
            Tail.next = null;
            // 两级反转
            Tail = reverse(Head);
            PrintList.printList(Tail);
            // 把中间的一段接上
            preHead.next = Tail;
            Head.next = proTail;
            // 迭代，指针重新指向下一次迭代的位置
            preHead = Head;
            Head = proTail;
            Tail = Head;
        }
        return dummy.next;
    }

    public ListNode reverse(ListNode head) {
        // 前置判断
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = head;
        ListNode cur = pre.next;
        while (cur != null) {
            ListNode nextCur = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nextCur;
        }
        head.next = null;
        return pre;
    }

}
