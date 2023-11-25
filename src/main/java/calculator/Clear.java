package calculator;

public class Clear extends Operator{
    public Clear(State state) {
        super(state);
    }

    @Override
    void execute() {
        state.resetCurrentValue();
        state.resetStack();
    }
}
