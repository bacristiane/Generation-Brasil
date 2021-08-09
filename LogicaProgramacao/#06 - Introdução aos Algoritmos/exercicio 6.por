programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real x1,x2,y1,y2,d
	 
		escreva ("\nX1:")
		leia (x1)
		escreva ("\nX2:")
		leia (x2)

		escreva ("\nY1:")
		leia (y1)
		escreva ("\nY2:")
		leia (y2)

		d = Matematica.raiz(Matematica.potencia((x2-x1), 2.0) + Matematica.potencia((y2-y1), 2.0), 2.0)

		escreva ("\nO valor de D é:", d)

		

		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 317; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */