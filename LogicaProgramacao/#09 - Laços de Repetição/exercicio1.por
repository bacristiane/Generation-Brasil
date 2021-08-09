programa
{
	
	funcao inicio()
	{
		real salario=0.0,medSalario, medFilho,somaSalario=0.0, somaFilhos=0.0, percSalarioCem,maiorSalario,salarioCem
		inteiro x,filhos

		para(x=1;x<=20;x++) // x = x + 1 x = x+2  x-- é igual a x = x - 1
		{
			escreva("\nEntre com salario: ")
			leia(salario)
			escreva("\nEntre com numero d efilhos: ")
			leia(filhos)
			

			somaSalario = somaSalario + salario 
			somaFilhos = somaFilhos + filhos 

			
			se (salario <=100){
				salarioCem++
			}
			//c
			se (salario>=maiorSalario){
				maiorSalario = salario
				
			}

			
		}

		medSalario = somaSalario / 20
		medFilho = somaFilhos/20
		percSalarioCem = (salarioCem++/20) * 100
		

		

		escreva("\nMédia salário da população: ",medSalario)
		escreva("\nMédia filhos da população: ",medFilho)
		escreva("\nMaior salário é : ",maiorSalario)
		escreva("\nPorcentagens de salario até 100: ",percSalarioCem)
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 163; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */