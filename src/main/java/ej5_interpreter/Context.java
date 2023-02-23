package ej5_interpreter;

public class Context {
    protected String input="";
    protected int output=0;
    protected boolean operacion = true;
    // suma = true, multiplicacion = false

    public Context (String input) {
        this.input = input;
    }

}
