package academy.devdojo.maratonajava.introducao.maratonajava.introducao;

public class aula02tiposprimitivos {
    public static void main(String[] args) {
        /* Existem 8 tipos primitivos:
        * 1. int
        * 2. float
        * 3. double
        * 4. char
        * 5. byte
        * 6. short
        * 7. long
        * 8. boolean
        * */

        int age = 19;
        long bigNumber = 40028922;
        double salaryoDouble = 2000;
        float salaryFloat = 2500;
        byte ageByte = 20;
        short ageShort = 21;
        boolean envelhecendo = true;
        char caractere = 'M';

        System.out.println(age); // pra duplicar linhas é ctrl + d
        System.out.println("Minha idade é " + age);
        System.out.println("Minha idade é " + age + " anos");
    }
}
