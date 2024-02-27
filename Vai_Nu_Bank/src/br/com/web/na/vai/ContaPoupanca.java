package br.com.web.na.vai;

// Classe específica para Conta Poupança
class ContaPoupanca extends Conta {
    private int aniversario;

    public ContaPoupanca(int numero, int agencia, String nome, String cpf, int aniversario) {
        super(numero, agencia, nome, cpf);
        this.aniversario = aniversario;
    }

    // Método getter específico para Conta Poupança
    public int getAniversario() {
        return aniversario;
    }

    // Método para exibir informações da conta poupança
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Aniversário da Conta: " + aniversario);
    }

    // Sobrescrevendo o método de saque para aplicar os juros
    @Override
    public void realizarSaque(double valor) {
        super.realizarSaque(valor);
        if (valor > 0) {
            double juros = valor * 0.02;
            saldo -= juros;
            System.out.println("Juros de R$ " + juros + " aplicados ao saque.");
        }
    }
}
