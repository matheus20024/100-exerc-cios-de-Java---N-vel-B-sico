/* Peça um número e diga se é positivo ou negativo.  */
import java.util.Scanner;
public class positivo_negativo {
    public static void main(String[] args) {
        int positvo, negativo, number;
        Scanner resultado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        number = resultado.nextInt();
        if (number > 0){
            System.out.println("O número " + number +" é postivo");
        }else{
            System.out.println("O número " + number +" é negativo");
        }
    }
}
