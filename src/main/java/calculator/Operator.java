package calculator;

abstract class Operator
{
  State state;
  public Operator(State state){
    this.state = state;
  }
  abstract void execute();
}
