MOV P1, #0FFh ; Configura os pinos do P1 como entrada
MOV P3, #00h ; Configura os pinos do P3 como saída

; Loop principal
MAIN:
    MOV A, P1 ; Lê o valor do teclado
    ANL A, #0Fh ; Mascara os bits superiores
    MOV P3, A ; Acende o LED correspondente
    SJMP MAIN ; Repete o loop principal