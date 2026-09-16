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
    public ListNode deleteMiddle(ListNode head) {
        // Edge Case: If the list has only 1 node, deleting it leaves an empty list
        if (head == null || head.next == null) {
            return null;
        }

        // Initialize slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null; // Keeps track of the node right before 'slow'

        // Move fast by 2 steps and slow by 1 step
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // 'slow' is now pointing to the middle node. 
        // 'prev' points to the node before 'slow'.
        // Delete the middle node by skipping it.
        prev.next = slow.next;

        return head;
    }
}
