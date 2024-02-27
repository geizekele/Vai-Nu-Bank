package br.com.web.na.vai;

// Classe específica para Conta Corrente
class ContaCorrente extends Conta {
	private double limiteCredito;

	public ContaCorrente(int numero, int agencia, String nomeTitular, String cpf, double limiteCredito) {
		super(numero, agencia, nomeTitular, cpf);
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
