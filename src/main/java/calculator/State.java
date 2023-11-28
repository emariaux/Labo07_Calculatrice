package calculator;

import util.Stack;

public class State {
    Stack<Double> stack = new Stack<>();

    private final String ERROR = "ERROR";
    // valeur actuelle
    private String currentValue = "";
    private Double storedValue = Double.NaN;

    private boolean error = false;

    /***
     * Ajoute les digits dans la partie fractionnaire ou entière
     * @param i     : digit à ajouter.
     */
    void addDigit(int i){
        currentValue += String.valueOf(i);
    }

    /***
     * Rajoute le point à la valeur s'il n'est pas déjà dedans
     */
    void addDot(){
        if(!currentValue.contains(".")){
            currentValue += ".";
        }
    }

    /***
     * Rajout value à la stack et réinitialise value.
     */
    void addValueStack(){
        if(!currentValue.isEmpty()){
            stack.addFirst(Double.valueOf(currentValue));
            resetCurrentValue();
        }else{
            //TODO ERREUR
        }

    }

    /***
     *
     * @return currentValue en String
     */
    String getCurrentValue() {
        return currentValue;
    }

    /***
     *
     * @return currentValue en double
     */
    Double getCurrentValueDouble() {
        return Double.valueOf(currentValue);
    }

    /***
     * Reset de currentValue
     */
    void resetCurrentValue(){
        currentValue = "";
    }

    /***
     * Set le résultat après une opération
     * @param value : résultat de l'opération
     */
    void setResult(Double value){
        this.stack.removeFirst();
        this.stack.addFirst(value);
        this.resetCurrentValue();
    }

    /***
     * Setter current value
     * @param currentValue
     */
    void setCurrentValue(String currentValue) {
        this.currentValue = currentValue;
    }

    /***
     * reset la stack en recréant une nouvelle vide
     */
    void resetStack(){
        this.stack = new Stack<>();
    }


    void resetError(){
        if(this.currentValue.equals(ERROR)){
            this.resetCurrentValue();
        }

        this.error = false;
    }

    /***
     * Getter Stored Valze
     * @return : stored Value
     */
    Double getStoredValue() {
        return storedValue;
    }

    /***
     * Setter stored Value
     * @param storedValue : new stored value
     */
    void setStoredValue(Double storedValue) {
        this.storedValue = storedValue;
    }

    /**
     * Set error 1
     */
    void setError() {
        this.currentValue="ERROR";
        this.error = true;
    }

    /**
     * Retourne s'il y a une erreur
     * @return
     */
    boolean cantCalculate(){
        return error || (headNull());
    }

    boolean getError(){
        return error;
    }

    boolean headNull(){
        return stack.getHead() == null;
    }

    Stack<Double> getStack() {
        return stack;
    }
}
