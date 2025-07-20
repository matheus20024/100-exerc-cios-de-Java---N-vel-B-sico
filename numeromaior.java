/*Peça dois números e diga qual é maior */
import java.util.Scanner;
public class numeromaior {
    public static void main(String[] args) {
        int number1, number2;
        Scanner resultado = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        number1 = resultado.nextInt();
        System.out.println("Difite o segundo número: ");
        number2 = resultado.nextInt();
        if ( number1 > number2) {
            System.out.println("O número "+number1+" é maior.");
        }else{
            System.out.println("O número "+number2+" é maior.");
        }
    }
}