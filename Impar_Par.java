/*Peça um número e diga se é par ou ímpar */
import java.util.Scanner;
public class Impar_Par {
    public static void main(String[] args) {
        int number;
        Scanner resultado = new Scanner(System.in);
        System.out.println("Digite um número");
        number = resultado.nextInt();
        if (number % 2 == 0) {
            System.out.println("O número " + number + " é Par");
        }else{
            System.out.println("O número " + number + " é Impar");
        }
    }
}
