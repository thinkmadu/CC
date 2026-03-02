package primeiroslide;
import javax.swing.*;

/* Use o JOptionPane (veja documentação) e repita o exercício anterior recebendo os dados através da janela de entrada de dados.
 * Use JOptionPane.showInputDialog(string) de javax.swing para ler entrada de dados; use JOptionPane.showMessageDialog(null, msg) para
 * exibir a saída de dados
 * */

public class Exercicio2Slide {
    public static void main(String[] args) {

        String teste = JOptionPane.showInputDialog("Digite um número:"); // painel com a caixa de pergunta
        int n = Integer.parseInt(teste); // transformando a string em um Integer para realizar a operação
        int quadrado = n * n;
        JOptionPane.showMessageDialog(null, "O quadrado de " + n + " é " + quadrado);
    }
}

