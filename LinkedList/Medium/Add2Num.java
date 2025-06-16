class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Add2Num {

    // ✅ Function to add two numbers represented by linked lists
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            int value = val1 + val2 + carry;
            int digit = value % 10;
            carry = value / 10;

            cur.next = new ListNode(digit);
            cur = cur.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next;
    }

    // 🔧 Helper method to create a linked list from an array
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

    // 🖨️ Print the linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    // 🚀 Main method
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 3}; // represents 342
        int[] arr2 = {5, 6, 4}; // represents 465

        ListNode l1 = createLinkedList(arr1);
        ListNode l2 = createLinkedList(arr2);

        ListNode result = addTwoNumbers(l1, l2); // should be 807 → [7, 0, 8]

        System.out.print("Result: ");
        printList(result); // Output: 7 -> 0 -> 8
    }
}
