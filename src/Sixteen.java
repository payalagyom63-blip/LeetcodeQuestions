public class Sixteen {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode hare = head;
        ListNode tort = head;

        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            tort = tort.next;

            if (hare == tort) {
                return true;
            }
        }

        return false;
    }

    public static ListNode buildList(int[] nums, int pos) {
        if (nums.length == 0) return null;

        ListNode head = new ListNode(nums[0]);
        ListNode current = head;
        ListNode cycleNode = null;

        for (int i = 1; i < nums.length; i++) {
            current.next = new ListNode(nums[i]);
            current = current.next;
            if (i == pos) {
                cycleNode = current;
            }
        }

        if (pos >= 0) {
            current.next = (pos == 0) ? head : cycleNode;
        }

        return head;
    }

    public static void main(String[] args) {
        Sixteen obj = new Sixteen();

        int[] nums = {3, 2, 0, -4};
        int pos = 1;

        ListNode head = buildList(nums, pos);
//        System.out.println("");
        System.out.println(obj.hasCycle(head));
    }
}
