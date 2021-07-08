/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
       if (head == null || head.next == null) {
           return null;
       }
        ListNode slow = head, fast = head;
        
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast){
                //len of cycle
                int len = len(slow);
                //headNode
                return findHead(head, len);
            }
        }
        return null;
    }
    public int len(ListNode head) {
        ListNode curr = head.next;
        int count = 1;
        while (curr != head) {
            count += 1;
            curr = curr.next;
        }
        return count;
    }
    
    public ListNode findHead(ListNode head, int len) {
        ListNode fast = head, slow = head;
        for (int i = 0; i < len; i++) {
            fast = fast.next;
        }
        
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
        
    }
}