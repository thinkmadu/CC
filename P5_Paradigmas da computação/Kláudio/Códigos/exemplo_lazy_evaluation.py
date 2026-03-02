import sys

lista_lazy = range(1, 20, 2)
lista_lazy2 = range(1, 1000, 2)

print(lista_lazy)
lista_total = [i for i in range(1, 20, 2)]
print(lista_total)

print()

print("Comparando duas listas: uma lazy e uma completa")
print(sys.getsizeof(lista_lazy))
print(sys.getsizeof(lista_total))

print()

print("Comparando duas listas de tamanhos diferentes com lazy")
print(sys.getsizeof(lista_lazy))
print(sys.getsizeof(lista_lazy2))
