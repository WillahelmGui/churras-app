package churrasco;

import java.text.DecimalFormat;

public class Calculokg {

	static double CarnePessoa = 550;
	static double BebidaPessoa = 1400;
	static double CarnePesoTotal;

	public static void kgGrama() {
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("\n/--------------------------------------------------\\");
		System.out.println(" 		CÁLCULO INICIALIZADO");
		System.out.println("\\--------------------------------------------------/");

		System.out.println(
				"Considerando que cada pessoa bebe 1,4L e come aprox 550G no churrasco, \n" + "Você deve comprar:");
		CarnePesoTotal = Cadastro.quantosNomes * CarnePessoa;
		if (CarnePesoTotal == 0) {
			System.out.println("Epa! Você não cadastrou ninguém no seu churrasco! \n"
					+ "Volte para o menu e cadastre os participantes. ");
		} else {
			System.out.println("Você deve comprar: " + CarnePesoTotal / 1000 + "Kg de carne, sendo eles: ");
			for (int j = 0; j < SelecaoDeCarnes.produtosSelecionados.size(); j++) {

				System.out.println(
						j + 1 + ". " + df.format((CarnePesoTotal / 1000) / SelecaoDeCarnes.produtosSelecionados.size())
								+ "Kg de " + SelecaoDeCarnes.produtosSelecionados.get(j));
			}
		}

	}
}