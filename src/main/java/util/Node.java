package util;

public class Node<T> {
    private Node<T> nextNode;
    private T value;



    /**
     * Constructeur d'un Node
     * @param value     : Valeur du node
     * @param nextNode  : node qui suit le node
     */
    public Node(T value, Node<T> nextNode) {
        this.nextNode = nextNode;
        this.value = value;
    }

    /**
     * Constructeur d'un Node sans prochain Node
     * @param value
     */
    public Node(T value){
        this(value,null);
    }

    /**
     * Set le next Node du current Node
     * @param nextNode : le prochain Node
     */
    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    /**
     * Setter de la value
     * @param value : nouvelle value
     */
    public void setValue(T value) {
        this.value = value;
    }


    /**
     * Getter value
     * @return : value
     */
    public T getValue() {
        return value;
    }

    /**
     * Getter nextNode
     * @return : nextNode
     */
    public Node<T> getNextNode() {
        return nextNode;
    }

    /**
     * retourne la valeur du Node en String.
     * @return : valeur du Node en String
     */
    @Override
    public String toString() {
        //String.valueOf(value);
        return value.toString();
    }
}
