package ej5_interpreter;

public class Client {

    public static void main (String[]args){
        String msg = "6 * 3 * 2 + 1 + 5";

        Evaluador evaluador = new Evaluador(msg);
        int result= evaluador.evaluate();

        System.out.println("Resultado de "+msg+" = "+result);
    }
}
