package lingprog2;

public class Funcionario {

	/* Os atributos abaixo são herdados pelas subclasses de Funcionario.
	 * O modificador de visibilidade protected indica que esses atributos
	 * podem ser acessados pela própria classe e pelas suas subclasses.
	 */
	protected String nome;
	protected float salarioBase;
	protected int cargaHoraria;
	
	
	/* O método calculaSalario faz uma multiplicação do salário base pela
	 * carga horária do funcionário.
	 * 
	 */
	public float calculaSalario()
	{
		return this.cargaHoraria * salarioBase;
	}
	
	public String getNome()
	{
		return this.nome;
	}
	
	public void setNome(String novoNome)
	{
		this.nome = novoNome;
	}
	
	public int getCargaHoraria()
	{
		return this.cargaHoraria;
	}
	
	public void setCargaHoraria(int novaCarga)
	{
		this.cargaHoraria = novaCarga;
	}
	
	public float getSalarioBase()
	{
		return this.salarioBase;
	}
	
	public void setSalarioBase(float salarioBase)
	{
		this.salarioBase = salarioBase;
	}
}
