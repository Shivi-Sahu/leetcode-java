class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0)
        return head;

        int L = 1;
        ListNode tail = head ;
        while(tail.next != null){
            tail = tail.next;
            L++;
        }
        k = k % L;
        if(k == 0){
            return head;
        }
        tail.next = head; //circular ll bnaya hai 

        int steps = L-k;

        ListNode newtail = head; //newTail naam ka ek pointer banao, jo shuru mein head wale node ko point karega.
        for(int i =1; i<steps; i++){
            newtail = newtail.next;
        }
        ListNode newHead = newtail.next;
        newtail.next = null;


        return newHead;

        
    }
}
