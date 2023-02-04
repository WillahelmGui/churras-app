package churrasco;

import java.text.DecimalFormat;

public class Calculokg {

	static final double CARNE_PESSOA = 0.55;
	static double carnePesoTotal;

	static Double precoTotalCarnes = 0.0;
	
	public static void kgGrama() {
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("\n/--------------------------------------------------\\");

		System.out.println("\\--------------------------------------------------/");

		System.out.println(" Considerando que cada pessoa bebe 1,4L \n e come aproximadamente 550G no churrasco \n");
		carnePesoTotal = ServicoConvidado.pegarQuantidadeConvidados() * CARNE_PESSOA;
		double qtdCarnePorPessoa =  carnePesoTotal / SelecaoDeCarne.pegarQuantidadeCarnesSelecionadas();

		if (carnePesoTotal == 0) {
			System.out.println("Epa! Você não cadastrou ninguém no seu churrasco! \n"
					+ "Volte para o menu e cadastre os participantes. ");
		} else {
			System.out.println(" ");
			System.out.println("\n/--------------------------------------------------\\");
			System.out.println("    CADA UM DOS " + ServicoConvidado.pegarQuantidadeConvidados() + " PARTICIPANTES DEVEM COMPRAR: ");
			System.out.println("\\--------------------------------------------------/");

			for (int j = 0; j < SelecaoDeCarne.pegarQuantidadeCarnesSelecionadas(); j++) {
				String nomePrecoCarne = SelecaoDeCarne.pegarListaCarnes().get(j).nome + " " + SelecaoDeCarne.pegarListaCarnes().get(j).preco;
				System.out.println(". " + qtdCarnePorPessoa + "Kg de " + nomePrecoCarne);
				precoTotalCarnes += SelecaoDeCarne.pegarListaCarnes().get(j).preco * qtdCarnePorPessoa;
			}
			
			System.out.println("Kg total de carnes: " + carnePesoTotal + "Kg.");
			System.out.println("Preço total das carnes: " + precoTotalCarnes); // Não feito ainda
		}

		System.out.println(" ");

		Bebida.BebidasMLTotal = ServicoConvidado.pegarQuantidadeConvidados() * Bebida.BebidaPessoa;

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
