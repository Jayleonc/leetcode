package 正常做题.src;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author : Jayleonc
 * @date : 2021-12-08 17:06
 */
public class LocalLinkedList {
    public static ListNode createLinkedList(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        // 把这个迭代想象成一个动画去理解，就很好理解了
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.printf("%d -> ", current.val);
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void roundPrintLinkedList(ListNode head) {
        Deque<ListNode> deque = new LinkedList<>();
        ListNode cur = head;
        while (cur != null) {
            deque.push(cur);
            cur = cur.next;
        }
        while (!deque.isEmpty()) {
            cur = deque.pop();
            System.out.printf("%d\t", cur.val);
        }
    }

    public static void round2(ListNode head) {
        if (head.next != null) {
            round2(head.next);
        }
        System.out.printf("%d\t", head.val);
    }
}
