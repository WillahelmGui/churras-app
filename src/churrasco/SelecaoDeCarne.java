package churrasco;

import java.util.ArrayList;
import java.util.List;

public class SelecaoDeCarne {
	
	static final int SIM = 1;
	static final int NAO = 0;

	static ArrayList<Carne> listaCarneSelecionada = new ArrayList<>();

	public static void chamarSelecao() {
		System.out.println("\n/--------------------------------------------------\\");
		System.out.println(" 		  SELEÇÃO DE CARNES");
		System.out.println("\\--------------------------------------------------/");

		System.out.println("As carnes disponíveis são: ");

		// Declara a ArrayList "Lista de Produtos".
		ArrayList<Carne> listaDeProdutos = new ArrayList<Carne>();
		
		Carne picanha = new Carne();
		picanha.nome = "Picanha";
		picanha.preco = 66.79;
		
		Carne costela = new Carne();
		costela.nome = "Costela";
		costela.preco = 27.34;

		listaDeProdutos.add(picanha);
		listaDeProdutos.add(costela);
		
		for (int j = 0; j < listaDeProdutos.size(); j++) {
			
			System.out.println(j + 1 + ". " + listaDeProdutos.get(j).nome + " " + listaDeProdutos.get(j).preco);
		}
		
		System.out.println("\n/--------------------------------------------------\\");
		System.out.println("Escolha as carnes desejadas");
		System.out.println("Para escolher as carnes desejadas digite:");
		System.out.println("1. SIM  0. NÃO");
		System.out.println("Qualquer outro valor digitado será tratado como não.");
		System.out.println("\\--------------------------------------------------/");

		// Sequência de perguntas a respeito das carnes.
		int resposta;
		do {
			System.out.println("Você gostaria de comprar Picanha?");
			resposta = LeitorDeDado.sc.nextInt();
			if (resposta == SIM) {
				listaCarneSelecionada.add(picanha);
			} 
		} while (resposta != SIM && resposta != NAO);
		
		do {
			System.out.println("Você gostaria de comprar Costela?");
			resposta = LeitorDeDado.sc.nextInt();
			if (resposta == SIM) {
				listaCarneSelecionada.add(costela);
			} 
		} while (resposta != SIM && resposta != NAO);


		

		System.out.println("\n/--------------------------------------------------\\");
		System.out.println(" 	LISTA DE CARNES SELECIONADAS");
		System.out.println("\\--------------------------------------------------/");
		
		for (int k = 0; k < listaCarneSelecionada.size(); k++) {
			System.out.println(k + 1 + ". " + listaCarneSelecionada.get(k).nome);
		}
		Bebida.selecao();
		Calculokg.kgGrama();
	}
	
	public static int pegarQuantidadeCarnesSelecionadas() {
		return listaCarneSelecionada.size();
	}
	
	public static List<Carne> pegarListaCarnes() {
		return listaCarneSelecionada;
	}
	
}
