package 正常做题.src.合并两个有序链表;


import 正常做题.src.ListNode;

import static 正常做题.src.LocalLinkedList.createLinkedList;
import static 正常做题.src.LocalLinkedList.printLinkedList;

/**
 * @author : Jayleonc
 * @date : 2021-12-08 16:01
 */
public class MergeTwoLists {
    public static void main(String[] args) {
        ListNode l1 = createLinkedList(new int[]{1, 2, 3});
        ListNode l2 = createLinkedList(new int[]{1, 4, 5});
        ListNode listNode = mergeTwoLists(l1, l2);
        printLinkedList(listNode);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode cur = res;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if (l1 == null) {
            cur.next = l2;
        }
        if (l2 == null) {
            cur.next = l1;
        }
        return res.next;
    }
}
