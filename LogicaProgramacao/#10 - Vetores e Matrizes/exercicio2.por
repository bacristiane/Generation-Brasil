programa
{
    inteiro vetor[10], somaDado=0, contaMaior=0, dadoMaior=0, x
    real media
    funcao inicio()
    {
 
		para(x = 0; x < 10; x++)
          {
            // lendo o valor do dado e colocando dentro da posição x do vetor
            escreva("Digite o valor obtido pelo dado: ")
            leia(vetor[x]) 
            somaDado = vetor[x] + somaDado
			se (vetor[x] > dadoMaior) // Descobrindo o maior
               {
                dadoMaior = vetor[x]
               }
          }
		para(x = 0; x < 10; x++)
		{
			se (dadoMaior==vetor[x])
               {
               contaMaior++
               }	
		}      

        // media
        media = somaDado / 10.0
        escreva("\nO dado maior foi: ", dadoMaior)
        escreva("\nDado maior foi digitado ", contaMaior, " vez(es) ")
        escreva("\nA media total dos valores obtidos é de: ", media)
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 518; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */