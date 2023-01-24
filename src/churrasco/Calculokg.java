package churrasco;

import java.util.Scanner;

public class Calculokg {
	static Scanner sc = new Scanner(System.in);

	static double CarnePessoa = 550;
	static double BebidaPessoa = 1400;
	static double CarnePesoTotal;

	public static void kgGrama() {
		System.out.println("\n/--------------------------------------------------\\");
		System.out.println(" 		CÁLCULO SELECIONADO");
		System.out.println("\\--------------------------------------------------/");

		System.out.println(
				"Considerando que cada pessoa bebe 1,4L e come aprox 550G no churrasco, \n" + "Você deve comprar:");
		CarnePesoTotal = Cadastro.nome.size() * CarnePessoa;
		if (CarnePesoTotal == 0) {
			System.out.println("Epa! Você não cadastrou ninguém no seu churrasco! \n"
					+ "Volte para o menu e cadastre os participantes. ");
		} else {
			System.out.println(CarnePesoTotal / 1000 + "Kg de carne");
			
		}

	}
}