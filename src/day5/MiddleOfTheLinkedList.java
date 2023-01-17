package day5;

public class MiddleOfTheLinkedList {
    public static void main(String[] args) {
        int[] head = {1, 2, 3, 4, 5};

    }

    public ListNode middleNode(ListNode head) {
        int count = 0, midCount = 0;
        ListNode mid = head;
        while (mid != null) {
            mid = mid.next;
            count++;
        }
        mid = head;
        while (midCount < count / 2) {
            mid = mid.next;
            midCount++;
        }
        return mid;
    }

    //ListNode massive
    public ListNode middleNodeMassive(ListNode head) {
        ListNode[] listNodes = new ListNode[100];
        int index = 0;

        while (head != null){
            listNodes[index] = head;
            index++;
            head = head.next;
        }
        return listNodes[index/2];
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
