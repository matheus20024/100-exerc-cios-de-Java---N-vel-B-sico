/*6. Peça dois números e mostre a divisão.  */

import java.util.Scanner;

public class dividindo {
        public static void main(String[] args) {
        int number1,  number2, divisao;
        Scanner operacao = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        number1 = operacao.nextInt();
        System.out.println("Digite o segundo numero: ");
        number2 = operacao.nextInt();
        divisao = number1 / number2;
        System.out.println("A soma de primeiro número e segundo número: " + divisao);
    }
}
