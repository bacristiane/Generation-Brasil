programa
{
	
	funcao inicio()
	{
		inteiro ano,mes,dias,diasVivido

		escreva("\nDias totais vividos?")
		leia (diasVivido)

		ano = diasVivido/365
		mes = (diasVivido%365)/30
		dias = (diasVivido%365)%30
 		
 		
 		escreva("\nSua idade é de: ", ano, " ano(s), ", mes, " mes(es) e ", dias, " dia(s)"  )
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 204; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */