package ej5_interpreter;

public class Multiplicacion extends AbstractExpression {
    @Override
    public void interpreter(Context context) {
        context.operacion = false;
    }
}
