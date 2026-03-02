package academy.devdojo.maratonajava.introducao.maratonajava.introducao;

public class aula06estruturasderepeticao2ex {
    // imprimir todos os números pares de 0 a 1000000
    public static void main(String[] args) {
        int index = 0;

        for(int i = 0; i <= 1000000; i++){
            if(i % 2 == 0) {
                System.out.println("[" + index + "]. " + i);
                index++;
            } // FIM DO IF
        } // FIM DO FOR
    }
}
