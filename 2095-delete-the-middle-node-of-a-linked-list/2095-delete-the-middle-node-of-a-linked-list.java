class Solution {
    public ListNode deleteMiddle(ListNode head) {

        ListNode temp = head;
        int c = 0;

        while(temp != null) {
            temp = temp.next;
            c++;
        }

        temp = head;

        if(c >= 2) {
            int middle = (c / 2) + 1;

            for(int i = 1; i < middle - 1; i++) {
                temp = temp.next;
            }

            temp.next = temp.next.next;
        }
        else {
            return null;
        }

        return head;
    }
}