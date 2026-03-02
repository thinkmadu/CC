/* QUESTÃO 14: Crie um método quadradoDeCaracteres para formar o quadrado a partir de quaisquer que sejam os caracteres
 * (digitados pelos usuários) contidos nos parâmetros de caracteres a e b. O parâmetro a está associado as diagonais do
 * quadrado. O parâmetro b, aos elementos restantes. Escreva um aplicativo de teste chamado TesteQuadrados que executa o método.
 */

public class QuadradoCaracteres {
     public void Quadrado(int tam, String a, String b){
         for(int i = 0; i < tam; i++){
             for(int j = 0; j < tam; j++){
                 // as coordenadas da diagonal principal sempre são iguais, enquanto a diagonal secundaria é sempre
                 if( i == j || j == tam - i - 1){
                     System.out.print(" " + a);
                 } // FIM DO IF
                 else {
                     System.out.print(" " + b);
                 }
             } // FIM DO FOR INTERNO
             System.out.println();
         } // FIM DO FOR EXTERNO
     }
}
