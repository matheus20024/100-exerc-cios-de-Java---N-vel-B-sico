/*Peça três números e mostre o maior. */

import java.util.Scanner;

public class tresnumeros {
    public static void main(String[] args) {
        int number1, number2, number3;
        Scanner resultado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        number1 = resultado.nextInt();
        System.out.println("Digite outro número: ");
        number2 = resultado.nextInt();
        System.out.println("Digite mais outro número: ");
        number3 = resultado.nextInt();
        if (number1 >= number2 && number1 >= number3){
            System.out.println("O número "+number1+" é maior");
        }else if (number2 >= number1 && number2 >= number3){
            System.out.println("O número "+number2+" é maior");
        }else{
            System.out.println("O número "+number3+" é maior");
        }
    }
}
