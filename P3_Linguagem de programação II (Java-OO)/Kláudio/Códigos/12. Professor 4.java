package lingprog2;

import java.util.ArrayList;
import java.util.List;

/* Professor é um tipo especial de uma função. Nesse caso, pode ser
 * interessante o uso de herança. 
 * 
 * No caso de professor (e de secretário), pouco código é de fato
 * reaproveitado. Você poderia, até mesmo, favorecer o baixo acoplamento
 * através do uso de interfaces nesses casos.
 * 
 * Você pode pensar, entretanto, que mais código pode ser necessário 
 * aqui. Se esse código for comum entre as subclasses (ou seja, entre
 * diferentes funções), então pode ser interessante escrevê-lo em uma
 * superclasse e fazer essas subclasses herdarem.
 */
public class Professor2 extends Funcao{

	private List<String> disciplinas;
	
	/* Não há uma obrigação dessa classe implementar esse
	 * atributo. Caso quiséssemos calcular o salário do
	 * professor de outras formas, poderíamos fazer isso
	 * sem problemas. A questão é que esse método deve
	 * retornar um float.
	 * 
	 */
	private static float salarioBaseProf = 60;
	
	public Professor2(int cargaHoraria) {
		super(cargaHoraria);
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
