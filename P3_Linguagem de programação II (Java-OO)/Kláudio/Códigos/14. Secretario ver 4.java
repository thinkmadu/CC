package lingprog2;

public class Secretario2 extends Funcao{
	
	// O tempo de serviço em anos completos
		private int tempoServico;
		
		private static int salarioBaseSecr = 50;
		
		public Secretario2(int cargaHoraria, int tempoServico) {
			// não precisa de nome; atributo é da pessoa
			super(cargaHoraria);
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
