// Classe Questao02

public class Questao02{
    public static int calc(int a){
        int s = 0;
        if(!(a < 0 || a % 2 == 0)){
            for(int i = 1; i <= 3; i++){
                s += i * 3;
            }
        }
        else{
            while(a > 5){
                s += a / 2;
                a--;
            }
        }
        return s;
    } // Fim do método
    public static void main(String[] args) {
        System.out.println("Saída "+Questao02.calc(8));
    }
}