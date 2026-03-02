package academy.devdojo.maratonajava.introducao.maratonajava.introducao;

public class ula06estruturasderepeticao3 {
    // quero saber em quantas parcelas eu posso dividir o valor de um carro, sob a condição
    // de que as parcelas devem ser de ao menos 1000
    public static void main(String[] args) {
        double valorCarro = 40000;

        for(int parcela = 1; parcela <= valorCarro ; parcela++){
            double valorParcela = valorCarro / parcela;
            System.out.printf("[%d]. %.2f\n", parcela, valorParcela);
            if(valorParcela <= 1000){
                break;
            }

        }
    }
}
