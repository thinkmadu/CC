ORG 00h ; Reset
SJMP INICIO ; Salta para início do programa

ORG 	30H ; Endereço do início do programa
INICIO: MOV 	R0,#30h ;endereço base do vetor
        MOV 	R3,#00

SALTO1: MOV 	A,@R0 ;Leitura da posição do vetor 
        MOV 	B,A ;endereçamento de registradores
        MOV 	A,R3 ;endereçamento direto e de registrador
        CLR C   ;limpando o bit de carry
        SUBB 	A,B ;realiza um subtração do valor de B e o seu bit de carry do valor armazendo em A
        JNC 	SALT02 ;Teste para ver se é maior
        MOV 	R3,B ;Maior recebe valor

SALT02: INC 	R0 ;Incrementa ponteiro
        MOV 	B,R0 ;endereçamento direto e de registrador
        MOV 	A,#40h ;Endereço de fim do vetor
        CLR C   ;limpando o bit de carry
        SUBB 	A,B ;realiza um subtração do valor de B e o seu bit de carry do valor armazendo em A
        JNC 	SALTO1 ;Teste de fim do vetor
        SJMP 	$ ;Fim do programa | ele acaba entrando em um loop infinito
 END