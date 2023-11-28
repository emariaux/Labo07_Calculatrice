package calculator;

public class Multiply extends Operator{
    public Multiply(State state) {
        super(state);
    }

    @Override
    void execute() {
        if(state.cantCalculate()){
            state.setError();
            return;
        }

        if(!state.getCurrentValue().isEmpty()){
            double value = state.getCurrentValueDouble() * state.stack.getHead().getValue();
            state.setResult(value);
        }
        else {
            state.setCurrentValue(Double.toString(state.stack.getHead().getValue()));
            state.stack.removeFirst();

            if(!state.headNull()){
                double value = state.getCurrentValueDouble() * state.stack.getHead().getValue();
                state.setResult(value);
            }else{
                state.addValueStack();
                state.setError();
            }
        }
    }
}
