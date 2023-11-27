package calculator;

public class MemoryStore extends Operator{
    public MemoryStore(State state) {
        super(state);
    }

    @Override
    void execute() {
        if(!state.getCurrentValue().isEmpty()){
            state.setStoredValue(state.getCurrentValueDouble());
            state.setCurrentValue("");
        }else{
            //TODO Erreur pas de valeur à stocker
        }
    }
}
