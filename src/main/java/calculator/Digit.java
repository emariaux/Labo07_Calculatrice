package calculator;

public class Digit extends Operator{
    private int digit;
    public Digit(State state, int i) {
        super(state);
        this.digit = i;
    }

    @Override
    void execute() {
        if(!state.getError()){
            state.addDigit(digit);
        }

    }
}
