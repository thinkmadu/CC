package lingprog2;

public class Pessoa2 {
	
	private String nome;
	// poderíamos colocar outros atributos aqui
	
	/* Aqui, estamos dizendo que uma Pessoa possui um
	 * Papel. Na outra implementação, fizemos com que os
	 * supostos papeis herdassem de pessoa, o que pode ser
	 * um problema.
	 * 
	 * Um outro ponto interessante aqui é que podemos deixar
	 * em Papel tudo que for referente ao papel da pessoa, 
	 * isolando melhor as implementações. A pessoa em si se
	 * torna mais independente do papel dela. Qualquer adição
	 * referente ao papel dela é feita no papel e não nela.
	 * 
	 * Por fim, a classe Pessoa acessa o papel através de sua
	 * interface de serviços (no caso, os métodos públicos de 
	 * Papel). A implementação de Papel está mais solta, 
	 * independente, da implementação de Pessoa. Isso favorece
	 * um menor acoplamento entre a Pessoa e seu papel.
	 * 
	 */
	private Funcao papel;
	
	public Pessoa2(String nome, Funcao papel)
	{
		this.nome = nome;
		this.papel = papel;
	}
	
	public String getNome()
	{
		return this.nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public Funcao getPapel()
	{
		return this.papel;
	}
	
	public void setPapel(Funcao papel)
	{
		this.papel = papel;
	}
	
	public float calculaSalario()
	{
		return this.papel.calculaSalario();
	}

}
