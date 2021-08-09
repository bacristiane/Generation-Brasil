programa
{
	inclua biblioteca Matematica -->mat
	
	
	funcao inicio()
	{
		
		inteiro idadeAno,idadeMes,idadeDias,idadeDiasA
		
		
		escreva("\nQual a sua idade (anos):")
		leia(idadeAno)

		escreva("\nQual a sua idade (mes):")
		leia(idadeMes)

		escreva("\nQual a sua idade (dia):")
		leia(idadeDias)


		idadeDiasA = (idadeAno*365)+(idadeMes*30)+idadeDias
		
		
		escreva("\nSua idade em dias é: ", idadeDiasA )

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 223; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */