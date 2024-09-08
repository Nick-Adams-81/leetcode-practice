package LinkedList;

public class RevLL {


    public Node head;
    public Node tail;
    public int length;

    public class Node {
        int val;
        Node next;
        Node(int x) { val = x; }
        Node(int val, Node next) { this.val = val; this.next = next; }
    }

    public RevLL(int val) {
        Node newNode = new Node(val);
            head = newNode;
            tail = newNode;
            length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val + " ");
            temp = temp.next;
        }
    }

    public void printHead() {
        System.out.println("Head: " + head.val + " ");
    }

    public void printTail(){
        System.out.println("Tail: " + tail.val + " ");
    }

    public void printLength() {
        System.out.println("Length: " + length);
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
            length++;
        }
    }

    public Node get(int index) {
        if(index == 0) return head;
        Node temp = head;
        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void removeLast() {
        Node temp = head;
        Node prev = head;
        while(temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        tail = prev;
        tail.next = null;
        length--;
        if(length == 0) {
            head = null;
            tail = null;
        }
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after;
        Node before = null;
        for(int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }
}
