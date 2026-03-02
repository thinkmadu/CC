package lingprog2;
import java.util.*;

/* A classe Professor herda de Funcionario. A herança estabelece uma relação
 * "é um" entre as classes, de modo que podemos dizer que Professor é um
 * Funcionario. Ele irá herdar o que não for privado de Funcionario.
 * 
 * A classe Professor irá herdar um método abstrato. Essa classe tem a respon-
 * sabilidade de dar uma implementação para esse método. Caso não o faça,
 * essa classe também terá implementação faltando e será também abstrata, não
 * podendo ser instanciada. No caso, queremos podemos instanciar o Professor,
 * já que Professor sim é algo concreto, diferente de Funcionario.
 */

public class Professor extends Funcionario{
	
	/* Esse atributo está sendo definido na classe Professor. Como ele não
	 * foi definido em Funcionario, então disciplinas fica sendo um atributo
	 * próprio do Professor. Nesse sentido, Professor "estende" a classe
	 * Funcionario, já que irá herdar o que é comum aos funcionários, mas
	 * também poderá incluir seus próprios atributos e métodos.
	 */
	
	private List<String> disciplinas; 
	
	/* Aqui, definimos um valor único de salário base para professores. É esse
	 * valor que queremos retornar com getSalarioBase (poderia ser de várias
	 * outras formas, caso desejássemos) e é esse valor que será utilizado
	 * no cálculo do salário.
	 * 
	 */
	
	private static float salarioBaseProfessor = 60;

	/* Os atributos protected de Funcionario não precisam ser reescritos
	 * aqui, visto que foram herdados.
	 */
	
	/* O método calculaSalario precisará ter uma implementação aqui na classe
	 * Professor, pois esse método é abstrato. Não foque aqui se o cálculo
	 * é preciso ou não, foque no fato de que a forma como o cálculo do salário
	 * do professor é particular dele. O cálculo do salário de um Secretario
	 * pode ser diferente.
	 */
	
	@Override
	public float calculaSalario() {
		return this.cargaHoraria * salarioBaseProfessor;
	}

	/* Aqui, temos as implementação de get e setSalarioBase, que são abstratos
	 * na superclasse.
	 * 
	 */
	
	@Override
	public float getSalarioBase() {
		return salarioBaseProfessor;
	}

	@Override
	public void setSalarioBase(float salarioBase) {
		salarioBaseProfessor = salarioBase;
	}
	
	public void ministrarAula(String disciplina)
	{
		System.out.printf("A aula de %s foi ministrada por %s\n", disciplina, this.nome);
	}
	
	

}
