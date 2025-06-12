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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int pos=count-n;
        if(pos==0){
            return head.next;
        }
        ListNode var=head;
        for(int i=1;i<pos;i++){
            var=var.next;
        }
        var.next=var.next.next;
        return head;
    }
}