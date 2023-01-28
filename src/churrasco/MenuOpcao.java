package churrasco;

public class MenuOpcao {
	
	public void iniciar() {
		byte opcaoEscolhida = -1;

		while (opcaoEscolhida != 3) {
			mostrarListaOpcao();
			opcaoEscolhida = LeitorDeDado.sc.nextByte();

			switch (opcaoEscolhida) {
			case 1:
				CadastroParticipante.CadastroClass();
				break;
			case 2:
				SelecaoDeCarne.chamarSelecao();
				break;
			case 3:
				System.out.println("Aplicação encerrada.");
				break;
			default:
				System.out.println("digite um numero valido");
				break;
			}

		}
		LeitorDeDado.sc.close();
	}
	
	public void mostrarListaOpcao() {
		System.out.println("\n--------------------------");
		System.out.println("Escolha uma das opções");
		System.out.println("1. Cadastro");
		System.out.println("2. Seleção de Carnes e Cálculo");
		System.out.println("3. Sair");
		System.out.println("--------------------------");

	}
}
