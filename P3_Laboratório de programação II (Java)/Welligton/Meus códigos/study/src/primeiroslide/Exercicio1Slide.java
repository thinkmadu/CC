package primeiroslide;

/* Escreva um programa Quadrados que leia um número da linha de comando e imprima o quadrado de todos os números entre 1 e o número
 * passado. Para converter de String para int., use:
 * int numero = Integer.parseInt("10");
 * */

public class Exercicio1Slide {
    public static void main(String[] args) {
        int n = Integer.parseInt("10");

        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + i * i); // mesma coisa que o Math.pow faz
            }
        }
    }
