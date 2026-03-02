package academy.devdojo.maratonajava.introducao.maratonajava.introducao;

/* Crie variáveis para os campos descritos  abaixo entre <> e imprima a seguinte mensagem:
* "Eu <nome>, morando no endereço <endereço> confirmo que recebi o salário de <salário>, na data <data> "
* */
public class aula03tiposprimitivosexercicio {
    public static void main(String[] args) {
        String nome = "Madu";
        String endereço = "Emiliano Rosendo da Silva, n75";
        double salario = 2500;
        String data = "29/03/2023";

        System.out.printf("Eu %s, morando no endereço %s confirmo que recebi o salário de %.0f, na data %s\n", nome, endereço, salario, data);

    }
}
