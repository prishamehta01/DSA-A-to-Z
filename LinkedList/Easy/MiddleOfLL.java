class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MiddleOfLL {

    // 🔧 Helper method to create linked list from array
    public static ListNode createLinkedList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    // 🔍 Method to find middle node
    public static ListNode middleNode(ListNode head) { 
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // 🖨️ Optional: Print full list (for verification)
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    // 🚀 Main function
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5}; // input array
        ListNode head = createLinkedList(values);

        System.out.print("Original list: ");
        printList(head);

        ListNode middle = middleNode(head);
        System.out.println("Middle node value: " + middle.val);
    }
}
