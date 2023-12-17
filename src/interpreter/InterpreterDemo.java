package interpreter;

public class InterpreterDemo {

    static Expression buildInterpreterTree(){
        Expression terminal1 = new TerminalExpression("Lions");
        Expression terminal2 = new TerminalExpression("Tigers");
        Expression terminal3 = new TerminalExpression("Bears");

        // Tigers and bears
        Expression alternation1 = new AndExpression(terminal2, terminal2);

        // Lions or (tigers and bears)
        Expression alternation2 = new OrExpression(terminal1, alternation1);

        return new AndExpression(alternation2, terminal1);
    }

    public static void main(String[] args) {
//        String context = "Lions";
//        String context = "Bears";
        String context = "Lions or Bears";
//        String context = "Tiger or Bears";
//        String context = "Tiger or Lions";
//        String context = "Tigers";

        Expression define = buildInterpreterTree();

        System.out.println(context + " is " + define.interpret(context));
    }

}
