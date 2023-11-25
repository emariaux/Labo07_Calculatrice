package calculator;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Sqare extends Operator{

    public Sqare(State state) {
        super(state);
    }

    @Override
    void execute() {
        double value;
        if(state.getCurrentValue().isEmpty()){
            value = pow(state.stack.getHead().getValue(), 2);
            state.setResult(value);

        }else{

            value = pow(state.getCurrentValueDouble(),2);
            state.setCurrentValue(Double.toString(value));
            new Enter(state);
            //TODO ne se rajoute pas automatiquement au stack

        }
    }
}
