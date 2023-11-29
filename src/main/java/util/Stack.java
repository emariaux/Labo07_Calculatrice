package util;

import java.util.Iterator;

public class Stack<T> implements Iterable<T> {

    private Node<T> head;
    private int size = 0;

    /***
     * Constructeur par défaut de la stack
     */
    public Stack(){ }

    /**
     * Rajoute un élément au sommet de la stack
     * @param o : objet à rajouter
     */
    public void add(T o){
        Node<T> node = new Node<T>(o);
        node.setNextNode(head);
        head = node;
        ++size;
    }

    /**
     * Supprime l'élément au sommet de la stack.
     */
    public void removeFirst(){
        head = head.getNextNode();
        --size;
    }

    /**
     * Retourne le sommet de la stack
     * @return : head de la stack
     */
    public Node<T> getHead() {
        return head;
    }

    /**
     * Getter de la size
     * @return : la taille de la stack
     */
    public int getSize() {
        return size;
    }

    /**
     * retourne un String contenant les valeurs de tous les éléments de la stack
     * @return : String avec les éléments de la stack
     */
    @Override
    public String toString() {

        StringBuilder output = new StringBuilder();
        Node<T> current = head;

        //On boucle jusqu'à avoir une Node null
        while (current != null) {
            // écris toutes les valeurs sur la même ligne
            output.append(current.getValue()).append(" ");
            current = current.getNextNode();
        }

        return output.toString();
    }

    /**
     * Tableau contenant les valeurs des différents Nodes
     * @return : tableau d'object avec les valeurs des nodes
     */
    public Object[] toArray(){
        //Création du tableau selon la taille de la stack.
        Object[] tabNode =  new Object[this.size];
        Node<T> node = head;
        //index de la boucle
        int i = 0;
        //On boucle jusqu'à avoir une Node null
        while(node != null){
            tabNode[i] = node.getValue();
            node = node.getNextNode();
            ++i;
        }

        return tabNode;
    }

    /**
     * Iterateur sur la stack
     * @return : iterateur sur la stack
     */
    @Override
    public Iterator<T> iterator() {
        return new Iterateur<>(this);
    }

}
