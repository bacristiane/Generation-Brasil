programa
{
	
	funcao inicio()
	{
		inteiro h,min,seg,segTotais

		escreva("\nSegundos totais?")
		leia (segTotais)

		h = segTotais/3600
		min = (segTotais%3600)/60
		seg = (segTotais%3600)%60
 		
 		
		escreva("\nO tempo de duração é de: ", h, " hora(s), ", min, " minuto(s) e ", seg, " segundo(s)"  )
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 85; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */