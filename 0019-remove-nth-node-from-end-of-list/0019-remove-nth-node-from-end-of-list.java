class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int sz=0;
        ListNode temp=head;
        ListNode prev= head;

        
        while(temp!=null){
            temp=temp.next;
            sz++;
        }

        if(n == sz){
            return head.next;
        }

        int i = 1;
        int iToFind= sz-n;
        
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        
        prev.next=prev.next.next;
        return head;
    }
}