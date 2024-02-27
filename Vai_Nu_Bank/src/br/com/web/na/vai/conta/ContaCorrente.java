package br.com.web.na.vai.conta;

// Classe específica para Conta Corrente
public class ContaCorrente extends Conta {
	private double limiteCredito;

	public ContaCorrente(int numero, int agencia, String nome, String cpf, double limiteCredito) {
		super(numero, agencia, nome, cpf);
		this.limiteCredito = limiteCredito;
	}

	// Método getter específico para Conta Corrente
	public double getLimiteCredito() {
		return limiteCredito;
	}

	// Método para exibir informações da conta corrente
	@Override
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Limite de Crédito: R$ " + limiteCredito);
	}
}
