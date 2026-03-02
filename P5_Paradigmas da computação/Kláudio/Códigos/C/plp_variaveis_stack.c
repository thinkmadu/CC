#include <stdio.h>

// Exemplo de código de variáveis em pilha (stack)
int fatorial(int n)
{
	int f;
	// Observe que as posições de memória serão distintas
	printf("Local de mem. da variavel f: %d\n", &f);
	if(n == 1)
		f = 1;
	else
		f = n * fatorial(n - 1);
	return f;
}

int main()
{
	printf("%d\n", fatorial(5));
	
}
