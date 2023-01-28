package churrasco;

import java.util.ArrayList;

public class Convidado {
	
	static int quantosNomes;
	static ArrayList<String> convidados = new ArrayList<>();

	public static void cadastrar() {
		
		System.out.println("\n/--------------------------------------------------\\");
		System.out.println(" 		CADASTRO DE CONVIDADO SELECIONADO");
		System.out.println("\\--------------------------------------------------/");

		System.out.println("quantas pessoas comparecerão? ");
		quantosNomes = LeitorDeDado.sc.nextInt();
		
		for (int i = 1; i <= quantosNomes; i++) {
			System.out.println("digite o nome dos participantes: ");
			convidados.add(LeitorDeDado.sc.next() + LeitorDeDado.sc.nextLine());

		}
	}
	
	public static void listar() {
		System.out.println("\n/--------------------------------------------------\\");
		System.out.println("       LISTA DE PARTICIPANTES QUE COMPARECERÂO");
		System.out.println("\\--------------------------------------------------/");

		for (int j = 0; j < convidados.size(); j++) {

			System.out.println(j + 1 + ". " + convidados.get(j));
		}

		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
	}
}