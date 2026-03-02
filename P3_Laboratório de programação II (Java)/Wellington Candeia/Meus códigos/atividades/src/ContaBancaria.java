/* QUESTÃO 15: Crie uma classe ContaBancaria. A classe deve fornecer um construtor ContaBancaria(double saldoInicial)
 * que recebe já o valor do saldo inicial da conta. Deve haver um teste para verificar se esse saldo é maior que
 * zero.
 * 1. [OK] Forneça o método depósito que adiciona uma quantia ao saldo da conta.
 * 2. [OK] Forneça um método chamado saque que retira dinheiro de uma conta da classe ContaBancaria.
 * 3. [OK] Assegure que a quantia de débito não exceda o saldo de ContaBancaria. Se exceder, o saldo deve ser deixado inalterado e o
 * método deve imprimir uma mensagem que indica "Você não tem saldo suficiente para realizar essa operação”.
 * 5. [OK] Forneça o método getSaldo() que retorna o saldo da conta.
 * 6. [OK] Crie a classe ContaTeste para testar o método saque.
 * 7. [OK] Crie dois objetos na classe de teste (conta1 e conta2), com valores diferentes de depósito no construtor.
 * 8. [OK] Exiba na tela o saldo de cada conta.
 * */

public class ContaBancaria {
    private String nome, sobrenome;
    private int numConta;
    private double saldo;

    public ContaBancaria(){} // CONSTRUTOR VAZIO
    public ContaBancaria(String nome, String sobrenome, int numConta, double saldo){
            if(nome != "")
                this.nome = nome;
            if(sobrenome != "")
                this.sobrenome = sobrenome;
            if(numConta > 0)
                this.numConta = numConta;
            if(saldo >= 0)
                this.saldo += saldo;
        } // FIM DO CONSTRUTOR (STRING, STRING, INT, DOUBLE)

        public ContaBancaria(String nome, String sobrenome){
            this.nome = nome;
            this.sobrenome = sobrenome;
        } // FIM DOS CONTRUTOR (STRING, STRING)

        public void setSaldo(double saldo){
            if(saldo >= 0) {
                this.saldo += saldo;
            }
        } // FIM DO MÉTODO setSaldo(double);

        public double getSaldo(){
            return saldo;
        } // FIM DO MÉTODO getSaldo()

        public void deposito(double deposito){
            if(deposito >= 0) {
                this.saldo += deposito;
                System.out.println("\n█ Depósito realizado com sucesso\n█ Saldo em conta: R$" + this.saldo + "\n");
            }
            else{
                System.out.println("\n█ Dado inválido\n█ Depósito não efetuado\n");
            }
        } // FIM DO MÉTODO deposito(double), adiciona determinada quantia ao saldo total do obj conta

        public void saque(double saque){
            if(this.saldo >= saque && saque > 0){
                this.saldo -= saque;
                System.out.println("\n█ Saque realizado com sucesso\n█ Saldo em conta: R$" + this.saldo + "\n");
            }
            else{
                if(saque > this.saldo) {
                    System.out.println("\n█ Você não tem saldo suficiente para realizar essa operação\n");
                }
                else{
                    System.out.println("\n█ Dado inválido\n█ Saque não efetuado\n");
                } //FIM DO ELSE interno
            } // FIM DO ELSE externo
        } // FIM DO MÉTODO saque(double), retira certa quantia de dinheiro do obj conta, se possível

        public void setNumConta(int numConta){
            if(numConta > 0)
                this.numConta = numConta;
        } // Fim do método setNumConta(), redefine número da conta

        public int getNumConta(){
            return numConta;
        } // FIM DO MÉTODO getNumConta(), retorna número da conta

        public void setNome(String nome){
            if(nome != "")
                this.nome = nome;
        } // FIM DO MÉTODO setNome(), redefine o nome do obj

        public String getNome(){
            return this.nome;
        } // FIM DO MÉTODO getNome(), retorna o nome do obj

        public void setSobrenome(String sobrenome){
            if(sobrenome != "")
                this.sobrenome = sobrenome;
        } // FIM DO MÉTODO setSobrenome(), redefine sobrenome do obj

        public String getSobrenome(){
            return sobrenome;
        } // FIM DO MÉTODO getSobrenome(), retorna o sobrenome do obj
         public void exibir(){
         System.out.printf("╔═════════════════════════╗\n║Conta: %d\n║Cliente: %s %s\n║Saldo: %.2f\n╚═════════════════════════╝\n", numConta, nome, sobrenome, saldo);
         } // FIM DO MÉTODO exibir()

    } // FIM DA CLASSE
