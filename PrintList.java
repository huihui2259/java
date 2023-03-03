package myjava;

public class PrintList {
    public static void printList(ListNode head) {
        if (head == null) {
            return;
        }
        while (head != null) {
            System.out.print(head.val);
            System.out.print("  ");
            head = head.next;
        }
        System.out.println();
    }
}
