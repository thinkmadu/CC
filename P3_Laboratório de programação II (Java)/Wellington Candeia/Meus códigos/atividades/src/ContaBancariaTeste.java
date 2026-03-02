public class ContaBancariaTeste {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Madu", "Silva", 152, 1098);
        ContaBancaria conta2 = new ContaBancaria("Nayanne", "Bezerra", 184, 2000);

        conta1.exibir();
        conta2.exibir();
        conta1.getSaldo();
        conta2.getSaldo();
        conta1.deposito(1000);
        conta2.deposito(1000);
        conta1.saque(10000);
        conta2.saque(10000);
        conta1.saque(-1);
        conta2.saque(-1);
        conta1.deposito(-1);
        conta2.deposito(-1);

    } // FIM DO MAIN
} // FIM DA CLASSE
