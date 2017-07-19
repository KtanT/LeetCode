import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 
 */

/**
 * @author Kyran
 */
public class MergeKSortedLists {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>() {
            public int compare(ListNode o1, ListNode o2) {
                if (o1.val < o2.val)
                    return -1;
                else if (o1.val == o2.val)
                    return 0;
                else
                    return 1;
            }
        });

        ListNode result = new ListNode(0);
        ListNode cur = result;

        for (ListNode listNode : lists) {
            if (listNode != null) {
                queue.add(listNode);
            }
        }

        while (!queue.isEmpty()) {
            cur.next = queue.poll();
            cur = cur.next;

            if (cur.next != null) {
                queue.add(cur.next);
            }
        }

        return result.next;
    }
}
