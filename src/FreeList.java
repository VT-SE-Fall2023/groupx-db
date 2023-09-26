class Node<E> {
    E val;

    public Node(E val) {
        this.val = val;
    }

    Node<E> next;
}

public class FreeList<E> {
    Node<E> head;
    Node<E> tail;

    int length;

    public Node<E> getHead() {
        return head;
    }


    public FreeList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public FreeList(E headVal) {
        this.head = new Node<>(headVal);
        this.tail = this.head;
        this.length = 1;
    }

    //get Nth Node in free list, return the value of node
    public Node getNthNode(int nth) {
        int i = 0;
        Node<E> cur = head;
        while (i < nth) {
            cur = cur.next;
            i++;
        }
        return cur;
    }

    //append a node to the end of free list
    public void append(E val) {
        this.length++;
        if (tail == null) {
            head = new Node<>(val);
            tail = head;
            return;
        }
        tail.next = new Node<>(val);
        tail = tail.next;
    }

    public int total() {
        return this.length;
    }
}
