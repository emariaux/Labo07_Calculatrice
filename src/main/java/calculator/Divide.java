package calculator;

public class Divide extends Operator{
    public Divide(State state) {
        super(state);
    }

    @Override
    void execute() {

        if(state.cantCalculate()){
            state.setError();
            return;
        }

        double value;

        if(!state.getCurrentValue().isEmpty() && state.getCurrentValueDouble() != 0){
            value = state.stack.getHead().getValue() / state.getCurrentValueDouble();
            state.setResult(value);
        }else {
            state.setCurrentValue(Double.toString(state.stack.getHead().getValue()));
            state.stack.removeFirst();
            if(!state.headNull() && state.stack.getHead().getValue() != 0){
                value = state.stack.getHead().getValue() / state.getCurrentValueDouble();
                state.setResult(value);
            }else{
                state.addValueStack();
                state.setError();
            }
        }
    }
}
