package br.com.web.na.vai.menu;

import br.com.web.na.vai.banco.Banco;
import br.com.web.na.vai.conta.ContaCorrente;
import br.com.web.na.vai.conta.ContaPoupanca;
import br.com.web.na.vai.operacoes.OperacoesBancarias;
import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Banco banco = new Banco();

		// Solicitar dados para conta corrente
        System.out.println("Informe os dados da conta corrente:");
        ContaCorrente corrente = criarContaCorrente(scanner);
        banco.cadastrarConta(corrente);
        
        // Solicitar dados para conta poupança
        System.out.println("\nInforme os dados da conta poupança:");
        ContaPoupanca poupanca = criarContaPoupanca(scanner);
        banco.cadastrarConta(poupanca);
        
        int opcao;
        do {
            exibirMenu();
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
                    System.out.print("Informe o valor da transferência para a conta poupança: ");
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
	
	// Método para criar conta corrente com dados fornecidos pelo usuário
    private static ContaCorrente criarContaCorrente(Scanner scanner) {
        System.out.print("Número: ");
        int numero = scanner.nextInt();
        System.out.print("Agência: ");
        int agencia = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Nome do titular: ");
        String nome = scanner.nextLine();
        System.out.print("CPF do titular: ");
        String cpfTitular = scanner.nextLine();
//        System.out.print("Saldo inicial: ");
//        double saldoInicial = scanner.nextDouble();
        System.out.print("Data de aniversário do titular: ");
        int aniversario = scanner.nextInt();

        return new ContaCorrente(numero, agencia, nome, cpfTitular, aniversario);
    }

    // Método para criar conta poupança com dados fornecidos
    private static ContaPoupanca criarContaPoupanca(Scanner scanner) {
        System.out.print("Número: ");
        int numero = scanner.nextInt();
        System.out.print("Agência: ");
        int agencia = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Nome do titular: ");
        String nome = scanner.nextLine();
        System.out.print("CPF do titular: ");
        String cpfTitular = scanner.nextLine();
//        System.out.print("Saldo inicial: ");
//        double saldoInicial = scanner.nextDouble();
        System.out.print("Data de aniversário do titular: ");
        int aniversario = scanner.nextInt();

        return new ContaPoupanca(numero, agencia, nome, cpfTitular, aniversario);
    }

    // Método para exibir o menu
    private static void exibirMenu() {
        System.out.println("\n--- Menu ---");
        System.out.println("1. Exibir informações da conta corrente");
        System.out.println("2. Exibir informações da conta poupança");
        System.out.println("3. Realizar saque");
        System.out.println("4. Realizar depósito");
        System.out.println("5. Realizar transferência para conta poupança");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }
}

