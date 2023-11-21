package util;

import java.util.Iterator;

public class Iterateur implements Iterator<Node> {
    private Node current;

    public Iterateur(Node current) {
        this.current = current;
    }

    @Override
    public boolean hasNext() {
        if(current.getNextNode() == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Node next() {
        return current.getNextNode();
    }
}
