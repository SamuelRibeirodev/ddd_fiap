package aula08;

public class Main {

    public static void main(String[] args) {

        CalculadoraSimples calculadora = new CalculadoraSimples();
        int op = calculadora.menu();
        float n1 = calculadora.entradaDados();
        float n2 = calculadora.entradaDados();
        float result = calculadora.controlador(op, n1, n2);
        calculadora.imprimir(result);
    }
}
