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
public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Find the meeting point
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        // No cycle
        if (fast == null || fast.next == null) {
            return null;
        }

        // Step 2: Find the length of the cycle
        int cycleLength = 1;
        ListNode temp = slow.next;

        while (temp != slow) {
            cycleLength++;
            temp = temp.next;
        }

        // Step 3: Put temp at head
        temp = head;

        // Move temp cycleLength steps ahead
        for (int i = 0; i < cycleLength; i++) {
            temp = temp.next;
        }

        // Step 4: Find cycle start
        ListNode start = head;

        while (start != temp) {
            start = start.next;
            temp = temp.next;
        }

        return start;
    }
}