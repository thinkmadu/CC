# Implementação de uma soma de elementos de lista

# ITERATIVA
def soma_iterativa(lista):
    soma = 0
    for elem in lista:
        soma += elem
    return soma

# RECURSIVA
def soma_recursiva(lista):
    # A condição de parada é a lista estar vazia, quando retorna 0
    if (lista == []):
        return 0
    else:
        # Há uma chamada recursiva, passando uma lista c/ um elem. a menos
        return lista[0] + soma_recursiva(lista[1:])

# UTILIZAÇÃO DE FUNÇÃO REDUCE
from functools import reduce
def soma_reduce(lista):
    return reduce(lambda x, y: x + y, lista)


# EXECUÇÃO DAS FUNÇÕES
lista = [1, 2, 3, 4, 5]
print(soma_iterativa(lista))
print(soma_recursiva(lista))
print(soma_reduce(lista))
