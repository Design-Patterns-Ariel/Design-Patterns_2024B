package JUNIT.Junit.Java;

public class nodes<E> {

    private Node<E> head;

    public nodes() {
        head = null;
    }
    public boolean add(E value) {
        if (head == null)
            head = new Node<>(value);

        Node<E> temp = head;
        while (temp.getNext() != null)
            temp = temp.getNext();

        temp.setNext(new Node<>(value));

        return true;
    }


    public Node<E> getHead() {
        return head;
    }

    public void setHead(Node<E> head) {
        this.head = head;
    }
}

class Node<E> {

    private E value;
    private Node<E> next;


    public Node(E value) {
        this.value = value;
    }

    public Node(E value, Node<E> next) {
        this.value = value;
        this.next = next;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}