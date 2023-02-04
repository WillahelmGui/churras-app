package churrasco;

import java.util.ArrayList;

public class ServicoConvidado {
	
	private static ArrayList<Convidado> listaConvidados = new ArrayList<>();

	public static void cadastrar() {
		
		System.out.println("\n/--------------------------------------------------\\");
		System.out.println(" 		CADASTRO DE CONVIDADO SELECIONADO");
		System.out.println("\\--------------------------------------------------/");

		System.out.println("quantas pessoas comparecerão? ");
		int quantosNomes = LeitorDeDado.sc.nextInt();
		LeitorDeDado.sc.nextLine();
		
		for (int i = 1; i <= quantosNomes; i++) {
			System.out.println("digite o nome dos participantes: ");
			
			Convidado convidado = new Convidado();
			convidado.nome = LeitorDeDado.sc.nextLine();
			
			listaConvidados.add(convidado);

		}
	}
	
	public static void listar() {
		System.out.println("\n/--------------------------------------------------\\");
		System.out.println("       LISTA DE PARTICIPANTES QUE COMPARECERÂO");
		System.out.println("\\--------------------------------------------------/");

		for (int j = 0; j < listaConvidados.size(); j++) {

			System.out.println(j + 1 + ". " + listaConvidados.get(j).nome);
		}

		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
	}
	
	
	public static int pegarQuantidadeConvidados() {
		return listaConvidados.size();
	}
}