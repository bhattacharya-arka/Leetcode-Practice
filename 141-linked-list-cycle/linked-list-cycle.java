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
    public boolean hasCycle(ListNode head) {

        if(head==null)
        {
            return false;
        }
        if(head.next==null)
        {
            return false;
        }
        ListNode ptr=head;
        ListNode ptrnext=head;
        while(ptr!=null && ptr.next!=null)
        {
            ptr=ptr.next.next;
            ptrnext=ptrnext.next;
            if(ptr==ptrnext)
            {
                return true;
            }
        }
        return false;
        
    }
}