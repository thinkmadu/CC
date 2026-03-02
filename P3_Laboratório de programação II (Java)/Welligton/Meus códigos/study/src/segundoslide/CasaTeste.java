package segundoslide;

public class CasaTeste {
    public static void main(String[] args) {
        Casa casa = new Casa("Rua Emiliano Rosendo da Silva","75","Bege");
        System.out.println("Endereço do obj: " + casa); // -- endereço de memória
/*
 *      System.out.print(casa.getEndereco()); endereço do obj casa
 *      System.out.println(", " + casa.getNum()); número do obj casa
 *      System.out.println(casa.getCor()); cor do obj casa
*/
        casa.exibir();

        casa.setEndereco("Rua Copérnico");
        casa.setNum("266");
        casa.setCor("Branca");
        casa.exibir();

    }
}
