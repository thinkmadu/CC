import java.util.Scanner;

public class IntervaloSomaImparesTeste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // para pegar o input do usuário
        int num1, num2;

        System.out.println("Digite o número que será igual ao início do intervalor:");
        num1 = entrada.nextInt();
        System.out.println("Digite o número que será igual ao fim do intervalor:");
        num2 = entrada.nextInt();

        IntervaloSomaImpares resultado = new IntervaloSomaImpares();
        resultado.calcSomaImpares(num1, num2); // utilizando o obj pra chamar o método

    } // FIM DO MAIN
} // FIM DA CLASSE
