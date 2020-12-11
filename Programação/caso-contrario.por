programa
{
	
	funcao inicio()
	{
		escreva("Escolha uma das opções: 1 - Netflix 2 - Amazon Prime - 3 HBO 4 - Sair")
		inteiro menu = 0
		escreva ("\n" + "Sua escolha: ")
		leia (menu)
		
		escolha (menu)
		
		{
			caso 1: //Testa se o valor é igual a 1
			escreva ("Ok! Netflix")
			pare
		
			caso 2: //Testa se o valor é igual a 2
			escreva ("Ok! Amazon Prime")
			pare
		
			caso 3: //Testa se o valor é igual a 3
			escreva ("Ok! HBO")
			pare

			caso 4: //Testa se o valor é igual a 4
			escreva ("Ok! Saindo do menu.....")
			
			pare
			caso contrario:
			escreva ("Você deve escolher as opções 1, 2, 3 ou 4")
		}
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 192; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */