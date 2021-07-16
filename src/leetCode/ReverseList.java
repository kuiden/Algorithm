package leetCode;


import List.ListNode;

/**
 * @author kudeng
 * @version 2021/7/15 14:21
 * @description 链表反转
 */
public class ReverseList {

    public static void main(String[] args) {
        ListNode list3 = new ListNode(3);
        ListNode list2 = new ListNode(2, list3);
        ListNode list1 = new ListNode(1, list2);
        ListNode prev = null;
        ListNode curr = list1;
        while (curr != null) {
            ListNode node = curr.next;
            curr.next = prev;
            prev = curr;
            curr = node;
        }
        while (prev != null) {
            System.out.print(prev.val + " ");
            prev = prev.next;
        }
        return;
    }

}
