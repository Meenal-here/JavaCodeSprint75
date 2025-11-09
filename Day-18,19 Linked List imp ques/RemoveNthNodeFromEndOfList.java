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
class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){//only one node
            return null;//after removing nth node from end, list will be empty
        }
        ListNode current = head;   //to calculate size of linked list
        int size=0;
        while(current!=null){
            current=current.next;
            size++; 
        }
        if(n==size){    //if we have to remove first node from the list
            return head.next;   //removing first node by returning second node as head
        }
        ListNode prev=head; //to reach (size-n)th node
        for(int i=1;i<size-n;i++){  //traverse till (size-n)th node
            prev=prev.next;
        }
        prev.next=prev.next.next;   //removing nth node from end by skipping it
        return head;
    }
}