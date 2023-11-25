import calculator.JCalculator;
import util.*;
public class Main
{
  public static void main(String ... args) {
    new JCalculator();

    Stack<Double> stack = new Stack<>();

    stack.addFirst(5.0);
    stack.addFirst(6.0);
    stack.addFirst(7.0);
    stack.addFirst(8.0);
    stack.addLast(4.0);
    stack.removeFirst();


    System.out.println(stack);


    System.out.println("test");


  }
}
