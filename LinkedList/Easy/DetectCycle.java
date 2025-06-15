class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class DetectCycle {
    public static boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static ListNode buildList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    public static void printList(ListNode head, int limit) {
        int count = 0;
        while (head != null && count < limit) {
            System.out.print(head.val + " -> ");
            head = head.next;
            count++;
        }
        if (head != null) System.out.print("...");
        else System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        // Input: head = [3,2,0,-4], and make -4 point to node with value 2
        int[] values1 = {3, 2, 0, -4};
        ListNode l1 = buildList(values1);

        // Create a cycle: connect last node to the node with value 2 (2nd node)
        ListNode tail = l1;
        ListNode cycleNode = null;
        int pos = 1; // index of node to link the cycle to (0-based)
        int index = 0;

        while (tail.next != null) {
            if (index == pos) {
                cycleNode = tail;
            }
            tail = tail.next;
            index++;
        }
        tail.next = cycleNode; // form the cycle

        // Uncomment to test list printing (limited to prevent infinite loop)
        // printList(l1, 10);

        System.out.println("Has cycle: " + hasCycle(l1)); // should print true
    }
}
