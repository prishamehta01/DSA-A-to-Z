class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeSortedList {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while(list1!=null && list2!=null){
            if(list1.val <= list2.val){
                cur.next=list1;
                list1 = list1.next;
            }
            else{
                cur.next=list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }

        if(list1!=null){
            cur.next=list1;
        }
        if(list2!=null){
            cur.next=list2;
        }

        return dummy.next;
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

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + (head.next != null ? " -> " : ""));
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Input: head = [1,2,3,4,5]
        int[] values1 = {1, 2, 4};
        ListNode l1 = buildList(values1);
        System.out.print("List 1: ");
        printList(l1);

        int[] values2 = {1,3,4};
        ListNode l2 = buildList(values2);
        System.out.print("List 2: ");
        printList(l1);
        
        ListNode res = mergeTwoLists(l1,l2);
        System.out.print("Merged List : ");
        printList(res);
    }
}

