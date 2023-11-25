package calculator;

import util.Stack;

public class State {
    Stack<Double> stack = new Stack<>();


    // valeur actuelle
    private String currentValue = "";




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
     * reset la stack en créant une nouvelle vide
     */
    void resetStack(){
        this.stack = new Stack<>();
    }

    /***
     * TODO ERREUR
     */
    void resetError(){

    }

}
