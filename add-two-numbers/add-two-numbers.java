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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyhead = new ListNode(-1);
        ListNode curr = dummyhead;
        int rem = 0;
        
        while (l1 != null || l2 != null) {
            int val = rem;
            rem = 0;
            if (l1 == null) {
                val += l2.val;
                l2 = l2.next;
            } else if (l2 == null) {
                val += l1.val;
                l1 = l1.next;
            } else {
                val += l2.val + l1.val;
                l1 = l1.next;
                l2 = l2.next;
            }
            if (val >= 10) {
                val -= 10;
                rem += 1;
            }
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        if (rem != 0) {
            curr.next = new ListNode(1);
        }
        
        
        return dummyhead.next;
        
    }
}