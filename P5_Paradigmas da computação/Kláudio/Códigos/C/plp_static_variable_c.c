#include <stdio.h>

void f()
{
	// Execute assim e, depois, execute sem o "static"
	// Perceba a diferença nos resultados e endereços de memória	
	static int x = 0;
	printf("Posicao de x no loop atual: %d\n", &x);
	x++;
	printf("Valor de x no loop atual: %d\n", x);
}
int main()
{
	
	for(int i = 0; i < 10; i++){
		f();
		printf("\n");
	}
	
}
                                          
