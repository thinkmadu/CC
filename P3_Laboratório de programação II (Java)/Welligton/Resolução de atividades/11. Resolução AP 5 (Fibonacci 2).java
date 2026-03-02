// Fibonacci2.java

public class Fibonacci2{
    public static long fibo2(long num){
        long anterior = 0, posterior = 1;
        for(int i = 0; i < num; i++){
            long temp = anterior;
            anterior = posterior;
            posterior += temp;
        } // Fim do for

        return posterior;
    } // Fim do método iterativo fibo2
} // Fim da classe