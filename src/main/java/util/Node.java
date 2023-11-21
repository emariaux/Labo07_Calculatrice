package util;

public class Node {
    private Node nextNode;
    private double value;

    public Node(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node(){
        this(null);
    }

    public Node getNextNode() {
        return nextNode;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
