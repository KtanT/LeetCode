/**
 * 
 */

/**
 * @author Kyran
 */
public class SwapNodesInPairs {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode node = new ListNode(0);
        node.next = head;
        ListNode current = node;

        while (current.next != null && current.next.next != null) {
            ListNode node1 = current.next, node2 = current.next.next;
            current.next = node2;
            node1.next = node2.next;
            node2.next = node1;

            current = node1;
        }

        return node.next;
    }
}
