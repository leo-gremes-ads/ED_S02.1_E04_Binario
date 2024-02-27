package controller;

import java.util.Scanner;

public class ValidaEntrada
{
	public ValidaEntrada()
	{
		super();
	}

	public int inteiroValido(String msg)
	{
		int n;
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.print("Digite um número inteiro: ");
			try {
				n = s.nextInt();
			} catch (Exception e) {
				System.out.println("Entrava inválida. Tente novamente.");
				s.next();
				continue;
			}
			if (n >= 0 && n <= 2000)
				break;
			System.out.println("Número fora do intervalo. Tente novamente.");
		}
		s.close();
		return n;
	}	
}