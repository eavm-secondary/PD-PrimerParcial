package ej5_interpreter;

import templates.interpreter.TerminalExpressionB;
import templates.interpreter.TerminalExpressionC;
import templates.interpreter.TerminalExpressionD;

import java.util.ArrayList;
import java.util.List;

public class Evaluador extends AbstractExpression {

    private List<AbstractExpression> grammar = new ArrayList<>();
    private Context context;

    public Evaluador(String input){
        context = new Context(input.replace(" ",""));
        for (String word :input.split(" ")){
            switch (word){
                case "*":
                    grammar.add(new Multiplicacion());
                    break;
                case "+":
                    grammar.add(new Suma());
                    break;
                default:
                    grammar.add(new Number(word));
                    break;
            }

        }
    }

    public int evaluate(){
        for (AbstractExpression expression:grammar){
            expression.interpreter(context);
        }
        return context.output;
    }

    @Override
    public void interpreter(Context context) {

    }
}
