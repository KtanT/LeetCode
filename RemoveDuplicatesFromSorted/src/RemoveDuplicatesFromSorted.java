/**
 * 
 */

/**
 * @author Kyran
 */
public class RemoveDuplicatesFromSorted {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode result = new ListNode(0);
        result.next = head;
        ListNode cur = head;

        while (cur.next != null) {
            if (cur.val != cur.next.val) {
                cur = cur.next;
            } else {
                cur.next = cur.next.next;
            }
        }

        return result.next;
    }
}
