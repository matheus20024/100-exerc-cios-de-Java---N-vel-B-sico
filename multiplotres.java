/*Verifique se um número é múltiplo de 3. */

import java.util.Scanner;

public class multiplotres {
    public static void main(String[] args) {
        int number;
        Scanner resultado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        number = resultado.nextInt();
        if (number % 3 == 0){
            System.out.println("O número " + number +" é múltiplo de três");
        }else{
            System.out.println("O número " + number +" não é múltiplo de três");
        }
    }
    
}
