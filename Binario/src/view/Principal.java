package view;

import controller.Binario;
import controller.ValidaEntrada;

public class Principal
{
	public static void main(String[] args)
	{
		int n;
		String binario;
		Binario b = new Binario();
		ValidaEntrada ve = new ValidaEntrada();

		n = ve.inteiroValido("Digite um número: ");
		binario = b.converterBinario(n);
		System.out.println("Binário: " + binario);
	}
}