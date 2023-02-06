package churrasco;

import java.util.ArrayList;

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
		agua.preco = 2.45;

		Bebida aguaComGas = new Bebida();
		aguaComGas.nome = "Água com gás";
		aguaComGas.preco = 3.00;

		Bebida suco = new Bebida();
		suco.nome = "Suco natural";
		suco.preco = 11.90;

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
			switch (kp = LeitorDeDado.sc.nextByte()) {
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

			System.out.println(j + 1 + ". " + listaDeBebida.get(j).nome + " " + listaDeBebida.get(j).preco);
		}
	}

}
