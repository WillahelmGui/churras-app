package churrasco;

public class MenuOpcao {

	private final static int OPCAO_CADASTRAR_PARTICIPANTE = 1;
	private final static int OPCAO_CADASTRAR_SELECAO_DE_CARNE = 2;
	private final static int OPCAO_SAIR_PROGRAMA = 3;
	
	
	public void iniciar() {
		
		byte opcaoEscolhida;

		do {
			String texto = pegarTextoDaListaOpcao();
			System.out.println(texto);
			
			opcaoEscolhida = LeitorDeDado.sc.nextByte();

			switch (opcaoEscolhida) {
			case OPCAO_CADASTRAR_PARTICIPANTE:
				CadastroParticipante.CadastroClass();
				break;
			case OPCAO_CADASTRAR_SELECAO_DE_CARNE:
				SelecaoDeCarne.chamarSelecao();
				break;
			case OPCAO_SAIR_PROGRAMA:
				System.out.println("Aplicação encerrada.");
				break;
			default:
				System.out.println("digite um numero valido");
				break;
			}
		} while (opcaoEscolhida != OPCAO_SAIR_PROGRAMA);
				
		LeitorDeDado.sc.close();
	}
	
	public String pegarTextoDaListaOpcao() {
		
		return "\n--------------------------"
				+ "\nEscolha uma das opções"
				+ "\n1. Cadastro"
				+ "\n2. Seleção de Carnes e Cálculo"
				+ "\n3. Sair"
				+ "\n--------------------------";
	}
}
