package calculator;

import static java.lang.Math.sqrt;

public class Sqareroot extends Operator{
    public Sqareroot(State state) {
        super(state);
    }

    @Override
    void execute() {
        double value;
        if(state.getCurrentValue().isEmpty()){
            if(state.stack.getHead().getValue() >= 0){
                value = sqrt(state.stack.getHead().getValue());
                state.setResult(value);
            }else{
                // TODO ERREUR
            }
        }else{
            if(state.getCurrentValueDouble() >= 0){
                value = sqrt(state.getCurrentValueDouble());
                state.setCurrentValue(Double.toString(value));
                new Enter(state);
            }else{
                // TODO ERREUR
            }
        }
    }
}
