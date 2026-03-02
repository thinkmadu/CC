org 0h
JMP INICIO
NUMEROS:
	DB	11000000b ; numero 0
	DB	11111001b ; numero 1
	DB	10100100b ; numero 2
	DB	10110000b ; numero 3
	DB	10011001b ; numero 4
	DB	10010010b ; numero 5
	DB	10000011b ; numero 6
	DB	11111000b ; numero 7
	DB	10000000b ; numero 8
	DB 	10010000b ; numero 9

INICIO:
	mov DPTR, #NUMEROS
	mov 0h, #0
	CLR A

MOSTRAR:
	mov B, #10
	mov A, 0h
	DIV AB
	mov 1h, A
	mov 2h, B

	inc 0h

TIMER:
	mov A, 1h
	movc A, @A+DPTR
	
	mov P0, #1111b
	mov p1, A
	mov P0, #1101b

	mov A, 2h
	movc A, @A+DPTR
	
	mov P0, #1111b
	mov p1, A
	mov P0, #1110b

	mov A, 0h
	mov P0, #1111b
	
	subb A, #100
	jnz MOSTRAR

end
