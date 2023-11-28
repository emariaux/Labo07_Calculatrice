package calculator;

public class Add extends Operator{
    public Add(State state) {
        super(state);
    }

    @Override
    void execute() {

        if(state.cantCalculate()){
            state.setError();
            return;
        }

        double value;
        if(!state.getCurrentValue().isEmpty()){
            value = state.getCurrentValueDouble() + state.stack.getHead().getValue();
            state.setResult(value);
        }
        else {
            state.setCurrentValue(Double.toString(state.stack.getHead().getValue()));
            state.stack.removeFirst();

            if(!state.headNull()){
                value = state.getCurrentValueDouble() + state.stack.getHead().getValue();
                state.setResult(value);
            }else{
                state.addValueStack();
                state.setError();
            }
        }




    }
}
