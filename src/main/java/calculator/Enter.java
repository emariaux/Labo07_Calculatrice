package calculator;

public class Enter extends Operator{
    public Enter(State state) {
        super(state);
    }

    @Override
    void execute() {
        if(!state.getError()){
            state.addValueStack();
        }

    }
}
