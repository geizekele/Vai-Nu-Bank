package br.com.web.na.vai;
import java.util.Scanner;

public class Menu {
	// Classe para interação com o usuário
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Banco banco = new Banco();

		// Exemplo de utilização
		ContaCorrente corrente = new ContaCorrente(1, 123, "Marta", "123.456.789-00", 1000.0);
		ContaPoupanca poupanca = new ContaPoupanca(2, 456, "Carlos", "987.654.321-00", 15);

		banco.cadastrarConta(corrente);
		banco.cadastrarConta(poupanca);

		int opcao;
		do {
			System.out.println("\n--- Menu ---");
			System.out.println("1. Exibir informações da conta corrente");
			System.out.println("2. Exibir informações da conta poupança");
			System.out.println("3. Realizar saque");
			System.out.println("4. Realizar depósito");
			System.out.println("5. Realizar transferência");
			System.out.println("0. Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				corrente.exibirInformacoes();
				break;
			case 2:
				poupanca.exibirInformacoes();
				break;
			case 3:
				System.out.print("Informe o valor do saque: ");
				double valorSaque = scanner.nextDouble();
				OperacoesBancarias.realizarSaque(corrente, valorSaque);
				break;
			case 4:
				System.out.print("Informe o valor do depósito: ");
				double valorDeposito = scanner.nextDouble();
				OperacoesBancarias.realizarDeposito(corrente, valorDeposito);
				break;
			case 5:
				System.out.print("Informe o valor da transferência: ");
				double valorTransferencia = scanner.nextDouble();
				OperacoesBancarias.realizarTransferencia(corrente, poupanca, valorTransferencia);
				break;
			case 0:
				System.out.println("Saindo do programa.");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		} while (opcao != 0);

		scanner.close();
	}
}
