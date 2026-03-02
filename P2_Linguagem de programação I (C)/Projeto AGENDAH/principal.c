// GRUPO: JOHNATAN RODRIGUES, LÍVIA NASCIMENTO, MARIA EDUARDA.
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>

struct agenda {
  int dia;
  int mes;
  char tarefa[100];
  char titulo[10];
  int status;
  char codigo[3];
};

int valida_data(int dia, int mes) {
  if ((dia >= 1 && dia <= 31) && (mes >= 1 && mes <= 12)) {
    if (dia == 28 && mes == 2) {
      return 0;
    }

    else {
      if ((dia <= 30) && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
        return 0;
      } else {
        if ((dia <= 31) && (mes == 1 || mes == 3 || mes == 5 || mes == 7 ||
                            mes == 8 || mes == 10 || mes == 12)) {
          return 0;
        } else {
          return 1;
        }
      }
    }
  } else {
    return 1;
  }
}

int main(void) {
  int op, indice = 0, i, j, valida;
  char codbusca[3];
  struct agenda ficha[indice];

  do {
    printf("\n ??????  ??????? ????????????   ??????????  ?????? \n"
           "???????????????? ?????????????  ???????????????????\n"
           "???????????  ??????????  ?????? ??????  ???????????\n"
           "???????????   ?????????  ?????????????  ???????????\n"
           "???  ??????????????????????? ?????????????????  ???\n"
           "???  ??? ??????? ???????????  ???????????? ???  ??? ®2022\n");
    printf("\n??????????????????????? MENU ????????????????????????\n"
           "?                                                   ?\n"
           "?               [1]    CRIAR                        ?\n"
           "?                                                   ?\n"
           "?               [2]    EDITAR                       ?\n"
           "?                                                   ?\n"
           "?               [3]    EXCLUIR                      ?\n"
           "?                                                   ?\n"
           "?               [4] TODAS AS TAREFAS                ?\n"
           "?                                                   ?\n"
           "?????????????????????????????????????????????????????\n");
    scanf("%d", &op);
    system("clear");

    switch (op) {
    case 1:
      printf("Informe o dia: ");
      scanf("%d", &ficha[indice].dia);
      printf("Informe o mês: ");
      scanf("%d", &ficha[indice].mes);
      valida = valida_data(ficha[indice].dia, ficha[indice].mes);

      if (valida == 0) {
        printf("Informe o título da tarefa: ");
        scanf("%s", ficha[indice].titulo);
        printf("Informe a tarefa: ");
        scanf("%s", ficha[indice].tarefa);
        printf("[1]  CONCLUIDA\n"
               "[2]  EM ANDAMENTO\n"
               "[3]  A INICIAR\n");
        printf("Informe o status da tarefa: ");
        scanf("%d", &ficha[indice].status);

        if (ficha[indice].status < 1 || ficha[indice].status > 3) {
          printf("STATUS INVÁLIDO");
          break;
        }
        do {
          printf("Digite um código de três digítos para sua tarefa: ");
          scanf("%s", ficha[indice].codigo);
        } while (strlen(ficha[indice].codigo) < 3 &&
                 strlen(ficha[indice].codigo) > 0);
      } else {
        printf("DATA INVÁLIDA");
        printf("\nPressione qualquer tecla . . .");
        getchar();
        scanf("c\n");
        break;
      }

      indice++;
      printf("\nPressione qualquer tecla . . .");
      getchar();
      scanf("c\n");
      break;

    case 2:
      printf("????????? EDITAR TAREFAS ?????????\n");
      printf("Informe o codigo da tarefa que editar: ");
      scanf("%s", codbusca);
      i = 0;
      int acha = 0;
      do {
        if (strcmp(ficha[i].codigo, codbusca) == 0) {
          printf("%s\n%s\n%d\n%s\n", ficha[i].titulo, ficha[i].tarefa,
                 ficha[i].status, ficha[i].codigo);
          acha = 1;
        }

        else {
          i++;
        }
      } while (i < indice && acha == 0);

      if (acha == 1) {
        int editarStatus;
        system("clear");
        printf("O QUE DESEJA EDITAR?\n"
               "[1] Dia\n"
               "[2] Mês\n"
               "[3] Título\n"
               "[4] Conteúdo da tarefa\n"
               "[5] Status\n"
               "[6] Tudo\n");
        scanf("\n%d", &editarStatus);

        switch (editarStatus) {
        case 1:
          system("clear");
          printf("????????? EDITAR TAREFAS ?????????\n");
          printf("Informe o dia: ");
          scanf("%d", &ficha[i].dia);
          break;

        case 2:
          system("clear");
          printf("????????? EDITAR TAREFAS ?????????\n");
          printf("Informe o mês: ");
          scanf("%d", &ficha[i].mes);
          break;

        case 3:
          system("clear");
          printf("????????? EDITAR TAREFAS ?????????\n");
          printf("Informe o título: ");
          scanf("%s", ficha[i].titulo);
          break;

        case 4:
          system("clear");
          printf("????????? EDITAR TAREFAS ?????????\n");
          printf("Informe a tarefa: ");
          scanf("%s", ficha[i].tarefa);
          break;

        case 5:
          system("clear");
          printf("????????? EDITAR TAREFAS ?????????\n");
          printf("[1]  CONCLUIDA\n"
                 "[2]  EM ANDAMENTO\n"
                 "[3]  A INICIAR\n");
          printf("Informe o status da tarefa: ");
          scanf("%d", &ficha[indice].status);

          if (ficha[indice].status < 1 || ficha[indice].status > 3) {
            printf("STATUS INVÁLIDO");
            break;
          }
          break;

        case 6:
          printf("????????? EDITAR TAREFAS ?????????\n");
          printf("Informe o dia: ");
          scanf("%d", &ficha[i].dia);
          printf("Informe o mês: ");
          scanf("%d", &ficha[i].mes);
          valida = valida_data(ficha[i].dia, ficha[i].mes);

          if (valida == 0) {
            printf("Informe o título da tarefa: ");
            scanf("%s", ficha[i].titulo);
            printf("Informe a tarefa: ");
            scanf("%s", ficha[i].tarefa);
            printf("[1]  CONCLUIDA\n"
                   "[2]  EM ANDAMENTO\n"
                   "[3]  A INICIAR\n");
            printf("Informe o status da tarefa: ");
            scanf("%d", &ficha[i].status);

            if (ficha[i].status < 1 || ficha[i].status > 3) {
              printf("STATUS INVÁLIDO");
              break;
            }
            do {
              printf("Digite um código de três digítos para sua tarefa: ");
              scanf("%s", ficha[i].codigo);
            } while (strlen(ficha[i].codigo) < 3 &&
                     strlen(ficha[i].codigo) > 0);
            break;
          } else {
            printf("Data inválida");
            printf("\nPressione qualquer tecla . . .");
            getchar();
            scanf("c\n");

            break;
          }
        }
      } else {
        printf("\nRegistro não encontrado\n");
      }
      printf("\nPressione qualquer tecla . . .");
      getchar();
      scanf("c\n");
      break;
      
    case 3:
      printf("????????? EXCLUIR TAREFAS ?????????\n");
      printf("Informe o codigo da tarefa que deseja excluir: ");
      scanf("%s", codbusca);
      i = 0;
      int acha2 = 0;
      do {
        if (strcmp(ficha[i].codigo, codbusca) == 0) {
          printf("%s\n%s\n%d\n%s\n", ficha[i].titulo, ficha[i].tarefa,
                 ficha[i].status, ficha[i].codigo);
          acha2 = 1;
        }

        else {
          i++;
        }
      } while (i < indice && acha == 0);

      if (acha2 == 1) {
        strcpy(ficha[i].codigo, ficha[i + 1].codigo);
        strcpy(ficha[i].titulo, ficha[i + 1].titulo);
        strcpy(ficha[i].tarefa, ficha[i + 1].tarefa);
        ficha[i].dia = ficha[i + 1].dia;
        ficha[i].mes = ficha[i + 1].mes;
        ficha[i].status = ficha[i + 1].status;
        indice--;
      }
      break;

    case 4:
      printf("????????? LISTAR TODAS AS TAREFAS ?????????\n");
      for (i = 0; i < indice; i++) {
        printf("TÍTULO: %s\n", ficha[i].titulo);
        printf("DATA: %d/%d\n", ficha[i].dia, ficha[i].mes);
        if (ficha[i].status == 1) {
          printf("STATUS: CONCLUIDA\n");
        } else if (ficha[i].status == 2) {
          printf("STATUS: EM ANDAMENTO\n");
        } else if (ficha[i].status == 3) {
          printf("STATUS: A INICIAR\n");
        }
        printf("Tarefa: %s\n", ficha[i].tarefa);
        printf("Código da tarefa: %s", ficha[i].codigo);
        printf("\n???????????????????????????????????????????\n");
      }

      printf("\nPressione qualquer tecla . . .");
      getchar();
      scanf("c\n");
      break;
    }
    system("clear");
  } while (op >= 1 && op <= 4);
  printf("P R O G R A M A   E N C E R R A D O . . .");
  return 0;
}
