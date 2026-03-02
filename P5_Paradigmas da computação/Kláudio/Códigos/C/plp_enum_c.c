#include <stdio.h>

// Definição de um enum
enum cor {PRETO, BRANCO, CINZA};

// Definição de enum começando a partir de 1
//enum cor {PRETO = 1, BRANCO, CINZA};

// Definição de enum atribuindo valores para cada item
//enum cor {PRETO = 1, BRANCO = 3, CINZA = 5};

// Definindo um novo nome para "enum cor": "Cor"
typedef enum cor Cor;

int main()
{
	Cor c1 = PRETO;
	Cor c2 = BRANCO;
	Cor c3 = CINZA;
	printf("O valor em decimal de c1: %d\n", c1);
	printf("O valor em decimal de c2: %d\n", c2);
	printf("O valor em decimal de c3: %d\n", c3);

	// A instrução abaixo não é aceita em C
	//Cor c4 = PRETO + BRANCO;

	if(c1 == PRETO)
	{
		printf("A cor de c1 eh preto\n");
	}
	if(c1 == 0)
	{
		printf("O valor numerico da cor preta eh 0\n");
	}
}

