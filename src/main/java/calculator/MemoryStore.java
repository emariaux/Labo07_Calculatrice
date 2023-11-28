package calculator;

public class MemoryStore extends Operator{
    public MemoryStore(State state) {
        super(state);
    }

    @Override
    void execute() {

        if(state.getError()){
            return;
        }

        //Si pas de valeur aucune action est effectuée
        if(!state.getCurrentValue().isEmpty()){
            state.setStoredValue(state.getCurrentValueDouble());
            state.setCurrentValue("");
        }
    }
}
