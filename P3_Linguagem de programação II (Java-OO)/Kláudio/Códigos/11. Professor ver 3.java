package lingprog2;
import java.util.*;

public class Professor extends Funcionario {

	private List<String> disciplinas;
	
	/* Não há uma obrigação dessa classe implementar esse
	 * atributo. Caso quiséssemos calcular o salário do
	 * professor de outras formas, poderíamos fazer isso
	 * sem problemas. A questão é que esse método deve
	 * retornar um float.
	 * 
	 */
	private static float salarioBaseProf = 60;
	
	public Professor(String nome, int cargaHoraria) {
		super(nome, cargaHoraria);
		this.disciplinas = new ArrayList<String>();
	}

	/* Se a lista de disciplinas deixar de ser ArrayList,
	 * não precisaremos mudar esse método.
	 * 
	 */
	public List<String> getDisciplinas()
	{
		return this.disciplinas;
	}
	
	public void setDisciplinas(List<String> disciplinas)
	{
		this.disciplinas = disciplinas;
	}
	
	public void addDisciplina(String disciplina)
	{
		this.disciplinas.add(disciplina);
	}

	/* Perceba que ele obtém a carga horária. Porém, a
	 * carga horária é um atributo privado de Funcionario,
	 * obtido através do get. Caso quiséssemos acessar
	 * diretamente nessa classe, o atributo cargaHoraria
	 * poderia ser modificado para protected.
	 */
	
	@Override
	public float calculaSalario() {
		return getCargaHoraria() * salarioBaseProf;
	}

}
