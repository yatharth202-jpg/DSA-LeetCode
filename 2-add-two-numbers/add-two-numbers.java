/**
 * Definition for singly-linked list provided by LeetCode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // A dummy node to act as the head reference for our result list
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead; // Pointer to construct the new list
        
        int carry = 0; // Stores the carry-over value

        // Loop runs as long as there are nodes left in l1 OR l2 OR a carry exists
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry; // Start with the carry from the previous step

            // Add value from l1 if it exists, then move to the next node
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            // Add value from l2 if it exists, then move to the next node
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // Calculate the new carry (e.g., 14 / 10 = 1)
            carry = sum / 10;

            // Create a new node with the last digit of the sum (e.g., 14 % 10 = 4)
            current.next = new ListNode(sum % 10);
            
            // Advance the pointer of the result list
            current = current.next;
        }

        // The actual result list starts right after the dummy head
        return dummyHead.next;
    }
}
