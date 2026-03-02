package lingprog2;

public class TesteFuncionarios {
	
	public static void main(String[] args) {
		
		/* Depois veremos com mais calma como funciona a questão dos
		 * construtores e herança.
		 */
		
		Professor p1 = new Professor();
		
		/* Perceba que posso chamar getNome() de um professor, mesmo que
		 * esse método não esteja definido em Professor. O mesmo vale para
		 * setNome()
		 */
		p1.setNome("Larissa");
		p1.setCargaHoraria(20);
		p1.setSalarioBase(80);
		System.out.println("O nome de p1 é " + p1.getNome());
		System.out.println("O salário de p1 é " + p1.calculaSalario());
		
	}

}
