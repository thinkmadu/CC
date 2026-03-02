ORG 	00H ;pseudo-instrução que indica o início do programa
LJMP 	INICIO ;realiza um pulo de memória para o label INICIO

ORG 	30H
INICIO: MOV 	SP,#2FH ;endereçamento de registrador e imediato.
 	MOV 	A,#01H ;endereçamento de registrador e imediato.

V1: 	MOV 	P1,A ;endereçamento direto.
 	MOV 	R0,#10 ;endereçamento de registrador e imediato.

V3: 	MOV 	R1,#3 ;endereçamento de registrador e imediato.
 	DJNZ 	R1,$
 	DJNZ 	R0,V3
 	RL 	A
 	LJMP 	V1
END ;pseudo-instrução que indica o fim do programa
