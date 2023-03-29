package service;

import java.util.ArrayList;

import churrasco.LeitorDeDado;
import model.Convidado;

public class ServicoConvidado {
	
	private static ArrayList<Convidado> listaConvidados = new ArrayList<>();
	private static final String SAIR_LISTA = "0";
	
	public static void cadastrar() {
		
		System.out.println("\n/--------------------------------------------------\\");
		System.out.println(" 		CADASTRO DE CONVIDADO SELECIONADO");
		System.out.println("\\--------------------------------------------------/");
		Convidado convidado = new Convidado();
		
		do {
			System.out.println("digite o nome dos participantes ou 0 para terminar o cadastro: ");
			
			convidado = new Convidado();
			convidado.nome = LeitorDeDado.sc.nextLine();
			
			if(!convidado.nome.equals(SAIR_LISTA)) {
				listaConvidados.add(convidado);				
			}
		} while (!convidado.nome.equals(SAIR_LISTA));
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