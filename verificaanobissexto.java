/*Verifique se um ano é bissexto. */
import java.util.Scanner;

public class verificaanobissexto {
   public static void main(String[] args) {
       int ano;
       Scanner resultado = new Scanner(System.in);
       System.out.println("Digite um ano: ");
       ano = resultado.nextInt();
       if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
        System.out.println("O ano " + ano + " é bissexto");
       }else{
        System.out.println("O ano " + ano + " não é bissexto");
       }
   } 
}
