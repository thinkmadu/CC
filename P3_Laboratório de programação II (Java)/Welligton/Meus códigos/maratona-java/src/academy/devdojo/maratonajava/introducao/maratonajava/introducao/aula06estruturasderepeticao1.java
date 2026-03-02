package academy.devdojo.maratonajava.introducao.maratonajava.introducao;

public class aula06estruturasderepeticao1 {
    //while, do-while, for
    public static void main(String[] args) {
        int count = 0;
        int indice = 1;

        while (count < 10){ // enquanto a condição daqui for verdadeira, o loop vai continuar
            /* tomar cuidado onde eu coloco as variáveis, geralmente elas devem ficar fora do while pq sempre que iniciar um
             * novo loop, ela reseta
             * */
            System.out.printf("Este é o loop nº%d\n", indice);
            indice++;
            count++;
        } // FIM DO WHILE

        /*a diferença desse pro while é é que esse vai executar e só depois checar a condição, o contrário do while que checa a
         * condição e, se for verdadeira, executa
         */
        System.out.println("==================================================");
        count = 0;
        indice = 1;
        do {
            System.out.printf("Este é o loop do do-while nº%d\n", indice);
            indice++;
            count++;
        } while(count < 10);

        System.out.println("==================================================");

        for(int i = 0; i < 10; i++){
            System.out.println(i + ". Você precisa parar de se importar");
        }

    } // FIM DO MÉTODO
} // FIM DA CLASSE
