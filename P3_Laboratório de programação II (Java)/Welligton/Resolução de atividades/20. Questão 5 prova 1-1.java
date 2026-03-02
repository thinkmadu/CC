// Versão 2 do método padrao()

public class Q05{
    public void padrao(int n){
        // int temp = 1; -> foi para o corpo do for
        for (int i = 1, temp = 1; i <= n; i++, temp++) {
            for (int j = 1; j <= temp; j++) {
                System.out.printf("%d ", j); // System.out.print(j + " ");
            } // Fim do for interno
            System.out.println();
            //temp++; -> foi para o corpo do for
        } // Fim do for externo
    } // Fim do método padrao()

    public static void main(String[] args) {
        Q05 teste = new Q05();
        teste.padrao(6);
    } // Fim do main
} // Fim da classe