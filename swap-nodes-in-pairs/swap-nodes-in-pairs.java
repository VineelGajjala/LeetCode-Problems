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
    public ListNode swapPairs(ListNode head) {
    if (head == null || head.next==null)
        return head;

    ListNode swapList = new ListNode(0,head);
    ListNode swapListHead = swapList;
    ListNode first,second;

    while (swapList.next!=null && swapList.next.next!=null)   {
        first=swapList.next;
        second=first.next;
        first.next=second.next;
        second.next=first;
        swapList.next=second;
        swapList=swapList.next.next;
    }
    return swapListHead.next;
}
}