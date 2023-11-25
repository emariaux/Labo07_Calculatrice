package calculator;

public class ClearError extends Operator{
        public ClearError(State state) {
            super(state);
        }

        @Override
        void execute() {
            new Clear(state);
            state.resetError();
        }
}
