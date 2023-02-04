package churrasco;

public class MenuOpcao {

	private final static int OPCAO_CADASTRAR_CONVIDADO = 1;
	private final static int OPCAO_LISTAR_CONVIDADO = 2;
	private final static int OPCAO_CADASTRAR_SELECAO_DE_CARNE = 3;
	private final static int OPCAO_SAIR_PROGRAMA = 4;
	
	public void iniciar() {
		
		byte opcaoEscolhida;

		do {
			String texto = pegarTextoDaListaOpcao();
			System.out.println(texto);
			
			opcaoEscolhida = LeitorDeDado.sc.nextByte();

			switch (opcaoEscolhida) {
			case OPCAO_CADASTRAR_CONVIDADO:
				ServicoConvidado.cadastrar();
				break;
			case OPCAO_LISTAR_CONVIDADO: 
				ServicoConvidado.listar();
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
				+ "\nEscolha uma das opções\n"
				+ OPCAO_CADASTRAR_CONVIDADO + ". Cadastro de Convidado"
				+ "\n2. Lista de Convidado"
				+ "\n3. Seleção de Carnes e Cálculo"
				+ "\n4. Sair"
				+ "\n--------------------------";
	}
}
