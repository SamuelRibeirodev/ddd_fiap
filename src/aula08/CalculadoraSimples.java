package aula08;

import java.util.Scanner;

/**
 * 1. (x) menu(): int
 * 2. (x) entradaDados(): float
 * 3. (x) somar(n1: float, n2: float): float
 * 4. (x) subtrair(n1: float, n2: float): float
 * 5. (x) multiplicar(n1: float, n2: float): float
 * 6. (x) dividir(n1: float, n2: float): float
 * 7. (x) controlador(int op, float n1, float n2): float
 * 8. (x) imprimir(float result): void
 */


public class CalculadoraSimples {

    public int menu() {
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("===================================");
            System.out.println("   --- CALCULADORA SIMPLES ---   ");
            System.out.println("===================================");
            System.out.println("1. Adição");
            System.out.println("2. Subração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("Opção: ");
            opcao = input.nextInt();

            if(opcao < 1 || opcao > 4) {
                System.out.println("Operação INVÁLIDA! - Opções: 1 - 4");
            }

        } while (opcao < 1 || opcao > 4);

        return opcao;
    }

    public float entradaDados() {
        Scanner input = new Scanner(System.in);

        System.out.println(" --- ENTRADA DE DADOS --- ");
        System.out.println("Número: ");
        float numero = input.nextFloat();
        return numero;
    }

    public float somar(float num1, float num2) {
        System.out.println(" --- SOMAR --- ");
        return num1 + num2;
    }

    public float subtrair(float num1,float num2) {
        System.out.println(" --- SUBTRAÇÂO --- ");
        return num1 - num2;
    }

    public float multiplicacao(float num1, float num2 ) {
        System.out.println(" --- MULTIPLICAÇÃO --- ");
        return num1 * num2;
    }

    public float divisao(float num1, float num2) {
        System.out.println(" --- DIVISÃO --- ");
        return num1 / num2;
    }

    public void imprimir(float result) {
        System.out.println(" --- IMPRIMIR --- ");
        System.out.println("Resultado: " + result);
    }

    public float controlador(int opcao, float num1, float num2) {
        System.out.println(" --- CONTROLADOR --- ");

        float resultado = 0;
        switch (opcao) {
            case 1:
                resultado = somar(num1, num2);
                break;
            case 2:
                resultado = subtrair(num1, num2);
                break;
            case 3:
                resultado = multiplicacao(num1, num2);
                break;
            case 4:
                resultado = divisao(num1, num2);
            default:
                break;
        }
        return resultado;
    }
}
