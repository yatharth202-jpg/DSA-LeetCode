/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode temp = slow;
        ListNode prev = null;

        while(temp != null) {
           ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

            ListNode fh = head;
            ListNode sh = prev;
        while(sh != null) {
           
            if(sh.val != fh.val) {
                return false;
            }

            fh = fh.next;
            sh = sh.next;
           
        }

         return true;
    }
}