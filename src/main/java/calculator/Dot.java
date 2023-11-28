package calculator;

public class Dot extends Operator{
    public Dot(State state) {
        super(state);
    }

    @Override
    void execute() {
        if(!state.getError()){
            state.addDot();
        }

    }
}
