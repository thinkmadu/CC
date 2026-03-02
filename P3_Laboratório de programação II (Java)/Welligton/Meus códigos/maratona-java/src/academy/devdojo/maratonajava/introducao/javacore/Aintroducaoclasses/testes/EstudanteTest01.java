package academy.devdojo.maratonajava.introducao.javacore.Aintroducaoclasses.testes;
import academy.devdojo.maratonajava.introducao.javacore.Aintroducaoclasses.dominio.EstudanteClasse;

public class EstudanteTest01 {
    public static void main(String[] args) {
        EstudanteClasse aluno1 = new EstudanteClasse();
        aluno1.nome = "Madu";
        aluno1.idade = 19;
        aluno1.sexo = 'F';

        System.out.println(aluno1.nome);
        System.out.println(aluno1.idade);
        System.out.println(aluno1.sexo);
        System.out.println(aluno1);

    }
}
