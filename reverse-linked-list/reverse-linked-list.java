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
    ListNode root = null;
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        helper(head);
        return root;
        
    }
    
    public ListNode helper(ListNode current) {
        if (current.next != null) {
            ListNode ret = helper(current.next);
            if (ret == null) {
                root.next = current;
            } else {
                ret.next = current;
            }
            current.next = null;
            return current;
            
        } else {
            root = current;
            return null;
        }
    }
}