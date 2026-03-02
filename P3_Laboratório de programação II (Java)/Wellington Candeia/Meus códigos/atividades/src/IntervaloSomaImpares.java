/* QUESTÃO 3: Calcule e mostre na tela a soma de todos os números ímpares no intervalo a e b. Leia o valor de início (a) e o valor
 * de fim (b) do teclado utilizando o método apropriado da classe Scanner.
 * */

public class IntervaloSomaImpares {
    private int soma;
    public void calcSomaImpares(int a, int b){
        // o for começa a rodar a partir do inicio do intervalo dado e vai até o final do intervalo informado
        for(int i = a; i <= b; i++){
            if( i % 2 != 0){ // checando se é impar para adicionar na soma
                soma += i;
            }
        } // FIM DO FOR
        if (soma == 0){ // no caso de a = b
            System.out.print("Não existe números impares informados nesse intervalo");
        }
        else {
            System.out.print("A soma dos números impares do intervalo de " + a + " até " + b + " é de: " + soma);
        }
    } // FIM DO MÉTODO

} // FIM DA CLASSE

