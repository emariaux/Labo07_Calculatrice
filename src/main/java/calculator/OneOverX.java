package calculator;

public class OneOverX extends Operator{
    public OneOverX(State state) {
        super(state);
    }

    @Override
    void execute() {
        state.setCurrentValue(Double.toString(1. / state.getCurrentValueDouble()));
    }
}
