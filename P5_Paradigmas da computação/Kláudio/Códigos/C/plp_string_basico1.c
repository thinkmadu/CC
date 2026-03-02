// Esse script utiliza algumas funções básicas de string em C
#include <stdio.h>
#include <string.h>


char string[100];

int main()
{
	// Não é possível fazer atribuição com string = "Stella"
	// Uma opção é copiar o conteúdo de uma string p/ outra
	// A função que faz isso é a strcpy, de string.h
	strcpy(string, "Stella"); 
	
	// strlen(s) retorna o tamanho de s (sem o '\0')
	printf("O tamanho da string eh: %d\n", strlen(string));
	
	// Modificando um caractere da string
	string[5] = 'e';
	printf("A palavra apos alteracao eh %s\n", string);
	
	// Alterando string para uma nova string
	strcpy(string, "Klaus");
	printf("O novo tamanho da string eh: %d\n", strlen(string));
	
}
