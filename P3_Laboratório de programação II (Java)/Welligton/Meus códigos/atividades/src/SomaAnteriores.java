/* QUESTÃO 5: Escreva um aplicativo Java que receba um inteiro não negativo x e mostre na tela a soma de todos os inteiros não negativos
 * menores que x (x não está dentro do intervalo)
 * */
public class SomaAnteriores {
    private double resultado = 0;
    private int numAux; // só pra deixar o print bonitinho
    public void calcSomas(int num){
        numAux = num;
        while (num > 0){
            resultado += num - 1; // a partir do num - 1 ele vai somando os numeros de forma decrescente
            num--;
        }
        System.out.println("A soma de 1 até " + numAux + " é igual a " + resultado);
    } // FIM DA FUNÇÃO
} // FIM DA CLASSE
