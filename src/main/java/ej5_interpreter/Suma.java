package ej5_interpreter;

public class Suma extends AbstractExpression {
    @Override
    public void interpreter(Context context) {
        context.operacion = true;
    }
}
