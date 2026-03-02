package academy.devdojo.maratonajava.introducao.javacore.Aintroducaoclasses.testes;
import academy.devdojo.maratonajava.introducao.javacore.Aintroducaoclasses.dominio.ProfessorClasse;

public class ProfessorTest01 {
    public static void main(String[] args) {
        ProfessorClasse professor = new ProfessorClasse();
        professor.nome = "Manoel";
        professor.idade = 32;
        professor.sexo = 'M';

        System.out.println(professor.nome + ", " + professor.idade + ", " + professor.sexo);
    }
}
