package lingprog2;

public class TestaClasses2 {
	
	public static void main(String[] args) {
		// Essa implementação separa a pessoa do papel que ela tem
		Pessoa2 p = new Pessoa2("Laura", new Professor2(20));
		System.out.println(p.calculaSalario());
		
		// Aqui, mudamos o papel da pessoa, mas o objeto Pessoa é o mesmo
		p.setPapel(new Secretario2(20, 2));
		System.out.println(p.calculaSalario());
		
		
	}

}
