package calculator;

import java.util.HashMap;
import java.util.Scanner;

public class Calculator {
    private State state = new State();
    HashMap<String, Operator> operator = new HashMap<String, Operator>();


    Calculator() {
        operator.put("+", new Add(state));
        operator.put("-", new Sub(state));
        operator.put("*", new Multiply(state));
        operator.put("/", new Divide(state));
        operator.put("sqrt", new Sqareroot(state));
        operator.put("pow", new Sqare(state));
        operator.put("CE", new ClearError(state));
        operator.put("C", new Clear(state));
    }



    private boolean isNumeric(String str)
    {
        return str.matches("-?\\d+(.\\d+)?");
    }

    private void display(){
        if(state.getError()){
            // Displays error
            System.out.println(state.getCurrentValue());
        } else if (!state.getCurrentValue().isEmpty()) {
            System.out.println(state.getCurrentValueDouble() + " " + state.getStack());
        } else {
            System.out.println(state.getStack());
        }
    }

    private void performOp(String input){
        if (operator.containsKey(input)) {
            operator.get(input).execute();
        } else if (isNumeric(input)) {
            if (!state.getCurrentValue().isEmpty()) {
                state.addValueStack();
                state.setCurrentValue(input);
            } else {
                state.setCurrentValue(input);
            }
        }
    }

    void execute(){
        String input;
        Scanner console = new Scanner(System.in);

        while((input = console.nextLine()) != null && !input.equals("exit")) {
            if(input.equals("CE") || input.equals("C")){
                operator.get(input).execute();
            }

            if(state.getError()){
                continue;
            }

            performOp(input);
            display();
        }
    }

    public static void main(String ... args) {
        Calculator calculator = new Calculator();
        calculator.execute();
    }
}
