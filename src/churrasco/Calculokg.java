package churrasco;

import java.text.DecimalFormat;

public class Calculokg {

	static double CarnePessoa = 550;
	static double CarnePesoTotal;

	static Double PrecoTotalCarnes = 0.0;
	public static void kgGrama() {
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("\n/--------------------------------------------------\\");

		System.out.println("\\--------------------------------------------------/");

		System.out.println(" Considerando que cada pessoa bebe 1,4L \n e come aproximadamente 550G no churrasco \n");
		CarnePesoTotal = Cadastro.quantosNomes * CarnePessoa;
		if (CarnePesoTotal == 0) {
			System.out.println("Epa! Você não cadastrou ninguém no seu churrasco! \n"
					+ "Volte para o menu e cadastre os participantes. ");
		} else {
			System.out.println(" ");
			System.out.println("\n/--------------------------------------------------\\");
			System.out.println("    CADA UM DOS " + Cadastro.quantosNomes + " PARTICIPANTES DEVEM COMPRAR: ");
			System.out.println("\\--------------------------------------------------/");

			for (int j = 0; j < SelecaoDeCarnes.produtosSelecionados.size(); j++) {

				System.out
						.println(". " + df.format((CarnePesoTotal / 1000) / SelecaoDeCarnes.produtosSelecionados.size())
								+ "Kg de " + SelecaoDeCarnes.produtosSelecionados.get(j));

			}
			for (double n: SelecaoDeCarnes.precos){
				PrecoTotalCarnes += n;
			}
			System.out.println("Kg total de carnes: " + CarnePesoTotal / 1000 + "Kg.");
			System.out.println("Preço total das carnes: " + PrecoTotalCarnes); // Não feito ainda
		}

		System.out.println(" ");

		Bebidas.BebidasMLTotal = Cadastro.quantosNomes * Bebidas.BebidaPessoa;

		if (Bebidas.BebidasMLTotal != 0) {
			if (Bebidas.BebidasSelecionadas != null) {
				for (int k = 0; k < Bebidas.BebidasSelecionadas.size(); k++) {
					System.out.println(k + 1 + ". "
							+ df.format((Bebidas.BebidasMLTotal / 1000) / Bebidas.BebidasSelecionadas.size()) + "L de "
							+ Bebidas.BebidasSelecionadas.get(k));
				}
				System.out.println("Litros total de Bebidas: " + Bebidas.BebidasMLTotal / 1000 + "L");
				
				System.out.println("Preço total das bebidas: "); // Não feito ainda
			}
		}

		if (Bebidas.BebidasMLTotal == 0) {
			System.out.println(" ");
		} else {

			if (Bebidas.BebidasSelecionadas != null) {

				for (int k = 0; k < Bebidas.BebidasSelecionadas.size(); k++) {
					System.out.println(
							". " + df.format((Bebidas.BebidasMLTotal / 1000) / Bebidas.BebidasSelecionadas.size())
									+ "L de " + Bebidas.BebidasSelecionadas.get(k));
				}

				System.out.println("Litros total de Bebidas: " + Bebidas.BebidasMLTotal / 1000 + "L");
				System.out.println("Preço total das bebidas: "); // Não feito ainda

			} else {
				System.out.println("0 Bebidas");
			}
		}

		System.out.println(" ");
		System.out.println(" ");

	}

}