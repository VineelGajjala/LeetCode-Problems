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
        Stack<ListNode> reverse = new Stack<ListNode>();
        ListNode dummy = head;
        
        while(dummy != null){
            reverse.push(dummy);
            dummy = dummy.next;
        }
        
        while(head !=null && !reverse.isEmpty()){ 
            // if value in head doesnt match stack val: return false
            if(reverse.pop().val != head.val) return false;
            // if value matches then move head to next el
            else{
                head = head.next;
            }
        }
        return true;
    }
}