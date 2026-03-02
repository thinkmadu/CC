package lingprog2;

/* Perceba que, aqui, estamos falando de Funcionario 
 * enquanto algo que a Pessoa é, não como um papel que
 * ela possui. No primeiro caso, falamos de herança. No
 * segundo caso, falamos de composição.
 */

public abstract class Funcionario extends Pessoa {
	
	private int cargaHoraria;
	// poderíamos colocar outros atributos de Funcionario
	
	public Funcionario(String nome, int cargaHoraria)
	{
		super(nome);
		this.cargaHoraria = cargaHoraria;
	}
	
	/* OBS: caso queira redefinir o get, as subclasses
	não conseguirão acessar o atributo nome se ele for
	private. O mesmo vale para os get e set dos atributos
	*/
	
	public int getCargaHoraria()
	{
		return this.cargaHoraria;
	}
	
	public void setCargaHoraria(int cargaHoraria)
	{
		if(cargaHoraria < 0)
			this.cargaHoraria = 0;
		else
			this.cargaHoraria = cargaHoraria;
	}
	
	/* calculaSalario() precisará ser redefinido nas
	 * subclasses. Como cada subclasse tem uma maneira de
	 * calcular o próprio salário, esse método idealmente
	 * é abstrato (sem implementação).
	 * 
	 */
	public abstract float calculaSalario();

}
