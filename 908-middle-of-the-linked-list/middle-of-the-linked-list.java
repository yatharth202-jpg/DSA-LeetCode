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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        ListNode curr = head;

        int i = 0;
        while(temp.next != null) {
            i++;
            temp = temp.next;
        }

        if( (i%2) == 0) {
         for(int j = 0; j < (( i / 2) ) ; j++ ) {
            curr = curr.next;
         }
         return curr;
    } else {
        for(int j = 0; j < (( i / 2) +1 ) ; j++ ) {
            curr = curr.next;
         }
         return curr;
    }
    }
}