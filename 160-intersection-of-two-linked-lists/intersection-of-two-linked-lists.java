/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public static int countNodes(ListNode head)
    {
        int c=0;
        ListNode q=head;
        while(q.next!=null)
        {
            q=q.next;
            c++;
        }
        return c;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int c1=countNodes(headA);
        int c2=countNodes(headB);
        int d=0;
        if(c1>c2)
        {
            d=c1-c2;
            while(d!=0)
            {
                headA=headA.next;
                d--;
            }
        }
        else
        {
            d=c2-c1;
            while(d!=0)
            {
                headB=headB.next;
                d--;
            }
        }
        while(headA!=headB)
        {
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
}