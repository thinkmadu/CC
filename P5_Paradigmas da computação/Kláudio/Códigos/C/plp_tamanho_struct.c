#include <stdio.h>

int main()
{	
	// Encontrando tamanhos de ponteiros para tipos diferentes	
	printf("Tamanho de int: %d bytes\n", sizeof(int));
	printf("Tamanho de float: %d bytes\n", sizeof(float));
	printf("Tamanho de long: %d bytes\n", sizeof(long));
	printf("Tamanho de double: %d bytes\n", sizeof(double));
	printf("Tamanho de char: %d bytes\n", sizeof(char));
	printf("\n");
	
	printf("Tamanho de ptr. p/ int: %d bytes\n", sizeof(int*));
	printf("Tamanho de ptr. p/ float: %d bytes\n", sizeof(float*));
	printf("Tamanho de ptr. p/ long: %d bytes\n", sizeof(long*));
	printf("Tamanho de ptr. p/ double: %d bytes\n", sizeof(double*));
	printf("Tamanho de ptr. p/ char: %d bytes\n", sizeof(char*));
	printf("\n");
}
