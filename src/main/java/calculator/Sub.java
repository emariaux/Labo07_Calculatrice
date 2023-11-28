package calculator;

public class Sub extends Operator{
    public Sub(State state) {
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
            value = state.stack.getHead().getValue() - state.getCurrentValueDouble();
            state.setResult(value);
        }else{
            state.setCurrentValue(Double.toString(state.stack.getHead().getValue()));
            state.stack.removeFirst();
            if(state.stack.getHead() != null){
                value = state.stack.getHead().getValue() - state.getCurrentValueDouble();
                state.setResult(value);
            }else{
                state.addValueStack();

                state.setError();

            }
        }
    }
}
