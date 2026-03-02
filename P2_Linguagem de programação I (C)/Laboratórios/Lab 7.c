#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int quest(){
  char nome[10];
  int i;

  printf("Digite seu nome: "); scanf("%c", &nome); fflush(stdin);
  
  for(i = 0; i < 10; i++){
    printf("%c\n", nome[i]);
  }
  return 0;
}