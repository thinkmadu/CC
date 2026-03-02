// MatrizTransposta.java

public class MatrizTransposta{
    public static void transposta(int matriz[][]){
        int aux[][] = new int[matriz.length][matriz.length];
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                aux[i][j] = matriz[j][i];
                System.out.printf("%d ", aux[i][j]);
            } // For interno
            System.out.println();
        } // For externo
    } // Fim do método
} // Fim da classe