/* QUESTÃO 2: Escreva um aplicativo que solicita aos usuários que insiram o tamanho do lado de um quadrado e, então, exibe um quadrado vazio
 * desse tamanho com asteriscos. Seu programa deve trabalhar com quadrados de todos os comprimentos de lado possíveis entre 1 e 38.
 * */
public class QuadradoVazio {
    public void consQuadrado(int tam){
        if(tam < 1 || tam > 38){ // tratamento de possibilidades além do permitido
            System.out.println("Tamanho inválido");
        } // FIM DO IF
        else{
            for(int i = 0; i < tam; i ++){
                for(int j = 0; j < tam; j++){
                    // as bordas do quadrado sempre vão ser i e j = 0 e o último index dos arrays, tam - 1
                    if( i == 0 || i == tam - 1 || j == 0 || j == tam - 1){
                        System.out.print("* ");
                    } // FIM DO IF
                    else{
                        System.out.print("  "); // preenchimento
                    } // FIM DO ELSE
                } // FIM DO FOR INTERNO
                System.out.println(); // quebra de linha entre cada ciclo do for externo
            } // FIM DO FOR EXTERNO
        } // FIM DO ELSE
    } // FIM DO MÉTODO consQuadrado(int)
} // FIM DA CLASSE
