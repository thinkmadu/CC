import java.util.Scanner;

public class QuadradoVazioTeste {
    public static void main(String[] args) {
        QuadradoVazio meuQuadrado = new QuadradoVazio();
        int tam;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o tamanho do quadrado: ");
        tam = entrada.nextInt();
        meuQuadrado.consQuadrado(tam);

    } // FIM DO MAIN
} // FIM DA CLASSE
