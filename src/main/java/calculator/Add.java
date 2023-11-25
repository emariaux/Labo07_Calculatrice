package calculator;

import util.Iterateur;
import util.*;

public class Add extends Operator{
    public Add(State state) {
        super(state);
    }

    @Override
    void execute() {
        double value;
        if(state.stack.getHead() != null && !state.getCurrentValue().isEmpty()){
            value = state.getCurrentValueDouble() + state.stack.getHead().getValue();
            state.setResult(value);
        } else if (state.stack.getHead() != null) {
            state.setCurrentValue(Double.toString(state.stack.getHead().getValue()));
            state.stack.removeFirst();
            if(state.stack.getHead() != null){
                value = state.getCurrentValueDouble() + state.stack.getHead().getValue();
                state.setResult(value);
            }else{
                state.setResult(state.getCurrentValueDouble());
                //TODO ERREUR Uniquement 1 valeur de la stack

            }
        }
    }
}
