package calculator;

import util.Stack;

import java.util.ArrayList;

public class State {
    Stack<Double> stack = new Stack<>();

    // Partie fractionnaire de la valeur
    private ArrayList<Integer> fractionnalPart = new ArrayList<>();
    //Partie entière de la valeur.
    private ArrayList<Integer> integerPart = new ArrayList<>();

    private double value;

    private boolean dot = false;

    /***
     * Set la valeur de dot
     * @param dot   : dot valeur
     */
    void setDot(boolean dot) {
        this.dot = dot;
    }

    /***
     * Ajoute les digits dans la partie fractionnaire ou entière
     * @param i     : digit à ajouter.
     */
    void addDigit(int i){
        if(dot){
            fractionnalPart.addLast(i);
        }else{
            integerPart.addFirst(i);
        }
    }

    /***
     * Crée la valeur selon la partie entière et fractionnaire
     */
    void value(){
        value = 0;

        if(integerPart != null){
            for(int i = 1; i <= integerPart.size() ; ++i){
                value = integerPart.get(i) * (1^i);
            }
        }

        if(fractionnalPart != null){
            for(int i = 1; i <= fractionnalPart.size() ; ++i){
                value = fractionnalPart.get(i) * (1^(-i));
            }
        }
    }

    /***
     * Rajout value à la stack
     */
    void addValueStack(){
        stack.addFirst(value);
    }
}
