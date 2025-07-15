
import java.util.Scanner;

/*Peça dois números e mostre a subtração. */
public class subtraindo {
    public static void main(String[] args) {
        int number1, number2, subtracao;
        Scanner operacao = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        number1 = operacao.nextInt();
        System.out.println("Digite o segundo número: ");
        number2 = operacao.nextInt();
        subtracao = number1 - number2;
        System.out.println("Digite a subtração primeiro número e segundo: " + subtracao);
    }
}