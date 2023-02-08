package churrasco;

import java.text.DecimalFormat;

public class Calculokg {
	static DecimalFormat df = new DecimalFormat("#.###");
	static final double CARNE_PESSOA = 0.55;
	static double carnePesoTotal;
	static double precoTotalCarnes = 0.0;

	static final double BEBIDA_PESSOA = 1.4;
	static double bebidaLitroTotal;
	static double precoTotalBebidas = 0.0;

	public static void kgGrama() {
		System.out.println("\n/--------------------------------------------------\\");

		System.out.println("\\--------------------------------------------------/");

		System.out.println(" Considerando que cada pessoa bebe 1,4L \n e come aproximadamente 550G no churrasco \n");
		carnePesoTotal = ServicoConvidado.pegarQuantidadeConvidados() * CARNE_PESSOA;
		bebidaLitroTotal = ServicoConvidado.pegarQuantidadeConvidados() * BEBIDA_PESSOA;

		double qtdCarnePorPessoa = carnePesoTotal / ServicoCarne.pegarQuantidadeCarnesSelecionadas();
		double quantidadeBebidaPessoa = bebidaLitroTotal / ServicoBebida.pegarQuantidadeBebidaSelecionadas();

		if (ServicoConvidado.pegarQuantidadeConvidados() == 0) {
			System.out.println("Epa! Você não cadastrou ninguém no seu churrasco! \n"
					+ "Volte para o menu e cadastre os participantes. ");
		} else {
			System.out.println(" ");
			System.out.println("\n/--------------------------------------------------\\");
			System.out.println("    CADA UM DOS " + ServicoConvidado.pegarQuantidadeConvidados()
					+ " PARTICIPANTES DEVEM COMPRAR: ");
			System.out.println("\\--------------------------------------------------/");

			for (int j = 0; j < ServicoCarne.pegarQuantidadeCarnesSelecionadas(); j++) {
				String nomePrecoCarne = ServicoCarne.pegarListaCarnes().get(j).nome + " R$"
						+ ServicoCarne.pegarListaCarnes().get(j).preco + "/Kg ";
				System.out.println(df.format(qtdCarnePorPessoa) + "Kg de " + nomePrecoCarne);
				precoTotalCarnes += ServicoCarne.pegarListaCarnes().get(j).preco * qtdCarnePorPessoa;
			}

			System.out.println("Kg total de carnes: " + carnePesoTotal + "Kg.");
			System.out.println("Preço total das carnes: " + precoTotalCarnes);
		}
		// A partir desse ponto se inicia a lógica para as bebidas
		ServicoBebida.chamarSelecaoBebidas();
		if (ServicoBebida.listaBebidaSelecionada != null) {
			for (int k = 0; k < ServicoBebida.listaBebidaSelecionada.size(); k++) {
				System.out.println(k++ + ". " + bebidaLitroTotal / ServicoBebida.listaBebidaSelecionada.size() + "L de "
						+ ServicoBebida.listaBebidaSelecionada.get(k));
			}
			System.out.println("Litros total de Bebidas: " + bebidaLitroTotal + "L");

			System.out.println("Preço total das bebidas: ");
		}
	}

}
