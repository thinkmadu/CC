; Inicializa os registradores
MOV DPTR,#TAB ; Tabela de conversão
MOV R0,#0FFH ; Contador
MOV R1,#0FFH ; Contador
MOV R2,#0FFH ; Contador

; Loop principal
MAIN:
    INC R0 ; Incrementa o contador
    CJNE R0,#100,SKIP_RESET ; Se o contador atingir 100, reseta para 0
    MOV R0,#0
SKIP_RESET:
    MOV A,R0 ; Move o valor do contador para o acumulador
    DIV AB ; Divide o valor do contador por 10
    MOV B,A ; Move o quociente para B
    MOV A,R1 ; Move o resto para A

    ; Atualiza os displays de 7 segmentos
    ACALL UPDATE_DISPLAYS

    ; Aguarda um tempo antes de atualizar novamente
    ACALL DELAY

    SJMP MAIN ; Repete o loop principal

; Atualiza os displays de 7 segmentos
UPDATE_DISPLAYS:
    MOV DPTR,#TAB ; Tabela de conversão
    MOVC A,@A+DPTR ; Converte o valor do display esquerdo
    MOV P1,A ; Atualiza o display esquerdo

    MOV A,B ; Move o valor do display direito para A
    MOVC A,@A+DPTR ; Converte o valor do display direito
    MOV P2,A ; Atualiza o display direito

    RET

; Função de atraso
DELAY:
    MOV R2,#0FFH
DELAY_LOOP:
    DJNZ R2,DELAY_LOOP
    RET

; Tabela de conversão para display de 7 segmentos
TAB: 	DB 3FH
	DB 06H
	DB 5BH
	DB 4FH
	DB 66H
	DB 6DH
	DB 7DH
	DB 07H
	DB 7FH
	DB 6FH
END