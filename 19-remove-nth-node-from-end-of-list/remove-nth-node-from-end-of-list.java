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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 1. Create a dummy node to seamlessly handle edge cases (like removing the head node)
        ListNode dummy = new ListNode(0, head);
        ListNode fast = dummy;
        ListNode slow = dummy;
        
        // 2. Advance the fast pointer 'n' steps ahead to establish the gap
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        
        // 3. Move both pointers together until fast reaches the last node
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        // 4. Bypasses the target node (slow.next is the node to delete)
        slow.next = slow.next.next;
        
        // Return the actual head of the list
        return dummy.next;
    }
}
