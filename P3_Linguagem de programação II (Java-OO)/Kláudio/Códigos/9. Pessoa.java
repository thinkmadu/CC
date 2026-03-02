package lingprog2;

public abstract class Pessoa {

	private String nome;
	// poderíamos colocar outros atributos aqui
	
	public Pessoa(String nome)
	{
		this.nome = nome;
	}
	
	public String getNome()
	{
		return this.nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public abstract float calculaSalario();
	
}
