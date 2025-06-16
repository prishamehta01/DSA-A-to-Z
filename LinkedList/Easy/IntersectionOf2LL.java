class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class IntersectionOf2LL {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }
        return a; // will be null if no intersection
    }

    public static void main(String[] args) {
        // Common part: 8 -> 4 -> 5
        ListNode common = new ListNode(8, new ListNode(4, new ListNode(5)));

        // List A: 4 -> 1 -> [8 -> 4 -> 5]
        ListNode headA = new ListNode(4, new ListNode(1, common));

        // List B: 5 -> 6 -> 1 -> [8 -> 4 -> 5]
        ListNode headB = new ListNode(5, new ListNode(6, new ListNode(1, common)));

        // Get intersection
        ListNode intersection = getIntersectionNode(headA, headB);

        // Print result
        if (intersection != null)
            System.out.println("Intersected at node with value: " + intersection.val);
        else
            System.out.println("No intersection");
    }
}
