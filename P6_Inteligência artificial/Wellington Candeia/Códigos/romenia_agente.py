''' Importa a classe PriorityQueue do módulo queue. 
Uma fila de prioridade é uma estrutura de dados que mantém uma coleção de elementos ordenados por prioridade, 
onde o elemento com a prioridade mais alta é sempre o próximo a ser removido.'''

from queue import PriorityQueue

def a_star(graph, start, end, heuristic):
    '''Criando uma instância da fila de prioridade. 
    Esta fila será usada para manter os nós a serem explorados 
    durante a execução do algoritmo A*.'''
    queue = PriorityQueue()

    '''Inicializamos a fila de prioridade com uma tupla contendo o 
    custo atual (que é 0, já que estamos começando do nó inicial) e o nó de partida. 
    Este nó de partida é adicionado à fila com prioridade 0, indicando que é o 
    próximo nó a ser explorado.'''
    queue.put((0, start))
    
    '''Este dicionário mantém o custo acumulado de 
    chegar a cada nó a partir do nó de partida. Inicialmente, 
    o custo para alcançar o nó de partida é 0.'''
    costs = {start: 0}

    '''Este dicionário mantém o caminho percorrido até cada nó. 
    Inicialmente, o caminho para o nó de partida é nulo.'''
    path = {start: None}

    '''Este é o laço principal do algoritmo. 
    Continuaremos a explorar os nós até que a fila de prioridade esteja vazia, 
    o que significa que todos os nós alcançáveis foram explorados ou 
    que encontramos o nó de destino.'''
    while not queue.empty():
        
        '''Obtemos o próximo nó a ser explorado da fila de prioridade. 
        Isso nos fornece o custo acumulado até este nó e o próprio nó.'''
        (cost, current) = queue.get()

        '''Verificamos se o nó atual é o nó de destino. Se for, terminamos o laço, 
        pois encontramos o caminho até o destino.'''
        if current == end:
            break

        '''No restante do código dentro do while, exploramos os vizinhos do nó atual, 
        atualizando os custos acumulados e as prioridades na fila de prioridade conforme necessário, 
        de acordo com o algoritmo A*.'''
        for neighbor in graph[current]:
            new_cost = costs[current] + graph[current][neighbor]
            if neighbor not in costs or new_cost < costs[neighbor]:
                costs[neighbor] = new_cost
                priority = new_cost + heuristic[neighbor]
                queue.put((priority, neighbor))
                path[neighbor] = current

    '''Após a conclusão do algoritmo, retornamos os dicionários path e costs, 
    que contêm as informações do caminho encontrado e os custos associados a cada nó.'''
    return path, costs

def reconstruct_path(path, start, end):
    current = end
    path_total = [current]
    while current != start:
        current = path[current]
        path_total.append(current)
    path_total.reverse()
    return path_total

graph = {
    'Arad': {'Zerind': 75, 'Timisoara': 118, 'Sibiu': 140},
    'Mehadia': {'Lugoj': 70, 'Drobeta': 75},
    'Bucharest': {'Urziceni': 85, 'Pitesti': 101, 'Giurgiu': 90, 'Fagaras': 211},
    'Neamt': {'Iasi': 87},
    'Craiova': {'Rimnicu Vilcea': 146, 'Pitesti': 138, 'Drobeta': 120},
    'Oradea': {'Zerind': 71, 'Sibiu': 151},
    'Drobeta': {'Mehadia': 75, 'Craiova': 120},
    'Pitesti': {'Rimnicu Vilcea': 97, 'Craiova': 138, 'Bucharest': 101},
    'Eforie': {'Hirsova': 86},
    'Rimnicu Vilcea': {'Pitesti': 97, 'Craiova': 146, 'Sibiu': 80},
    'Fagaras': {'Sibiu': 99, 'Bucharest': 211},
    'Sibiu': {'Oradea': 151, 'Fagaras': 99, 'Arad': 140, 'Rimnicu Vilcea': 80},
    'Giurgiu': {'Bucharest': 90},
    'Timisoara': {'Arad': 118, 'Lugoj': 111},
    'Hirsova': {'Eforie': 86, 'Urziceni': 98},
    'Urziceni': {'Hirsova': 98, 'Vaslui': 142, 'Bucharest': 85},
    'Iasi': {'Vaslui': 92, 'Neamt': 87},
    'Vaslui': {'Iasi': 92, 'Urziceni': 142},
    'Lugoj': {'Timisoara': 111, 'Mehadia': 70},
    'Zerind': {'Oradea': 71, 'Arad': 75}
}

heuristic = {
    'Arad': 366, 
    'Bucharest': 0,
    'Mehadia': 241,
    'Neamt': 234, 
    'Craiova': 160,
    'Oradea': 380, 
    'Drobeta': 242, 
    'Pitesti': 100, 
    'Eforie': 161, 
    'Rimnicu Vilcea': 193,
    'Fagaras': 176,
    'Sibiu': 253, 
    'Giurgiu': 77, 
    'Timisoara': 329,
    'Iasi': 226,
    'Vaslui': 199,
    'Lugoj': 244,
    'Zerind': 374,
    'Hirsova': 151,
    'Urziceni': 80
}

path, costs = a_star(graph, 'Lugoj', 'Bucharest', heuristic)
route = reconstruct_path(path, 'Lugoj', 'Bucharest')

print('Rota: ', ' -> '.join(route))
print('Custo total: ', costs['Bucharest'])
