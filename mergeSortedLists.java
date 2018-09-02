/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        ListNode newnode = null;
        if(l1==null) {
            return l2;
        }
        if(l2==null){
            return l1;
        }
        
        if(l1.val <= l2.val){
        head = l1;
            tail = head;
            l1 = l1.next;
        }
        else  if(l2.val<l1.val){
            head = l2;
            tail = head;
            l2 = l2.next;
        }
        
      
        while(l1!=null && l2!=null){
           
            if(l1.val <= l2.val){
                newnode = new ListNode(l1.val);
                l1 = l1.next;
                
               
            }
            else {
               newnode = new ListNode(l2.val);
                l2 = l2.next;
            }
            tail.next = newnode;
                tail = newnode;
          
            
        }
        
        if(l1!=null){
            tail.next = l1;
            tail = tail.next;
        }
        if(l2!=null){
            tail.next = l2;
            tail = tail.next;
        }
        
        
        return head;
    }
}