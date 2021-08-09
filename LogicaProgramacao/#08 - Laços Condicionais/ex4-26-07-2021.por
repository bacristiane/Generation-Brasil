/*
 * Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
número é par ou ímpar, e se é positivo ou negativo.
 */
 

programa
{
	inteiro n1
	funcao inicio()
	{
		escreva("Digite um número inteiro: ")
		leia(n1)
		se (n1 % 2 == 0){
			escreva("O número ", n1, " é par!")
		}
		senao {
			escreva("O número ", n1, " é ímpar")
		}
		// -----------------------------------------
		se (n1 > 0){
			escreva("\nO número ", n1, " é positivo")
		}
		senao se (n1 < 0) {
			escreva("\nO número é negativo")
		}
		senao {
			escreva("\nNão é positivo e nem negativo")
			}
	} 
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 190; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */