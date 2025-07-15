/*5 Peça dois números e mostre a multiplicação. */

import java.util.Scanner;
public class multiplicando{
    public static void main(String[] args) {
        int number1,  number2, multiplicacao;
        Scanner operacao = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        number1 = operacao.nextInt();
        System.out.println("Digite o segundo numero: ");
        number2 = operacao.nextInt();
        multiplicacao = number1 * number2;
        System.out.println("A soma de primeiro número e segundo número: " + multiplicacao);
    }
}