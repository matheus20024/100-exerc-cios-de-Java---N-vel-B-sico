/*Peça uma nota e diga se o aluno foi aprovado (>=7). */

import java.util.Scanner;

public class aluno {
    public static void main(String[] args) {
        int nota;
        Scanner resultado = new Scanner(System.in);
        System.out.println("Digite sua nota: ");
        nota = resultado.nextInt();
        if (nota >= 7){
            System.out.println("Parabéns, você foi aprovado.");
        }else{
            System.out.println("você não foi aprovado.");
        }
    }
}
