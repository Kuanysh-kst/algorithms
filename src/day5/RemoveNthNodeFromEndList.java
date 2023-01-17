package day5;

public class RemoveNthNodeFromEndList {
    ListNode head;

    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        listNode.push(5, listNode);
        listNode.push(4, listNode);
        listNode.push(3, listNode);
        listNode.push(2, listNode);
        listNode.push(1, listNode);

        printList(listNode);

    }

    public static void printList(ListNode head) {
        ListNode tnode = head;
        while (tnode != null) {
            System.out.print(tnode.value + " ");
            tnode = tnode.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        if (head.next == null && n == 1) {
            return null;
        }

        ListNode current = head;
        ListNode next = null;
        ListNode prev = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        current = prev;
        prev = null;

        int count = 0;
        next = null;

        while (current != null) {
            if (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            count++;
        }
        return prev;
    }
    public ListNode removeNthFromEndTrue(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        // Advancing first pointer so that the gap between first and second is n nodes apart
        for (int i = 1; i <= n + 1; i++) {
            first = first.next;
        }
        // Move first to the end, maintaining the gap
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
}



class ListNode {
    int value;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.value = value;
    }

    ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void push(int data, ListNode head) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }
}