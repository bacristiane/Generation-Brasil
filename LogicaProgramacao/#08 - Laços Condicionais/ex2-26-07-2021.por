/*
 * Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
excedente.
 */
programa
{
	inteiro c = 0 // Código do funcionário
	inteiro n = 0 // Horas trabalhadas do funcionário
	real E = 0.0 // Salário Excedente
	real salario = 10.0 // Salário de 10 por hora
	real salarioTotal = 0.0 // Salário Total do Funcionário
	funcao inicio()
	{
		escreva("Digite o valor do Código do Funcionário: ")
		leia(c)
		escreva("Digite o número de horas trabalhadas pelo funcionário: ")
		leia(n)
		se (n > 50){
			E = (n - 50.0) * 20
			salario = 50 * 10
			salarioTotal = salario + E
			escreva("\nSalário Excedente: R$", E)
			escreva("\nSalário Total: R$", salarioTotal)
		}
		senao se (n <= 50){
			salario = n * 10
			escreva("\nSalário Excedente: R$", E)
			escreva("\nSalário Total: R$", salario)
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 560; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {salarioTotal, 15, 6, 12};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */