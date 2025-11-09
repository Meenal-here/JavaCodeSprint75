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
class IsPalindrome{
    public static ListNode reverse(ListNode head){
        ListNode prev = head;
        ListNode curr = head.next;
        while(curr!=null){
            ListNode nextNode=curr.next;
            curr.next=prev;

            prev=curr;
            curr=nextNode;
        }
        head.next=null;
        return prev;
    }
    public static ListNode findMiddle(ListNode head){
        ListNode hare = head;
        ListNode turtle = head;

        while(hare.next!=null && hare.next.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
        }
        return turtle;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode middle = findMiddle(head);
        ListNode startOfSecond = reverse(middle.next);
        ListNode curr=head;
        while(startOfSecond!=null){
            if(startOfSecond.val!=curr.val){
                return false;
            }
            startOfSecond=startOfSecond.next;
            curr=curr.next;
        }
        return true;
    }
}