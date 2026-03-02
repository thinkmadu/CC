package primeiroslide;

public class Rotulo {
    public static void main(String[] args) {
        int[][] listaInts = { { 32, 87, 3, 589 },
                { 12, 1076, 2000, 8 },
                { 622, 127, 77, 955 }
        };
        int numProcurado = 12;

        int i;
        int j = 0;
        boolean achou = false;

        procure:
        for (i = 0; i < listaInts.length; i++) {
            for (j = 0; j < listaInts[i].length; j++) {
                if (listaInts[i][j] == numProcurado) {
                    achou = true;
                    // quando chegar aqui, todo o bloco dentro do for vai sair
                    break procure;
                }
            }
        }

        if (achou) {
            System.out.println("Achei " + numProcurado + " em " + i + ", " + j);
        } else {
            System.out.println(numProcurado + " não está na lista");
        }
    }
}
