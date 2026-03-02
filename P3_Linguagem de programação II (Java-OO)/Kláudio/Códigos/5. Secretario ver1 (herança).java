package lingprog2;

public class Secretario extends Funcionario {

	/* Maiores explicações estão na classe Professor. Apenas perceba aqui que
	 * tempo de serviço é um atributo próprio do secretário, bem como o salário
	 * base de secretário.
	 */
	
	private static float salarioBaseSecretario = 70;
	private int tempoDeServico;
	
	/* Observe que o cálculo de salário de um secretário é diferente do de
	 * professor. 
	 */
	@Override // não é obrigatório, porém precisa ter o mesmo nome do método e os mesmos parametros
	public float calculaSalario() {
		return this.cargaHoraria * salarioBaseSecretario + (100 * tempoDeServico);
	}

	@Override
	public float getSalarioBase() {
		return salarioBaseSecretario;
	}

	@Override
	public void setSalarioBase(float salarioBase) {
		salarioBaseSecretario = salarioBase;
		
	}

}
