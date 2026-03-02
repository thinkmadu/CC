 package lingprog2;

/* A explicação para o abstract aqui está embaixo, na parte em que definimos
 * um método abstrato dentro do código.
 */

public abstract class Funcionario {

	/* Os atributos abaixo são herdados pelas subclasses de Funcionario.
	 * O modificador de visibilidade protected indica que esses atributos
	 * podem ser acessados pela própria classe e pelas suas subclasses.
	 */
	protected String nome;
	
	/* O atributo salário base não é um valor que queremos que esteja em cada
	 * objeto, visto que eles poderiam ser distintos. A saída que vimos era
	 * fazer com que ele seja estático, mas quando utilizássemos herança, nós
	 * teríamos problemas, já que queremos que cada tipo de funcionário tenha
	 * um valor de salário base diferente, e o valor estático é único.
	 * 
	 * Uma saída seria simplesmente retirar esse atributo de salarioBase daqui,
	 * definir um método de get e set para salário base que sejam abstratos
	 * e jogar a responsabilidade para as subclasses, que definem como é o
	 * salário base de cada subtipo conforme elas queiram.
	 * 
	 * Lembre-se do princípio de encapsulamento, que faz com que detalhes de
	 * implementação possam ser "encapsulados" em métodos, por exemplo. O
	 * método getSalarioBase pode ser utilizado em outras classes, mas elas não
	 * tem os detalhes de implementação.
	 */
	//protected float salarioBase;
	
	protected int cargaHoraria;
	
	/* Poderíamos definir uma implementação aqui (e.g. CH * salarioBase),
	 * mas podemos também deixar essa implementação "em aberto". Isso pode
	 * ser interessante, por exemplo, em situações onde as implementações desse
	 * método são diferentes entre subclasses, de modo que não faça sentido
	 * existir uma implementação aqui (que seria herdada), pois essa implemen-
	 * tação seria incorreta, tendo que ser substituída.
	 * 
	 * Em orientação a objetos, podemos fazer com que um método seja abstrato.
	 * Abstrato aqui indica a ideia de que ele não é concreto, não há uma
	 * implementação concreta (apenas geral). Os métodos abstratos não
	 * possuem corpo (nota: não é que eles têm corpo vazio, com {}, e sim que
	 * não tem implementação). Nessa classe, apenas consta a assinatura do 
	 * método (visibilidade, tipo de retorno, nome e parâmetros.
	 * 
	 * Perceba também que o método abstrato tem a palavra reservada abstract
	 * e, no final, utilizamos ";".
	 * 
	 * O uso de um método abstrato nessa classe indica que objetos dessa classe
	 * não têm uma implementação totalmente concreta. Dessa maneira, a classe
	 * também será considerada abstrata, tendo na sua definição a palavra
	 * reservada abstract. No caso, não podemos criar objetos dessa classe.
	 * 
	 * Nós não podemos instanciar classes abstratas, mas essa classe continua
	 * sendo útil, pois o que é definido aqui pode ser herdado.
	 * 
	 * No caso, faz sentido ver a classe Funcionario como abstrata. Caso nós
	 * tenhamos um Funcionario, nós não sabemos exatamente o que ele faz ou
	 * como calcular o salário dele, já que não sabemos exatamente que tipo de
	 * Funcionario ele é. O próprio conceito de Funcionario, nesse caso, também
	 * é abstrato. 
	 * 
	 * Pense no seguinte: imagine que estou falando de um 
	 * Funcionario da UEPB. Apenas dizendo isso, não dá para saber o que ele
	 * faz (ele é professor? ele é secretário? ele é do setor de TI?) e, também,
	 * não dá pra saber como calcular o salário dele. A única coisa que sabemos
	 * é que ele é Funcionario.
	 * 
	 * Uma outra observação é que uma classe com método abstrato é, necessaria-
	 * mente, abstrata, mas o contrário não. Nós podemos ter classes abstratas
	 * com nenhum método abstrato. Nós podemos fazer isso pelo fato de que a
	 * classe ser abstrata indica que não podemos criar objetos dela. 
	 * 
	 */
	public abstract float calculaSalario();
	
	/* Os getters e setters podem ser herdados e utilizados nas subclasses.
	 * 
	 */
	
	public String getNome()
	{
		return this.nome;
	}
	
	public void setNome(String novoNome)
	{
		this.nome = novoNome;
	}
	
	public int getCargaHoraria()
	{
		return this.cargaHoraria;
	}
	
	public void setCargaHoraria(int novaCarga)
	{
		this.cargaHoraria = novaCarga;
	}

	// isso daqui força as classes que vão herdar a definir sua implementação
	public abstract float getSalarioBase();
	public abstract void setSalarioBase(float salarioBase);
}
