package academy.devdojo.maratonajava.introducao.maratonajava.introducao;

import java.util.Scanner;

public class aula05estruturascondicionais5 {
    /* Imprima o dia da semana, considerando 1 como domingo.
    * */
    public static void main(String[] args) {
        System.out.println("Informe um número único de 1 à 7:");
        Scanner entrada = new Scanner(System.in);
        byte dia = entrada.nextByte(); // scanner é um coisa sobrecarregado

        switch (dia) {
            case 1 -> System.out.println("1 corresponde a DOMINGO");
            case 2 -> System.out.println("2 corresponde a SEGUNDA-FEIRA");
            case 3 -> System.out.println("3 corresponde a TERÇA-FEIRA");
            case 4 -> System.out.println("4 corresponde a QUARTA-FEIRA");
            case 5 -> System.out.println("5 corresponde a QUINTA-FEIRA");
            case 6 -> System.out.println("6 corresponde a SEXTA-FEIRA");
            case 7 -> System.out.println("7 corresponde a SÁBADO");
            default -> System.out.println("Você digitou um número inválido");
        } // FIM DO SWITCH
    } // FIM DO MÉTODO
} // FIM DA CLASSE
