package lingprog2;

public class TestaClasses1 {
	
	public static void main(String[] args) {
		
		/* Aqui, existe a compreensão de que o objeto
		 * é um Professor. Professor é algo que ele é, e 
		 * não algo que representa um papel que ele tem.
		 * 
		 */
		Pessoa p = new Professor("Laura", 20);
		
		/* Nós tivemos que definir calculaSalario, mesmo
		 * que de forma abstrata, em Pessoa. Assim, pode-
		 * mos utilizar aqui. 
		 */
		System.out.println(p.calculaSalario());
		
		/* Aqui, estamos na verdade criando um novo objeto
		 * e atribuindo à variável f. Não estamos em si
		 * mudando a implementação.
		 */
		
		p = new Secretario("Laura", 20, 2);
		System.out.println(p.calculaSalario());
		
		/* A linha abaixo gerará um erro de execução.
		 * 
		 */
		p = (Professor) p;
		
	}

}
