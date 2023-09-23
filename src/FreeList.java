class Node {
    int val;

    public Node(int val) {
        this.val = val;
    }

    Node next;
}

public class FreeList {
    Node head;
    Node tail;

    int length;

    public Node getHead() {
        return head;
    }


    public FreeList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public FreeList(int headVal) {
        this.head = new Node(headVal);
        this.tail = this.head;
        this.length = 1;
    }

    //get Nth Node in free list, return the value of node
    public long getNthNode(int nth) {
        int i = 0;
        Node cur = head;
        while (i < nth) {
            cur = cur.next;
            i++;
        }
        return cur.val;
    }

    //append a node to the end of free list
    public void append(int val) {
        this.length++;
        if (tail == null) {
            head = new Node(val);
            tail = head;
            return;
        }
        tail.next = new Node(val);
        tail = tail.next;
    }

    public int total() {
        return this.length;
    }
}
