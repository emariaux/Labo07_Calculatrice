package calculator;

public class Enter extends Operator{
    public Enter(State state) {
        super(state);
    }

    @Override
    void execute() {
        state.addValueStack();
    }
}
