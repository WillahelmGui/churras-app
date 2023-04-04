package service;

import java.util.ArrayList;
import java.util.List;

import churrasco.Calculokg;
import churrasco.LeitorDeDado;
import churrasco.OpcaoInvalidaException;
import model.Carne;

public class ServicoCarne {

	static final int SIM = 1;
	static final int NAO = 0;
	private static ArrayList<Carne> listaDeProdutos = new ArrayList<Carne>();
	static ArrayList<Carne> listaCarneSelecionada = new ArrayList<>();

	static {
		// Declara a ArrayList "Lista de Produtos".

		Carne picanha = new Carne();
		picanha.nome = "Picanha";
		picanha.preco = 66.79;

		Carne costela = new Carne();
		costela.nome = "Costela";
		costela.preco = 27.34;

		Carne asa = new Carne();
		asa.nome = "Asa";
		asa.preco = 16.78;

		listaDeProdutos.add(picanha);
		listaDeProdutos.add(costela);
		listaDeProdutos.add(asa);

	}

	public static void cadastrarCarne() {

		System.out.println("Informe o nome da carne");

		String nome = LeitorDeDado.sc.nextLine();

		System.out.println("Informe o preco da carne");

		double preco = Double.parseDouble(LeitorDeDado.sc.nextLine());
		Carne c = new Carne();
		c.nome = nome;
		c.preco = preco;
		listaDeProdutos.add(c);
	}

	public static void chamarSelecao() {
		System.out.println("\n/--------------------------------------------------\\");
		System.out.println(" 		  SELEÇÃO DE CARNES");
		System.out.println("\\--------------------------------------------------/");

		System.out.println("As carnes disponíveis são: ");
		//
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

		int resposta = 0;
		for (int i = 0; i < listaDeProdutos.size(); i++) {
			System.out.println("Você gostaria de comprar " + listaDeProdutos.get(i).nome + " ?");

			try {
				resposta = Integer.parseInt(LeitorDeDado.sc.nextLine());
				if(resposta == SIM) {
					listaCarneSelecionada.add(listaDeProdutos.get(i));
				} else if(resposta == NAO) {
					System.out.println("Carne nao adicionada");
				} else {
					throw new OpcaoInvalidaException();
				}
				
			} catch (NumberFormatException e) {
				i--;
				e.printStackTrace();
				System.out.println("Número inválido.");
			}
		}

//		System.out.println("\n/--------------------------------------------------\\");
//		System.out.println(" 	LISTA DE CARNES SELECIONADAS");
//		System.out.println("\\--------------------------------------------------/");
//
//		for (int k = 0; k < listaCarneSelecionada.size(); k++) {
//			System.out.println(k + 1 + ". " + listaCarneSelecionada.get(k).nome);
//		}
//		Bebida.selecao();
		Calculokg.kgGrama();
	}

	public static int pegarQuantidadeCarnesSelecionadas() {
		return listaCarneSelecionada.size();
	}

	public static List<Carne> pegarListaCarnesSelecionadas() {
		return listaCarneSelecionada;
	}
	public static List<Carne> pegarListaCarnes() {
		return listaDeProdutos;
	}

}
