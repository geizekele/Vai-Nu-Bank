package br.com.web.na.vai; 
import java.util.Scanner;

// Classe base para Conta
class Conta {
    private int numero;
    private int agencia;
    private String nomeTitular;
    private String cpf;
    protected double saldo; // Agora o saldo é comum a ambas as contas

    public Conta(int numero, int agencia, String nomeTitular, String cpf) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeTitular = nomeTitular;
        this.cpf = cpf;
        this.saldo = 0.0; // Inicializa o saldo como zero
    }

    // Métodos getters
    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public String getCpf() {
        return cpf;
    }

    // Método para exibir informações da conta
    public void exibirInformacoes() {
        System.out.println("Número: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Titular: " + nomeTitular);
        System.out.println("CPF: " + cpf);
        System.out.println("Saldo: R$ " + saldo);
    }
}