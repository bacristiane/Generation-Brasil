programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro matriz[3][3],linha,coluna,somaMatriz = 0, somaDiag = 0

		para(linha=0;linha<3;linha++)
		{
			para(coluna=0;coluna<3;coluna++)
			{
				escreva ("\nDigite um valor: ")
				leia (matriz[linha][coluna])

				somaMatriz = matriz[linha][coluna] + somaMatriz 
			se ( linha == coluna)
			{
				somaDiag = matriz[linha][coluna] + somaDiag
			}
	
			}
		}
		escreva ("\nA soma de todos os números é: ",somaMatriz)
		escreva ("\nA soma de todos os números é: ",somaDiag)
	}
}

	
			
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 529; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 7, 10, 6}-{somaMatriz, 7, 36, 10}-{somaDiag, 7, 52, 8};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */