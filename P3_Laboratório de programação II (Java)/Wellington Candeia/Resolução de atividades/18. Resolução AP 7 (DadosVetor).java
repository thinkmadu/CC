// DadosVetor.java
import java.util.Random;
// import java.security.SecureRandom;

public class DadosVetor{
    private static int faces[];
    private static final int TAM = 7;

    // Método dados: sorteia os valores entre 1 e 6,
    // e exibe na tela o conteúdo do vetor faces
    public static void dados(){
        Random sorteio = new Random();
        faces = new int[TAM];
        for(int i = 0; i < 10000; i++){
            int temp = sorteio.nextInt(6) + 1;
            faces[temp]++;
        }
        for(int temp : faces)   
            System.out.printf("%d ", temp);
    } // Fim do método dados
    public static void main(String[] args) {
        dados();
    } // Fim do método main
} // Fim da classe DadosVetor