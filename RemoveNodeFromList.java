class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) {
            return null;
        }

        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            size++;
            curr = curr.next;
        }

        if (n == size) {
            return head.next;
        }

        int indexToSearch = size - n;
        curr = head;
        int i = 1;
        while (i < indexToSearch) {
            curr = curr.next;
            i++;
        }

        curr.next = curr.next.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution obj = new Solution();

        head = obj.removeNthFromEnd(head, 2);

        System.out.print("Updated List: ");
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}
