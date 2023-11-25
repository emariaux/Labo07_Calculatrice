package util;

import java.util.Iterator;

public class Iterateur<T> implements Iterator<T> {
    private Node<T> current;

    public Iterateur(Stack<T> stack)
    {
        this.current = stack.getHead();
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
    public T next() {
        if(hasNext()){
           current = current.getNextNode();
        }
        return current.getValue();
    }
}
