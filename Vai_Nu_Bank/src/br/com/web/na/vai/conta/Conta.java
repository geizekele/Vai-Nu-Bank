package br.com.web.na.vai.conta; 

public class Conta {

	private int numero;
    private int agencia;
    private String nome;
    private String cpf;
    protected double saldo; 

    public Conta(int numero, int agencia, String nome, String cpf) {
        this.numero = numero;
        this.agencia = agencia;
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 0.0;
    }

    // Métodos getters e setters
    public int getNumero() {
        return numero;
    }
    
	public void setNumero(int numero) {
		this.numero = numero;
	}

    public int getAgencia() {
        return agencia;
    }
    
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

    public String getNome() {
        return nome;
    }
    
	public void setNome(String nome) {
		this.nome = nome;
	}

    public String getCpf() {
        return cpf;
    }
    
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
    
    public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

    // Método para exibir informações da conta
    public void exibirInformacoes() {
        System.out.println("Número: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Titular: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Saldo: R$ " + saldo);
    }
    
    // Métodos bancários comuns
    public void realizarSaque(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    public void realizarDeposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }


}