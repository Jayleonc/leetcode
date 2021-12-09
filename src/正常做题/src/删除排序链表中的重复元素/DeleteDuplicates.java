package 正常做题.src.删除排序链表中的重复元素;

import 正常做题.src.ListNode;

import static 正常做题.src.LocalLinkedList.createLinkedList;
import static 正常做题.src.LocalLinkedList.printLinkedList;

/**
 * @author : Jayleonc
 * @date : 2021-12-08 18:17
 */
public class DeleteDuplicates {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode res = head;
        while (res.next != null) {
            if (res.val == res.next.val) {
                res.next = res.next.next;
            } else {
                res = res.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = createLinkedList(new int[]{1, 2, 3, 3, 4, 4});
        ListNode listNode = deleteDuplicates(l1);
        printLinkedList(listNode);
    }
}
