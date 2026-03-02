#include <stdio.h>

struct aluno {
	char nome[200];
	float cra;
};

typedef struct aluno Aluno;

int main()
{
	char nome[200];
	scanf("%s", nome);
	printf("%s\n", nome);
		
	Aluno a1 = {"Francisco Anjos", 8.64};
	
	/*Perceba que há um salto de 200 no end. de um e do 
	outro. 
	
	Lembre-se que o caractere pode ser representado 
	c/ 1 byte (e.g. codificação ASCII). 
	
	Experimente trocar a posição das variáveis 
	da estrutura.
	
	Lembrete: o tamanho de uma estrutura em C não necessaria-
	mente é a soma dos tamanhos de suas variáveis.
	*/
	
	printf("O end. do nome de a1 eh %d\n", &a1.nome);
	printf("O end. do cra de a1 eh  %d\n", &a1.cra);
	printf("O end. de a1 eh %d\n", &a1);
	printf("\n\n");
}
