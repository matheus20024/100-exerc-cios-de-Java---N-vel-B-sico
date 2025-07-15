
import java.util.Scanner;

/*2. Peça o nome do usuário e cumprimente.*/ 
public class comprimentacao{
    public static void main(String[] args) {
        String nome;
        Scanner usucario = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        nome = usucario.nextLine();
        System.out.print("Olá, " + nome);
    }
}