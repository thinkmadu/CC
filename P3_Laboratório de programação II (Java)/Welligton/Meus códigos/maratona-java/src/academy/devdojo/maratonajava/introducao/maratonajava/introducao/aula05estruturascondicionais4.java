package academy.devdojo.maratonajava.introducao.maratonajava.introducao;
import java.util.Scanner;

/* Quero saber quanto de imposto devo pagar de acordo com o meu salário em euro
* 1 tier: 0 a  34712 paga 9.7%
* 2 tier: 34713 a 68507 paga 37.35%
* 3 tier: 68508 ou + paga 49.50%
*  */

public class aula05estruturascondicionais4 {
    public static void main(String[] args) {
        double salarioAnual; // é bom deixar sem ser inicializado porque aí ele não vai assumir nenhum valor e multiplicar "sem querer"
        double primeiraFaixa = 9.70/100;
        double segundaFaixa = 37.35/100;
        double terceiraFaixa = 49.50/100;
        double valorImposto;
        double tier1 = 34712;
        double tier2 = 68507;

        System.out.println("Qual o seu salário (em euro)?");
        Scanner entrada = new Scanner(System.in);
        salarioAnual = entrada.nextDouble();


        if(salarioAnual > 0 &&  salarioAnual <= tier1){
            valorImposto = salarioAnual * primeiraFaixa;
            System.out.println("Entrei no 1º if");
            System.out.printf("Você tem que pagar %.2f em imposto", valorImposto);
        }
        else if (salarioAnual > tier1 && salarioAnual <= tier2){
            valorImposto = salarioAnual * segundaFaixa;
            System.out.println("Entrei no 2º if");
            System.out.printf("Você tem que pagar %.2f em imposto", valorImposto);
        }
        else {
            valorImposto = salarioAnual * terceiraFaixa;
            System.out.println("Entrei no 3º if");
            System.out.printf("Você tem que pagar %.2f em imposto", valorImposto);
        }
    } // fim do método
} // fim da classe
