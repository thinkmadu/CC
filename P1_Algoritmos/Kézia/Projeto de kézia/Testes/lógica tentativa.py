# MOVE = movimento
# MAKE MOVE = movimentar
# PLAY = jogar
# THIS = con_lin
# THIS_N = todosNum
# THIS_N_SUN = somaTodosNuml
# NEW_N = numNovo
# NEW_THIS = novas_ConLin
# SKIP = pular
# GET.NUMS = juntarNumeros
# FLIPPED = invertido
# FREE_POSS = posicaoLivre
# POS = posicao

import numpy as np
import random

n = 4

class LogProjeto2048:
    # função pra iniciar a grade e colocar os zeros
    def __init__(self):
        self.grid =  np.zeros((n,n), dtype=int)


    # função pra mostrar como tá a grade
    def __str__(self):
        return str(self.grid)

    
    # função pra adicionar o novo número aleatóriamente
    def numNovo(self, k = 1):
        posicaoLivre = list(zip(*np.where(self.grid == 0)))

        for posicao in random.sample(posicaoLivre, k = k):
            if random.random() < .1:
                self.grid[posicao] = 4
            else:
                self.grid[posicao] = 2




    @staticmethod
    def juntarNumeros (con_lin):
        todosNum = con_lin[con_lin != 0]
        somaTodosNum = []
        pular = False

        for j in range(len(todosNum)):
            if pular:
                pular = False
                continue
            if j != len(todosNum) - 1 and todosNum[j] == todosNum[j + 1]:
                numNovo = todosNum * 2 
                pular = True
            else:
                numNovo = todosNum[j]

            somaTodosNum.append(numNovo)
        return np.array(somaTodosNum)



    # função para os movimentos do jogo
    #MAKE MOVE
    def movimentar(self, movimento):
        for i in range(n):
            if movimento in 'lr': # esse if vai checar se é left ou right (direito ou esquerda)
                con_lin = self.grid[i, :]

            else: # pros movimentos de up e down
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




    # função pra inicializar o jogo
    # PLAY
    def jogar(self):
        self.numNovo(k = 2)
        while True:
            print(self.grid)
            comando = input()

            if comando == 'esc':
                break
            self.movimentar(comando)



if __name__ == '__main__':
    jogo = LogProjeto2048()
    jogo.jogar()