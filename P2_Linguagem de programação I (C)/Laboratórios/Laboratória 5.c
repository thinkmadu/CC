#include <stdio.h>
#include<locale.h>

int main()
{   setlocale(LC_ALL, "Portuguese");
  // Exercício 1: Faça um programa que leia 5 números e informe a soma dos números.
  int contador = 1, soma = 0, num = 0;
  while(contador <= 5){
    printf("Digite um número: ");
    scanf("%d", &num);
    soma = (soma + num);
    ++contador;
  }
  printf("A soma dos números é %d", soma);
  

  // Exercício 2: Faça um programa que calcule a média aritmética de um número determinado de números, por exemplo:
  // int analises = 0, loop = 0;
  // float nota = 0, soma = 0, media = 0;
  // printf("Quantos números vão ser analisados? ");
  // scanf("%d", &analises);

  // while(loop != analises){
  //   printf("Digite a nota: ");
  //   scanf("%f", &nota);
  //   soma += nota;
  //   ++loop;
  // }
  // media = soma / analises;
  // printf("A média desse aluno é %.2f", media);

  // Exercício 3: Reescreva a solução do exercício 2 utilizando for.

  // int analises = 0, loop = 0;
  // float nota = 0, soma = 0, media;
  // printf("Quantos números vão ser analisados? ");
  // scanf("%d", &analises);

  //  for (int loop = 0; analises != loop; ++loop){
  //   printf("Digite a nota: ");
  //   scanf("%f", &nota);
  //   soma = soma + nota;
  // }
  // media = soma / analises;
  // printf("A média do aluno é %2.f", media);

  // Exercício 4: Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Exemplo: 5! = 5.4.3.2.1 = 120.

  // int fat, n;
  // printf("Digite o numero a ser fatorado: ");
  // scanf("%d", &n);

  // for(fat = 1; n > 1; n = n - 1){
  //   fat = fat * n;
  // }

  // printf("\n%d", fat);

  // Exercício 5: Reescreva novamente a solução do exercício 2 utilizando do-while.
  // int analises = 0, loop = 0;
  // float nota = 0, soma = 0, media = 0;
  // printf("Quantos números vão ser analisados? ");
  // scanf("%d", &analises);

  // do {
  //   printf("Digite a nota: ");
  //   scanf("%f", &nota);
  //   soma += nota;
  //   ++loop;
  // }
  // while(loop != analises);

  // media = soma / analises;
  // printf("A média desse aluno é %.2f", media);

  // Exercício 6: Replique os dois códigos anteriores invertendo a ordem da função printf e do bloco if para avaliar o efeito das palavras break e continue.

  // for (int contador = 1; contador <= 5; ++contador) {
  //   if (contador == 3)
  //   break;
  //   printf("%d ", contador);
  // }
  // puts("");

  // for (int contador = 1; contador <= 5; ++contador) {
  // printf("%d ", contador);

  // if (contador == 3)
  //   continue;
  // }
  // puts("");

  // Desafio 1: Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao segundo número. Forneça várias soluções utilizando dos três laços que você aprendeu, mas não utilize a função de potência da linguagem.

  // int base, expoente = 1, potencia = 1, contador = 0;

  // printf("Digite a base e o expoente (separados por espaço): ");
  // scanf("%d%d", &base, &expoente);

  // com while:
  // while (contador != expoente){
  //     potencia = potencia * base;
  //     contador += 1;
  // }
  // printf("%d", potencia);

  //com for:
  // for(int contador = 1; contador <= expoente; contador++){
  //     potencia = potencia * base;
  // }
  // printf("%d", potencia);

  //com do-while:
  // do{
  //     potencia = potencia * base;
  //     contador += 1;
  // }
  // while(contador != expoente);
  // printf("%d", potencia);
  return 0;
}