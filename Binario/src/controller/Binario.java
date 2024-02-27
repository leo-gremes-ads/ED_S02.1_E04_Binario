package controller;

public class Binario
{
	public Binario()
	{
		super();
	}

	/*
	PONTO DE PARADA -> Quando o número for 0 ou 1, ele é igual em decimal ou
		binário

	RELAÇÃO DE CHAMADA DE PASSOS -> A conversão de um número decimal pra binário
	consiste em concatenar inversamente os resto de divisões consecultivas desse
	número por 2. Então, colocamos o resto da divisão do número atual por 2 após
	a chamada recursiva desse número dividido por 2
	*/

	public String converterBinario(int n)
	{
		if (n <= 1) // -> Entrada limitada a 2000, assume-se que não haverão negativos
			return String.valueOf(n);
		return converterBinario(n / 2) + String.valueOf(n % 2);		
	}
}