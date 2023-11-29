

import org.junit.Test;
import util.Stack;

import static org.junit.Assert.assertEquals;


public class StackTest {

    @Test
    public void insertTest(){
        Stack<Double> stack = new Stack<>();
        stack.add(1.);
        Double doubleTest = 1.;
        assertEquals (doubleTest, stack.getHead().getValue());
        stack.add(2.);
        doubleTest = 2.;
        assertEquals (doubleTest, stack.getHead().getValue());

    }

    @Test
    public void removeTest(){

        Stack<Double> stack = new Stack<>();
        Double doubleTest = 3.;

        stack.add(1.);
        stack.add(2.);
        stack.add(3.);
        assertEquals (doubleTest, stack.getHead().getValue());
        stack.removeFirst();
        doubleTest = 2.;
        assertEquals (doubleTest, stack.getHead().getValue());


    }

    @Test
    public void toStringTest(){
        Stack<Double> stack = new Stack<>();

        stack.add(1.);
        stack.add(2.);
        stack.add(3.);

        assertEquals ("3.0 2.0 1.0 ", stack.toString());
    }

    @Test
    public void toArrayTest(){

        Stack<Double> stack = new Stack<>();

        stack.add(1.);
        stack.add(2.);
        stack.add(3.);

        Object[] result =  stack.toArray();

        assertEquals ((Double)3., (Double)result[0]);
        assertEquals ((Double)2.0, (Double)result[1]);
        assertEquals ((Double)1.0, (Double)result[2]);
    }
}
