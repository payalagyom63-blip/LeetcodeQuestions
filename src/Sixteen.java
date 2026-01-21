class Sixteen {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head)
    {
        ListNode skiptwo = head;
        while (skiptwo != null && skiptwo.next != null) {
            skiptwo = skiptwo.next.next;
            if (skiptwo == head) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(-4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;

        Sixteen s = new Sixteen();
        System.out.println(s.hasCycle(n1));
    }
}
