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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        } else if (lists.length == 1) {
            return lists[0];
        }
        
        PriorityQueue<Integer> p = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a - b; 
            }
        }); 
        
        for (ListNode node : lists) {
            while (node != null) {
                p.add(node.val);
                node = node.next;
            }
        }
        if (p.isEmpty()) {
            return null;
        }
        
        ListNode head = new ListNode(p.poll());
        ListNode curr = head;
        while (!p.isEmpty()) {
            curr.next = new ListNode(p.poll());
            curr = curr.next;
        }
        
        return head;   
    }
}