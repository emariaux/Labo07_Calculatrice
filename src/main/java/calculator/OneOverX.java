package calculator;

public class OneOverX extends Operator{
    public OneOverX(State state) {
        super(state);
    }

    @Override
    void execute() {
        if(state.getError()){
            return;
        }

        if(state.getCurrentValue().isEmpty() || state.getCurrentValueDouble() != 0.) {
            state.setCurrentValue(Double.toString(1. / state.getCurrentValueDouble()));
        }
    }
}
