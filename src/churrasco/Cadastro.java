package churrasco;

import java.util.ArrayList;

public class Cadastro {
	static int quantosNomes;

	public static void CadastroClass() {
		System.out.println("\n/--------------------------------------------------\\");
		System.out.println(" 		CADASTRO SELECIONADO");
		System.out.println("\\--------------------------------------------------/");

		System.out.println("quantas pessoas comparecerão? ");
		quantosNomes = MenuOpcao.sc.nextInt();
		ArrayList<String> nome = new ArrayList<>();
		for (int i = 1; i <= quantosNomes; i++) {
			System.out.println("digite o nome dos participantes: ");
			nome.add(MenuOpcao.sc.next() + MenuOpcao.sc.nextLine());

		}
		System.out.println("\n/--------------------------------------------------\\");
		System.out.println("       LISTA DE PARTICIPANTES QUE COMPARECERÂO");
		System.out.println("\\--------------------------------------------------/");

		for (int j = 0; j < nome.size(); j++) {

			System.out.println(j + 1 + ". " + nome.get(j));
		}

		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");

	}
}