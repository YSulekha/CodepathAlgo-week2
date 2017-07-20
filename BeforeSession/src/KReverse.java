import java.util.ArrayList;

/**
 * Created by aharyadi on 7/20/17.
 */
public class KReverse {

    class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

        public ListNode reverseList(ListNode A, int B) {

            ListNode current = A;
            ListNode prev = null;
            ListNode next;
            ListNode temp = A;
            ArrayList<ListNode> list = new ArrayList<>();
            while (current != null) {
                temp = current;
                prev = null;
                for (int i = 0; i < B; i++) {
                    next = current.next;
                    current.next = prev;
                    prev = current;
                    current = next;
                }
                list.add(prev);

            }
            ListNode x = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                while (x.next != null) {
                    x = x.next;
                }
                x.next = list.get(i);
                x = list.get(i);
            }
            x = list.get(0);


            return x;

        }
    }
