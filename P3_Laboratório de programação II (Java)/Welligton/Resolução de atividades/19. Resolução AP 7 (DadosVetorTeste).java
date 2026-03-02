// DemonstrandoVetores.java

//import java.util.Arrays;

public class DemonstrandoVetores{
    public static void main(String[] args) {
        double vetorD[] = {0, 7, -15, 8, 13};
        double vetor2[] = vetorD;
        double vetor3[] = new double[100];
        exibirVetor(vetorD, "Vetor de double 1");
        exibirVetor(vetor2, "Vetor de double 2");
        exibirVetor(vetor3, "Vetor de double 3");
        java.util.Arrays.sort(vetorD);
        exibirVetor(vetorD, "Vetor de double 1");
        exibirVetor(vetor2, "Vetor de double 2");
        vetorD[3] = -50D;
        exibirVetor(vetorD, "Vetor de double 1");
        java.util.Arrays.fill(vetorD, 0, 5, 100);
        exibirVetor(vetorD, "Vetor de double 1");
    } // Fim do main

    // Método exibirVetor: recebe um vetor e uma descrição como entrada
    // Saída: conteúdo do vetor na tela
    public static void exibirVetor(double vetor[], String desc){
        System.out.println(desc);
        /*for(int i = 0; i < vetor.length; i++){ // for acessando índice do vetor
            System.out.printf("%.2f ", vetor[i]);
        }*/
        for(double temp : vetor){
            System.out.printf("%.2f ", temp);
        } // For aprimorado
        System.out.println();
    } // Fim do método exibirVetor
    
} // Fim da classe