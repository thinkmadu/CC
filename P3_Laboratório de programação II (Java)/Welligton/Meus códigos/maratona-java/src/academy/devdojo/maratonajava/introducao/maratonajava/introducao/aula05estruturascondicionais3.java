package academy.devdojo.maratonajava.introducao.maratonajava.introducao;

public class aula05estruturascondicionais3 {
    public static void main(String[] args) {
        // doar 500 se o salário >= 5000
        double salario = 8000;
        String mensagemDoar = "Eu vou doar R$500";
        String mensagemNãoDoar = "Eu não vou doar R$500";
        // OPERADOR TERNÁRIO: <condição> ? <verdadeiro> : <falso>
        String resultado = salario >= 5000 ? mensagemDoar : mensagemNãoDoar;

        System.out.println(resultado);
        System.out.println(salario >= 5000 ? mensagemDoar : mensagemNãoDoar);
    }
}
