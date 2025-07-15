
import java.util.Scanner;

/*3. Peça dois números e mostre a soma.*/ 
public class somando{
    public static void main(String[] args) {
        int number1,  number2, soma;
        Scanner operacao = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        number1 = operacao.nextInt();
        System.out.println("Digite o segundo numero: ");
        number2 = operacao.nextInt();
        soma = number1 + number2;
        System.out.println("A soma de primeiro número e segundo número: " + soma);
    }
}