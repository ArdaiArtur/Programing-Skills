package Day10;

public class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode mid=head;
        int count=1;
        while(head.next!=null)
        {
            count++;
             head=head.next;
            if(count%2==0){
            mid=mid.next;
            }
        }
        return mid;
    }
}
