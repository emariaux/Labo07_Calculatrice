package util;

import java.util.ArrayList;

public class Stack {

    private Node head;

    public Stack(Node head){
        this.head = head;
    }

    public void addNode(Node node){
        Node temp = head;
        head = new Node(temp);
    }

    public void removeNode(){
        head = head.getNextNode();
    }

    @Override
    public String toString() {

        String output ="";
        Node node = head;
        do{
            node.toString();
            node = node.getNextNode();
        }while(node != null);

        return output;
    }

    public Node[] getTabStack(){
        Node[] tabNode = new Node[10];
        Node node = head;
        int i = 0;
        do{
            tabNode[i] = node;
            node = node.getNextNode();
            ++i;
        }while(node != null);

        return tabNode;
    }
}
