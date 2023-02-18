package churrasco;

public class MenuOpcao {

	byte opcaoEscolhida;
	private final static int OPCAO_SAIR_PROGRAMA = 0;
	private final static int OPCAO_CADASTRAR_CONVIDADO = 1;
	private final static int OPCAO_LISTAR_CONVIDADO = 2;
	private final static int OPCAO_CADASTRAR_SELECAO_DE_CARNE = 3;
	private final static int OPCAO_CADASTRAR_CARNE = 4;
	private final static int OPCAO_CADASTRAR_BEBIDA = 5;

	public void iniciar() {

		do {
			try {

				String texto = pegarTextoDaListaOpcao();
				System.out.println(texto);
				opcaoEscolhida = Byte.parseByte(LeitorDeDado.sc.nextLine());

				switch (opcaoEscolhida) {
				case OPCAO_CADASTRAR_CONVIDADO:
					ServicoConvidado.cadastrar();
					break;
				case OPCAO_LISTAR_CONVIDADO:
					ServicoConvidado.listar();
					break;
				case OPCAO_CADASTRAR_CARNE:
					ServicoCarne.cadastrarCarne();
					break;
				case OPCAO_CADASTRAR_SELECAO_DE_CARNE:
					ServicoCarne.chamarSelecao();
					break;
				case OPCAO_CADASTRAR_BEBIDA:
					ServicoBebida.cadastrarBebida();
					break;
				case OPCAO_SAIR_PROGRAMA:
					System.out.println("Aplicação encerrada.");
					break;
				default:
					System.out.println("digite um numero valido");
					break;
				}

			} catch (

			Exception e) {
				System.out.println("Insira uma opção válida");
				opcaoEscolhida = -1;
			}
		} while (opcaoEscolhida != OPCAO_SAIR_PROGRAMA);
		LeitorDeDado.sc.close();

	}

	public String pegarTextoDaListaOpcao() {

		return "\n--------------------------\n" + "Escolha uma das opções\n" + OPCAO_CADASTRAR_CONVIDADO
				+ ". Cadastro de Convidado\n" + OPCAO_LISTAR_CONVIDADO + ". Lista de Convidado\n"
				+ OPCAO_CADASTRAR_SELECAO_DE_CARNE + ". Seleção de Carnes e Cálculo\n" + OPCAO_CADASTRAR_CARNE
				+ ". Cadastrar Carnes\n" + OPCAO_CADASTRAR_BEBIDA + ". Cadastrar Bebida\n" + OPCAO_SAIR_PROGRAMA
				+ ". Sair\n" + "--------------------------";
	}
}
