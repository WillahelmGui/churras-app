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
<<<<<<< HEAD
		double qtdCarnePorPessoa =  carnePesoTotal / ServicoCarne.pegarQuantidadeCarnesSelecionadas();
		if (carnePesoTotal == 0) {
=======
		bebidaLitroTotal = ServicoConvidado.pegarQuantidadeConvidados() * BEBIDA_PESSOA;

		double qtdCarnePorPessoa = carnePesoTotal / ServicoCarne.pegarQuantidadeCarnesSelecionadas();
		double quantidadeBebidaPessoa = 0;
		/*int bebidaSelec = ServicoBebida.pegarQuantidadeBebidaSelecionadas();
		
		if(bebidaSelec != 0) {
			quantidadeBebidaPessoa = bebidaLitroTotal / bebidaSelec;
		}
		 */
		if (ServicoConvidado.pegarQuantidadeConvidados() == 0) {
>>>>>>> 6e5e91dce2b9a0d8c4f108f94788a8880483c50d
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

			System.out.println("Kg total de carnes: " + df.format(precoTotalCarnes) + "Kg.");
			System.out.println("Preço total das carnes: " + precoTotalCarnes);
		}
		// A partir desse ponto se inicia a lógica para as bebidas
		ServicoBebida.chamarSelecaoBebidas();
		quantidadeBebidaPessoa = bebidaLitroTotal / ServicoBebida.pegarQuantidadeBebidaSelecionadas();
		if (ServicoBebida.listaBebidaSelecionada != null) {
			for (int k = 0; k < ServicoBebida.listaBebidaSelecionada.size(); k++) {
				String nomePrecoBebida = ServicoBebida.pegarListaBebida().get(k).nome + " R$"
						+ ServicoBebida.pegarListaBebida().get(k).preco + "/1L";
				System.out.println(df.format(quantidadeBebidaPessoa) + "L de " + nomePrecoBebida);
				precoTotalBebidas += ServicoBebida.pegarListaBebida().get(k).preco * quantidadeBebidaPessoa;
			}
			System.out.println("Litros total de Bebidas: " + df.format(bebidaLitroTotal) + "L");

			System.out.println("Preço total das bebidas: " + df.format(precoTotalBebidas));
		}

	}
}
