

import calculator.State;
import org.junit.Test;
import util.Node;
import util.Stack;

import java.util.Optional;

import static org.junit.Assert.assertEquals;


public class StackTest {

    @Test
    public void insertTest(){
        Stack<Double> stack = new Stack<>();
        stack.addFirst(1.);
        Double doubleTest = 1.;
        assertEquals (doubleTest, stack.getHead().getValue());
        stack.addFirst(2.);
        doubleTest = 2.;
        assertEquals (doubleTest, stack.getHead().getValue());

    }

    @Test
    public void removeTest(){

        Stack<Double> stack = new Stack<>();
        Double doubleTest = 3.;

        stack.addFirst(1.);
        stack.addFirst(2.);
        stack.addFirst(3.);
        assertEquals (doubleTest, stack.getHead().getValue());
        stack.removeFirst();
        doubleTest = 2.;
        assertEquals (doubleTest, stack.getHead().getValue());


    }

    @Test
    public void toStringTest(){
        Stack<Double> stack = new Stack<>();

        stack.addFirst(1.);
        stack.addFirst(2.);
        stack.addFirst(3.);

        assertEquals ("3.0 2.0 1.0 ", stack.toString());
    }
}
