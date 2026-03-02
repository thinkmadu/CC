/* QUESTÃO 4: Escreva um método em Java que recebe um inteiro e retorna verdadeiro se o número é par. O método deve efetuar o cálculo
 * sem utilizar os operadores de multiplicação, divisão ou módulo.
 */
public class IsPar {
    public static boolean VerificarPar(int num){
        if(num < 0){ // tratamento para numeros pares negativos
            while(num <= -1){ // executa adições consecutivas para chegar em 0 (par, true) ou -1 (impar, false)
                num += 2;
            } // FIM DO WHILE

            if(num == 0 ){
                return true;
            }
            else{
            }
            return false;
        } // FIM DO IF
        else {
            while (num >= 1) { // executa subtrações seguidas para chegar em 0 (par, true) ou 1 (impar, false)
                num -= 2;
            } // FIM DO WHILE
            if(num == 0){
                return true;
            } // FIM DO IF
            else {
                return false;
            } // FIM DO ELSE interno
        } // FIM DO ELSE externo
    } // FIM DO MÉTODO
} // FIM DA CLASSE
