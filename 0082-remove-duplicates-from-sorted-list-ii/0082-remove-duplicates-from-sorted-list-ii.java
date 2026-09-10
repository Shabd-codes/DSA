class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode prev = null;
        ListNode temp = head;

        while (temp != null) {

            boolean duplicate = false;

            while (temp.next != null && temp.val == temp.next.val) {
                duplicate = true;
                temp = temp.next;
            }

            if (duplicate) {

                if (prev == null) {
                    head = temp.next;
                } else {
                    prev.next = temp.next;
                }

            } else {
                prev = temp;
            }

            temp = temp.next;
        }

        return head;
    }
}