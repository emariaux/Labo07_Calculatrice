package calculator;

public class Dot extends Operator{
    public Dot(State state) {
        super(state);
        this.state.setDot(true);
    }

    @Override
    void execute() {

    }
}
