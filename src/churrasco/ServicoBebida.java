package churrasco;

import java.util.ArrayList;
import java.util.List;

public class ServicoBebida {

	static final int SIM = 1;
	static final int NAO = 0;
	private static ArrayList<Bebida> listaDeBebida = new ArrayList<Bebida>();
	static ArrayList<Bebida> listaBebidaSelecionada = new ArrayList<>();

	static double BebidasMLTotal;
	static double BebidaPessoa = 1400;
	static {
		Bebida agua = new Bebida();
		agua.nome = "Água";
		agua.preco = 3.00;

		Bebida aguaComGas = new Bebida();
		aguaComGas.nome = "Água com gás";
		aguaComGas.preco = 5.00;

		Bebida suco = new Bebida();
		suco.nome = "Suco natural";
		suco.preco = 10.00;

		listaDeBebida.add(agua);
		listaDeBebida.add(aguaComGas);
		listaDeBebida.add(suco);

	}

	public static void cadastrarBebida() {

		System.out.println("Informe o nome da bebida");

		String nome = LeitorDeDado.sc.nextLine();

		System.out.println("Informe o preco da bebida");

		double preco = Double.parseDouble(LeitorDeDado.sc.nextLine());
		Bebida b = new Bebida();
		b.nome = nome;
		b.preco = preco;
		listaDeBebida.add(b);
	}

	public static void chamarSelecaoBebidas() {
		int kp;
		do {
			System.out.println("\n/-------------------------------------\\");
			System.out.println("Você gostaria de comprar bebidas?");
			System.out.println("1. Sim 0. Não");
			System.out.println("\\-------------------------------------/");
			switch (kp = Integer.parseInt(LeitorDeDado.sc.nextLine())) {
			// Código quando o usuário aceitar.
			case 1:
				ServicoBebida.mostrarBebidas();
				break;
			// Código quando o usuário negar.
			case 0:
				break;
			}
		} while (kp != 0 && kp != 1);
	}

	public static void mostrarBebidas() {
		for (int j = 0; j < listaDeBebida.size(); j++) {

			System.out.println(j + 1 + ". " + listaDeBebida.get(j).nome + " R$" + listaDeBebida.get(j).preco + "/500ml");
		}
		System.out.println("\n/--------------------------------------------------\\");
		System.out.println("Escolha as bebidas desejadas");
		System.out.println("Para escolher as bebidas desejadas digite:");
		System.out.println("1. SIM  0. NÃO");
		System.out.println("\\--------------------------------------------------/");

		int resposta;
		for (int i = 0; i < listaDeBebida.size(); i++) {
			System.out.println("Você gostaria de comprar " + listaDeBebida.get(i).nome + " ?");
			resposta = Integer.parseInt(LeitorDeDado.sc.nextLine());
			if (resposta == SIM) {
				listaBebidaSelecionada.add(listaDeBebida.get(i));
			}
			if (resposta != SIM && resposta != NAO) {
				i--;
			}
		}
	}
<<<<<<< HEAD
	public static int pegarQuantidadeCarnesSelecionadas() {
		return listaBebidaSelecionada.size();
	}

	public static List<Bebida> pegarListaCarnes() {
		return listaBebidaSelecionada;
=======
	public static int pegarQuantidadeBebidaSelecionadas() {
		return listaBebidaSelecionada.size();
	}

	public static List<Bebida> pegarListaBebida() {
		return listaDeBebida;
>>>>>>> 6e5e91dce2b9a0d8c4f108f94788a8880483c50d
	}

}
