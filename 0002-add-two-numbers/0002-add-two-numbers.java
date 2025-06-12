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
        ListNode var=new ListNode();
        ListNode temp=var;
        int carry=0;
       while(l1!=null&&l2!=null){
        int add=carry+(l1.val+l2.val);
        temp.next=new ListNode(add%10);
        carry=add/10;
        l1=l1.next;
        l2=l2.next;
        temp=temp.next;
       } 
       while(l1!=null){
        int add=carry+l1.val;
        temp.next=new ListNode(add%10);
        carry=add/10;
        l1=l1.next;
        temp=temp.next;
       }
        while(l2!=null){
        int add=carry+l2.val;
        temp.next=new ListNode(add%10);
        carry=add/10;
        l2=l2.next;
        temp=temp.next;
       }
       if(carry!=0) temp.next=new ListNode(carry);
       return var.next;
    }
}