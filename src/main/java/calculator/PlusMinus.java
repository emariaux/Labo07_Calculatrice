package calculator;

public class PlusMinus extends Operator{
    public PlusMinus(State state) {
        super(state);
    }

    @Override
    void execute() {

        if(state.getError()){
            return;
        }

        if(!state.getCurrentValue().isEmpty()) {
            state.setCurrentValue(Double.toString(state.getCurrentValueDouble() * (-1.)));
        }
    }
}
