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
        // Create a dummy node to easily handle head-removal edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        int length = 0;
        ListNode first = head;
        while (first != null) {
            length++;
            first = first.next;
        }
        
        // We need to reach the (length - n)th node
        int target = length - n;
        ListNode curr = dummy;
        for (int i = 0; i < target; i++) {
            curr = curr.next;
        }
        
        // Skip the Nth node from the end
        curr.next = curr.next.next;
        
        return dummy.next;
    }
}
