package calculator;

public class Backspace extends Operator {
    public Backspace(State state) {
        super(state);
    }

    @Override
    void execute() {
        if(!state.getCurrentValue().isEmpty()) {
            state.setCurrentValue(state.getCurrentValue().substring(0, state.getCurrentValue().length() - 1));
        }else{
            // TODO ERREUR
        }
    }
}
