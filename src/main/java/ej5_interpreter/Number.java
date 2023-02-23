package ej5_interpreter;

public class Number extends AbstractExpression {
    String  number;
    public Number(String number) {
        super();
        this.number = number;
    }

    @Override
    public void interpreter(Context context) {
        context.input = context.input.substring(number.length());
        if (context.operacion){
            context.output+=Integer.parseInt(number);
        } else {
            context.output*=Integer.parseInt(number);
        }
    }
}
