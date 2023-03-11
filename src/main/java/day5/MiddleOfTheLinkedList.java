package day5;

public class MiddleOfTheLinkedList {
    public NodeList middleNode(NodeList head) {
        int count = 0, midCount = 0;
        NodeList mid = head;
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
    private NodeList middleNodeMassive(NodeList head) {
        NodeList[] listNodes = new NodeList[100];
        int index = 0;

        while (head != null) {
            listNodes[index] = head;
            index++;
            head = head.next;
        }
        return listNodes[index / 2];
    }
}


class NodeList {
    int val;
    NodeList next;

    NodeList() {
    }

    NodeList(int val) {
        this.val = val;
    }

    NodeList(int val, NodeList next) {
        this.val = val;
        this.next = next;
    }
}
