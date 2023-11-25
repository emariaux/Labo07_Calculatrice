package calculator;

public class Digit extends Operator{
    private int value;
    public Digit(State state, int i) {
        super(state);
        this.value = i;
    }

    @Override
    void execute() {

    }
}
