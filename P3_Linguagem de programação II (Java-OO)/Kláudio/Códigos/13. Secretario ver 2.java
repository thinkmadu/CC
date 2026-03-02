package lingprog2;

public class Secretario extends Funcionario {

	// O tempo de serviço em anos completos
	private int tempoServico;
	
	private static int salarioBaseSecr = 50;
	
	public Secretario(String nome, int cargaHoraria, int tempoServico) {
		super(nome, cargaHoraria);
		this.tempoServico = tempoServico;
	}

	/* Implemente os get e set para os atributos próprios
	 * dessa classe
	*/
	
	@Override
	public float calculaSalario() {
		return this.getCargaHoraria() * salarioBaseSecr + (200 * tempoServico);
	}

}
