package primeiroslide;
import java.util.Scanner;

public class ComparandoUltimoBit {
    public static void main(String[] args) {
        /* O operador & verifica o último bit do dado
        * EXEMPLO DE USO:
        * */
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.println("Digite o número a ser analisado: ");
        num = entrada.nextInt();

        System.out.println(num & 1); //imprime o último bit
        // esse código vai verificar se o último bit de numero é 0 (par) ou 1 (impar)
        if ((num & 1) == 0) {
            System.out.println("true");
        } // -- if
        else {
            System.out.println("false");
        } // --else
    } // -- método main
} // -- classe
