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
class ReverseList{
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode prev = head;   //to keep track of previous node
        ListNode curr = head.next;  //to keep track of current node

        while(curr!=null){  //traverse till end of list
            ListNode nextNode = curr.next;  //to keep track of next node
            curr.next=prev; //reverse the link
            

            prev=curr;  //update prev and curr for next iteration
            curr=nextNode;
        }
        head.next=null; //original head becomes tail, so point its next to null
        head=prev;  //update head to new head (prev)
        return head;
    }
}