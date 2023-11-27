package calculator;

public class MemoryRecall extends Operator {

    public MemoryRecall(State state) {
        super(state);
    }

    @Override
    void execute() {
        if(!state.getStoredValue().isNaN()){
            state.addValueStack();
            state.setCurrentValue(state.getStoredValue().toString());
            state.setStoredValue(Double.NaN);
        }else{
            //TODO ERREUR pas de valeur stockée
        }
    }
}
