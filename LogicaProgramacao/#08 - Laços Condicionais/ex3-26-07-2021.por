/*
 * Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
 */
programa
{
	inclua biblioteca Matematica --> mat
	real n1, n2, n3, n4, r1, r2, r3, r4
	funcao inicio()
	{
		escreva("Digite o valor do  número 1: ")
		leia(n1)
		escreva("Digite o valor do  número 2: ")
		leia(n2)
		escreva("Digite o valor do  número 3: ")
		leia(n3)
		escreva("Digite o valor do  número 4: ")
		leia(n4)

		r1 = mat.raiz(n1, 2.0)
		r2 = mat.raiz(n2, 2.0)
		r3 = mat.raiz(n3, 2.0)
		r4 = mat.raiz(n4, 2.0)

		se (r3 >=1000){
			escreva("A raiz do número 3 é igual a: ", r3)
		}
		senao {
			escreva("\nNúmero 1 ", n1, " sua raiz é: ", r1)
			escreva("\nNúmero 2 ", n2, " sua raiz é: ", r2)
			escreva("\nNúmero 3 ", n3, " sua raiz é: ", r3)
			escreva("\nNúmero 4 ", n4, " sua raiz é: ", r4)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 414; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */