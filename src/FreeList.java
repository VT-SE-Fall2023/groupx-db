public class FreeList {
    Node head;

    public Node getHead() {
        return head;
    }

    class Node {
        int val;

        public Node(int val) {
            this.val = val;
        }
    }

    public FreeList(int headVal) {
        this.head = new Node(headVal);
    }

    //get Nth Node in free list, return the position of node
    public long getNthNode(int nth) {
        return head.val;
    }

}
