ORG	00H
MOV 	P1,#0FFH ;entrada
MOV	P2,#00h	;saída

MAIN: MOV 	A, P1
      MOV 	P2,A
      SJMP 	MAIN
END

; esse código serve para ao pressionar um botão do simple keypad, ele acender um led