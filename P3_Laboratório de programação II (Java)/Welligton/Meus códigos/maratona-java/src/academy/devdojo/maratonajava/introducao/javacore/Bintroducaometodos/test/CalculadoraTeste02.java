package academy.devdojo.maratonajava.introducao.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.introducao.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros(); // <variável de referencia>.<método>();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNum(5,2);
        System.out.println("Acabou a execução");
    }
}
