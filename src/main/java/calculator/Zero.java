package calculator;

public class Zero extends Operator{
    public Zero(State state) {
        super(state);
    }

    @Override
    void execute() {
        if (!state.getError()) {
            state.addDigit(0);
        }

    }
}
