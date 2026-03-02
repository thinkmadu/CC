
import java.util.Scanner;

public class QuadradoCaracteresTeste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tam;
        String a = "";
        String b = "";

        System.out.println("Digite o tamanho do quadrado: ");
        tam = entrada.nextInt();
        System.out.println("Digite o caractere das diagonais: ");
        a = entrada.next();
        System.out.println("Digite o caractere para preencher as outras posições: ");
        b = entrada.next();

        QuadradoCaracteres quadradinho = new QuadradoCaracteres();
        quadradinho.Quadrado(tam, a, b);

    } // FIM DO MAIN
} // FIM DA CLASSE
