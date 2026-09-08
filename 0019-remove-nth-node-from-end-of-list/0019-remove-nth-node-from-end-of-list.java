class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp = head;
        int c = 0;

        while(temp != null) {
            c++;
            temp = temp.next;
        }

        int m = c - n;

        temp = head;
        if(m == 0) {
    return head.next;
}

        for(int i = 1; i < m; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }
}