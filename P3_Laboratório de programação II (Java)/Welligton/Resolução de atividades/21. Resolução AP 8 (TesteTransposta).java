// Questão 9 - AP 8
// TesteTransposta.java
import java.util.Random;
// import java.security.SecureRandom; // preferencialmente aqui
import java.util.Scanner;

public class TesteTransposta{
    public static void main(String args[]) {
        // System.out.println(args[0]+" "+args[4]);
        int ordem, matriz[][];
        Scanner entrada = new Scanner(System.in);
        Random sorteio = new Random();
        System.out.print("Digite a ordem: ");
        ordem = entrada.nextInt();

        if(ordem > 0){
            matriz = new int[ordem][ordem];
            System.out.println();
            System.out.println("Matriz original:");
            for(int i = 0; i < matriz.length; i++){
                for(int j = 0; j < matriz[i].length; j++){
                    matriz[i][j] = sorteio.nextInt(10);
                    System.out.printf("%d ", matriz[i][j]);
                } // For interno
                System.out.println();
            } // For externo
            System.out.println();
            System.out.println("Matriz transposta");
            MatrizTransposta.transposta(matriz);
        } // Fim do if
        System.out.println();
        entrada.close();
    } // Fim do main
} // Fim da classe