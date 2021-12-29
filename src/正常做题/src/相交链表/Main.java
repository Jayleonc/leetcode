package 正常做题.src.相交链表;

import 正常做题.src.ListNode;

import static 正常做题.src.LocalLinkedList.createLinkedList;
import static 正常做题.src.LocalLinkedList.printLinkedList;

/**
 * @author : Jayleonc
 * @date : 2021-12-09 16:36
 */
public class Main {

    public static void main(String[] args) {
        ListNode headA = createLinkedList(new int[]{4, 1, 8, 4, 5});
        ListNode headB = createLinkedList(new int[]{5, 6, 1, 8, 4, 5});
        ListNode intersectionNode = getIntersectionNode(headA, headB);
        printLinkedList(intersectionNode);
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode l1 = headA;
        ListNode l2 = headB;
        while (l1 != l2) {
            l1 = l1 == null ? headB : l1.next;
            l2 = l2 == null ? headA : l2.next;
        }
        return l1;
    }
}
