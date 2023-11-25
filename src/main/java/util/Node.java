package util;

public class Node<T> {
    private Node<T> nextNode;
    private T value;

    public Node(T value, Node<T> nextNode) {
        this.nextNode = nextNode;
        this.value = value;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node(T value){
        this(value,null);
    }

    public T getValue() {
        return value;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    @Override
    public String toString() {
        //String.valueOf(value);
        return value.toString();
    }
}
