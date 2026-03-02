// Importação de Scanner (que utilizaremos para ler da entrada padrão)
import java.util.Scanner;

// O nome de classe começa com letra maiúscula
// Caso tenha mais de uma palavra, começar cada uma com maiúscula
// Palavras juntas (sem underline)
// O nome da classe igual ao nome do .java

public class ClasseDeExemplo {
	
	// Quando formos rodar o programa (Run), executaremos o main
	
	public static void main(String[] args)
	{
		// Descomente aqui o exemplo que você deseja executar
		
		//ExemploScanner1();
		//ExemploScanner2();
		//ExemploMedia1();
		//ExemploMedia2();
		//ExemploComparadores();
		
	}
	
	public static void ExemploScanner1()
	{
		// Criando um objeto do tipo Scanner
		Scanner sc = new Scanner(System.in);
		
		// Exibindo mensagens na saída padrão
		System.out.println("Digite um nome: ");
		
		// Capturando a próxima palavra lida
		String nome1 = sc.next();
		
		// printf funciona de forma bastante similar ao printf de C
		System.out.printf("O nome informado é: %s", nome1);
	}
	
	public static void ExemploScanner2()
	{
		
		// CRIAÇÃO DE OBJETOS (new)
		// Veremos melhor mais adiante como o new funciona
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome completo: ");
		
		// NOMES DE VARIÁVEIS EM JAVA
		// Primeiro nome minúsculo, os demais começando com maiúsculo
		
		// LEITURA DE LINHA (nextLine)
		
		String nomeCompleto = sc.nextLine();
		System.out.println("O nome completo é: " + nomeCompleto);
		
		// LEITURA DE STRINGS SEPARADAS POR ESPAÇO (next)
		// \n é quebra de linha
		
		System.out.println("\nDigite um nome e sobrenome: (sep. por espaço)");
		String nome = sc.next();
		String sobrenome = sc.next();
		System.out.printf("O nome informado é: %s\n", nome);
		System.out.printf("O sobrenome informado é: %s\n", sobrenome);
		
		// LEITURA DE INTEIROS (nextInt)
		
		System.out.printf("\nDigite a idade de %s %s\n", nome, sobrenome);
		int idade = sc.nextInt();
		System.out.printf("A idade de %s %s é %d", nome, sobrenome, idade);
	}
	
	public static void ExemploComentarios()
	{
		//Comentário de uma linha
		//Imprime "olar" e quebra a linha
		//System.out.println("olar");
				
		/*Comentário de mais de uma linha
		  Bloco de comentários
		*/
				
		/**Comentário Javadoc (veremos mais adiante)
		 * 
		 */
	}
	
	public static void ExemploMedia1()
	{
		int nota1 = 10;
		int nota2 = 7;
		System.out.println("A média é:");
				
		// Conversão de tipos (testem sem o (float)
		// Erros sintáticos e semânticos (significado)
		// Sem o float, média é calculada errado
		// O erro é semântico (sendo sintático, programa nem compilaria)
		
		// (float) antes de nota1 a converte em float
				
		System.out.println(( (float) nota1 + nota2) / 2);		
		
		// A instrução abaixo gera um erro (descomente para ver)
		//System.out.printf("A média é %.2f", (nota1+nota2)/2);
		
		
	}
	
	public static void ExemploMedia2()
	{
		// Exemplo de conversão implícita (sem o (float))
		float nota1 = 10; //"10" é int, mas é convertido em float
		int nota2 = 7;
		System.out.println(( nota1 + nota2) / 2);
	}
	
	public static void ExemploComparadores()
	{
		System.out.println(20 == 20);
		System.out.println(20 % 2 > 1);
		System.out.println(1 != 21 % 2);
	}

}
