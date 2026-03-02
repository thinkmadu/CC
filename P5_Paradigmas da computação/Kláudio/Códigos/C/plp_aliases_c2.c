#include <stdio.h>

struct ponto{
	float posX;
	float posY;
};

int main()
{
	// Criando duas estruturas. A 2ª recebe os valores da 1ª
	struct ponto p1 = {4.0, 2.0};
	struct ponto p2 = p1;
	
	// Perceba que p1 e p2 não são aliases (apelidos)
	printf("Endereco de memoria de p1: %d\n", &p1);
	printf("Endereco de memoria de p2: %d\n", &p2);
	
	// O endereço de p1 é o endereço da sua primeira variável
	printf("Endereco de memoria da 1a var. de p1: %d\n", &p1.posX);
	
	// Alterando o valor de posX de p1 (p/ ver se muda p2 também)
	p1.posX = 2.0;
	
	/* Perceba que a mudança não afetou p2, que recebeu os valores
	   de p1. 
	*/
	printf("Os valores x de p1 e p2: %.2f %.2f\n", p1.posX, p2.posX);
	
	
	
	
}
