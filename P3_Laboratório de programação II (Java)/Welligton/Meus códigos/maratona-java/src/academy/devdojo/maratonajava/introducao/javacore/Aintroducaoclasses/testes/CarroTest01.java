package academy.devdojo.maratonajava.introducao.javacore.Aintroducaoclasses.testes;

import academy.devdojo.maratonajava.introducao.javacore.Aintroducaoclasses.dominio.CarroClasse;

public class CarroTest01 {
    public static void main(String[] args) {
        CarroClasse meuCarro = new CarroClasse();
        CarroClasse meuCarro2 = new CarroClasse();
        meuCarro.nome = "kali";
        meuCarro2.nome = "Ali";
        meuCarro.modelo = "fusca";
        meuCarro2.modelo = "Camaro";
        meuCarro.ano = 2019;
        meuCarro2.ano = 1998;

        System.out.println(meuCarro.nome + ", "+ meuCarro.modelo + ", " + meuCarro.ano);
        System.out.println(meuCarro2.nome + ", "+ meuCarro2.modelo + ", " + meuCarro2.ano);
    }


}
