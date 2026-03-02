import numpy as np
import random

n = 4 # print(int(input('Qual o tamanho da grade? ')))

class logProjeto2048:
    def __init__(self):                             # essa função cria uma matriz e preenche ela de 0
        self.grid = np.zeros((n, n), dtype=int)


    def __str__(self):                              # função pra printar a grade conforme o jogo vai indo
        return str(self.grid)


    def numNovo(self, k = 1):                         # função pra adicionar os 2, 4 conforme o jogo avança
        posicaoLivre = list(zip(*np.where(self.grid == 0)))

        for posicao in random.sample(posicaoLivre, k = k):
            if random.random() < .1:
                self.grid[posicao] = 4
            else:
                self.grid[posicao] = 2



    @staticmethod
    def juntarNumeros(con_lin):                     # função que junta o valor dos números quando eles se encontram
        todosNum = con_lin[con_lin != 0]
        somaTodosNum = []
        pular = False
        
        for j in range(len(todosNum)):
            if pular:
                pular = False
                continue
            if j != len(todosNum) - 1 and todosNum[j] == todosNum[j+1]:
                numNovo = todosNum[j] * 2
                pular = True
            else:
                numNovo = todosNum[j]

            somaTodosNum.append(numNovo)
        return np.array(somaTodosNum)


    def movimentar(self, movimento):                # função para a realização dos movimentos
        for i in range(n):
            if movimento in 'lr':                   # direita e esquerda
                con_lin = self.grid[i, :]
            else:                                   # aqui é para os movimentos de up e down
                con_lin = self.grid[:, i]

            invertido = False

            if movimento in 'rd': 
                invertido = True
                con_lin = con_lin[::-1]

            todosNum = self.juntarNumeros(con_lin)
            novas_ConLin = np.zeros_like(con_lin)
            novas_ConLin[:len(todosNum)] = todosNum

            if invertido:
                novas_ConLin = novas_ConLin[::-1]
            if movimento in 'lr':
                self.grid[i, :] = novas_ConLin
            else:
                self.grid[:, i] = novas_ConLin


    def jogar(self):                                # função responsavel pela inicialização do jogo
        self.numNovo(k = 2)

        while True:
            print(self.grid)
            comando = input()

            if comando == 'sair':
                break
            
            old_grid = self.grid.copy()
            self.movimentar(comando)

            if all((self.grid == old_grid).flatten()):
                continue
            self.numNovo()


if __name__ == '__main__':
    game = logProjeto2048()
    game.jogar()