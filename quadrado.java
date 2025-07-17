/*Peça um número e mostre o quadrado*/
import java.util.Scanner;
public class quadrado{
    public static void main(String[] args){
        double number, quadrado;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        number = scanner.nextDouble();
        quadrado = number * number;
        System.out.println("O quadrado do número é: " + quadrado);
    }
}