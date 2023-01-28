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
		CarnePesoTotal = CadastroParticipante.quantosNomes * CarnePessoa;
		if (CarnePesoTotal == 0) {
			System.out.println("Epa! Você não cadastrou ninguém no seu churrasco! \n"
					+ "Volte para o menu e cadastre os participantes. ");
		} else {
			System.out.println(" ");
			System.out.println("\n/--------------------------------------------------\\");
			System.out.println("    CADA UM DOS " + CadastroParticipante.quantosNomes + " PARTICIPANTES DEVEM COMPRAR: ");
			System.out.println("\\--------------------------------------------------/");

			for (int j = 0; j < SelecaoDeCarne.produtosSelecionados.size(); j++) {

				System.out
						.println(". " + df.format((CarnePesoTotal / 1000) / SelecaoDeCarne.produtosSelecionados.size())
								+ "Kg de " + SelecaoDeCarne.produtosSelecionados.get(j));

			}
			for (double n: SelecaoDeCarne.precos){
				PrecoTotalCarnes += n;
			}
			System.out.println("Kg total de carnes: " + CarnePesoTotal / 1000 + "Kg.");
			System.out.println("Preço total das carnes: " + PrecoTotalCarnes); // Não feito ainda
		}

		System.out.println(" ");

		Bebida.BebidasMLTotal = CadastroParticipante.quantosNomes * Bebida.BebidaPessoa;

		if (Bebida.BebidasMLTotal != 0) {
			if (Bebida.BebidasSelecionadas != null) {
				for (int k = 0; k < Bebida.BebidasSelecionadas.size(); k++) {
					System.out.println(k + 1 + ". "
							+ df.format((Bebida.BebidasMLTotal / 1000) / Bebida.BebidasSelecionadas.size()) + "L de "
							+ Bebida.BebidasSelecionadas.get(k));
				}
				System.out.println("Litros total de Bebidas: " + Bebida.BebidasMLTotal / 1000 + "L");
				
				System.out.println("Preço total das bebidas: "); // Não feito ainda
			}
		}

		if (Bebida.BebidasMLTotal == 0) {
			System.out.println(" ");
		} else {

			if (Bebida.BebidasSelecionadas != null) {

				for (int k = 0; k < Bebida.BebidasSelecionadas.size(); k++) {
					System.out.println(
							". " + df.format((Bebida.BebidasMLTotal / 1000) / Bebida.BebidasSelecionadas.size())
									+ "L de " + Bebida.BebidasSelecionadas.get(k));
				}

				System.out.println("Litros total de Bebidas: " + Bebida.BebidasMLTotal / 1000 + "L");
				System.out.println("Preço total das bebidas: "); // Não feito ainda

			} else {
				System.out.println("0 Bebidas");
			}
		}

		System.out.println(" ");
		System.out.println(" ");

	}

}
