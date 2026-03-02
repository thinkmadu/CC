package academy.devdojo.maratonajava.introducao.maratonajava.introducao;

public class aula06estruturasderepeticao4 {
    // quero saber em quantas parcelas eu posso dividir o valor de um carro, sob a condição
    // de que as parcelas devem ser de ao menos 1000
    public static void main(String[] args) {
        double valorCarro = 40000;

        for(int parcela = (int) valorCarro; parcela >= 1 ; parcela--){ // esse for começa do valor total do carro
            // o for vai até a parcela 1 e usamos o decremento pra ir diminuindo
            double valorParcela = valorCarro / parcela;
            if(valorParcela < 1000){ // se o valor da parcela for menor que 1000, ele vai pular o código do print
                continue;
            }
            System.out.printf("[%d]. %.2f\n", parcela, valorParcela);

        }
    }
}
