package calculator;

public class Divide extends Operator{
    public Divide(State state) {
        super(state);
    }

    @Override
    void execute() {
        double value;

        if(state.stack.getHead() != null && !state.getCurrentValue().isEmpty() && state.getCurrentValueDouble() != 0){
            value = state.stack.getHead().getValue() / state.getCurrentValueDouble();
            state.setResult(value);
        }else if (state.stack.getHead() != null) {
            state.setCurrentValue(Double.toString(state.stack.getHead().getValue()));
            state.stack.removeFirst();
            if(state.stack.getHead() != null && state.stack.getHead().getValue() != 0){
                value = state.stack.getHead().getValue() / state.getCurrentValueDouble();
                state.setResult(value);
            }else{
                state.setResult(state.getCurrentValueDouble());
                //TODO ERREUR Uniquement 1 valeur de la stack
                // TODO ERREUR DIVISION PAR 0

            }
        }
    }
}
