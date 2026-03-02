#include <stdio.h>

int numero1 = 10, numero2 = 12;

int main()
{
	int numero = 1;
	int *numeroPtr = &numero;
	printf("%d\n", &numero);
	printf("%d\n", numeroPtr); // ambos apontam p/ mesmo endereco
	
	
	numero = 12;
	printf("%d\n", numero);
	printf("%d\n", *numeroPtr); //numero e *numeroPtr sao aliases
}
