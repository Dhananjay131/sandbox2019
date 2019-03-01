/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode prev = new ListNode(0);
        ListNode head = prev;
        int carry=0;
        
        while(l1!=null || l2!=null || carry!=0){
            
            ListNode cur = new ListNode(0);
            
            cur.val = (l1!=null ? l1.val : 0 ) + (l2!=null ? l2.val : 0 ) + carry;
            
            carry = cur.val / 10;
            cur.val %= 10;
            
            prev.next = cur;
            prev = cur;
            
            if(l1!=null)
                l1 = l1.next;
            if(l2!=null)
                l2 = l2.next;
            
            
        }
        // head -> prev -> cur.....
        return head.next;
    }
}

