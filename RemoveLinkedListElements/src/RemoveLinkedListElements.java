/**
 * 
 */

/**
 * @author Kyran
 */
public class RemoveLinkedListElements {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        ListNode node = new ListNode(0);
        node.next = head;
        ListNode current = node;

        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return node.next;
    }
}
