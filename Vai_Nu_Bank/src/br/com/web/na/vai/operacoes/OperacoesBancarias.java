package br.com.web.na.vai.operacoes;

import br.com.web.na.vai.conta.Conta;

public class OperacoesBancarias {
	
	//SAQUE
	public static void realizarSaque(Conta conta, double valor) {
        if (valor > 0 && valor <= conta.getSaldo()) {
            conta.setSaldo(conta.getSaldo() - valor);
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

	//DEPOSITO
    public static void realizarDeposito(Conta conta, double valor) {
        if (valor > 0) {
            conta.setSaldo(conta.getSaldo() + valor);
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    //TRANFERENCIA
    public static void realizarTransferencia(Conta conta, Conta destino, double valor) {
        if (valor > 0 && valor <= conta.getSaldo()) {
        	conta.setSaldo(conta.getSaldo() - valor);
            destino.setSaldo(destino.getSaldo() + valor);
            System.out.println("Transferência de R$ " + valor + " realizada com sucesso para a conta de "
                    + destino.getNome() + ".");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para transferência.");
        }
    }
}
