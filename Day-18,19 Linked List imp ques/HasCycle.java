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
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode hare = head;//fast pointer
        ListNode turtle = head;//slow pointer

        while(hare!=null && hare.next!=null){   //to keep hare within bounds
            hare=hare.next.next;//move hare by 2 steps
            turtle=turtle.next;//move turtle by 1 step

            if(turtle==hare){   //if both pointers meet at same node, then cycle exists
                return true;
            }
        }
        return false;   //if we reach here, then no cycle exists
    }
}