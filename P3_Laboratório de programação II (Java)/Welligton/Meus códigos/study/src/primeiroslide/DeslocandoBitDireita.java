package primeiroslide;

// ele vai dividir por 2^num
public class DeslocandoBitDireita {
    public static void main(String[] args) {
        int x = 80;
        double y = x >> 3;

        // ele vai fazer 80 / 8 (pois 2*2*2)
        System.out.println(y);
    }
}
