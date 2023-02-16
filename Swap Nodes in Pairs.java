 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)  return head;
        ListNode curr = head.next.next;
        ListNode prev = head;
        head = head.next;                 //Swapping first two nodes outside loop to maintain head.
        head.next = prev;
        while(curr!=null && curr.next!=null){
            prev.next = curr.next;
            prev = curr;
            ListNode nxt = curr.next.next;   //Create new node nxt to keep hold of linked list.
            curr.next.next = curr;
            curr = nxt;
        }
        prev.next = curr;
        return head;
    }
}
