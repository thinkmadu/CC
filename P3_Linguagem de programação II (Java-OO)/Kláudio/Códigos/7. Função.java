package lingprog2;


/* Esse código contém implementações comuns a diferentes tipos de 
 * função. Do jeito que está, pouco código é de fato reaproveitado.
 * Você poderia considerar, inclusive, a possibilidade de utilizar
 * interfaces nesse caso.
 * 
 * Por outro lado, é bem verdade que esse código está bem simples.
 * Podemos pensar em vários outros métodos que poderiam ser escritos.
 * Se esses métodos fossem escritos de um modo que possam ser reaproveitados
 * por subclasses, sem necessidade de overriding, então poderíamos
 * estabelecer o uso de herança.
 */
public abstract class Funcao {
	
	private int cargaHoraria;
	// poderíamos colocar outros atributos de Funcionario
	
	public Funcao(int cargaHoraria)
	{
		// não tem nome; o nome é da pessoa
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
