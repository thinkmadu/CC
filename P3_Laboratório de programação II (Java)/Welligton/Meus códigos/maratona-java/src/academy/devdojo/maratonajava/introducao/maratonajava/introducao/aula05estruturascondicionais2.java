package academy.devdojo.maratonajava.introducao.maratonajava.introducao;

public class aula05estruturascondicionais2 {
    private static boolean estado = false;

    public static void main(String[] args) {
        if (estado) { // o if só vai executar se a condição dai de dentro for verdadeira
            System.out.println("dentro do if");
        } //fim do if

        else if (!estado) { // se o estado não for true, substitui o == false
            System.out.println("Dentro do outro");
        }
    }
}
