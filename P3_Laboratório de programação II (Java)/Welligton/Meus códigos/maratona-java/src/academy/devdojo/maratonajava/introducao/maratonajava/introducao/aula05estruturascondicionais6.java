package academy.devdojo.maratonajava.introducao.maratonajava.introducao;

import java.util.Scanner;

public class aula05estruturascondicionais6 {
    public static void main(String[] args) {
        System.out.println("Informe um número único de 1 à 7:");
        Scanner entrada = new Scanner(System.in);
        byte dia = entrada.nextByte(); // scanner é um coisa sobrecarregado

        switch (dia) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("É dia útil");
                break;
            case 1:
            case 7:
                System.out.println("É final de semana");
                break;
            default:
                System.out.println("Você digitou um número inválido");
                break;
        } // FIM DO SWITCH
    } // FIM DO MÉTODO
}
