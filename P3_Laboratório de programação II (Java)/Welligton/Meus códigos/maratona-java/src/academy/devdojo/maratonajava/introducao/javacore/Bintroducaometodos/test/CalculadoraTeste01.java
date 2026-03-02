package academy.devdojo.maratonajava.introducao.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.introducao.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros(); // <variável de referencia>.<método>();
        calculadora.subtraiDoisNumeros();
        System.out.println("Acabou a execução");
    }
}
