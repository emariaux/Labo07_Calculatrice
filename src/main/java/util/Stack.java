package util;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Stack<T> implements Iterable<T> {

    private Node<T> head;
    private int size = 0;

    public Stack(){ }

    public void addFirst(T o){
        Node<T> node = new Node<T>(o);
        node.setNextNode(head);
        head = node;
        ++size;
    }

    //Pas demandé dans la consigne voir si on garde
    public void addLast(T o){
        Node<T> node = new Node<T>(o);
        if (head == null) {
            head = node;
        }else{
            Node<T> current = head;
            while (current.getNextNode() != null){
                current = current.getNextNode();
            }
            current.setNextNode(node);
        }
    }

    public void removeFirst(){
        head = head.getNextNode();
    }

    public Node<T> getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {

        StringBuilder output = new StringBuilder();
        Node<T> current = head;

        while (current != null) {
            output.append(current.getValue()).append("\n");
            current = current.getNextNode();
        }


        return output.toString();
    }

    public Node<T>[] getTabStack(){
        Node<T>[] tabNode = new Node[10];
        Node<T> node = head;
        int i = 0;
        while(node != null){
            tabNode[i] = node;
            node = node.getNextNode();
            ++i;
        }

        return tabNode;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterateur<>(this);
    }

}
