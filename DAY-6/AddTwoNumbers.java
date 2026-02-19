class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);   // start node
        ListNode curr = dummy;              // current pointer (like i)

        int carry = 0;                      // previous value (like len)

        // loop until both lists end AND no carry left
        while (l1 != null || l2 != null || carry != 0) {

            int v1 = 0;
            int v2 = 0;

            // get current values
            if (l1 != null) {
                v1 = l1.val;
                l1 = l1.next;   // move pointer forward
            }

            if (l2 != null) {
                v2 = l2.val;
                l2 = l2.next;   // move pointer forward
            }

            int sum = v1 + v2 + carry;

            carry = sum / 10;          // update previous value
            int digit = sum % 10;      // current result digit

            curr.next = new ListNode(digit);
            curr = curr.next;          // move current pointer
        }

        return dummy.next;
    }
}
