/*Peça a idade e diga se é maior de idade. */

import java.util.Scanner;
public class idade_maior_menor {
    public static void main(String[] args) {
        int idade;
        Scanner resultado = new Scanner(System.in);
        System.out.println("Digite sua Idade: ");
        idade = resultado.nextInt();
        if (idade >= 18){
            System.out.println("Você é maior de Idade");
        }else{
            System.out.println("Você é menor de Idade");
        }
    }
}
