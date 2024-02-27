package br.com.web.na.vai;

import java.util.ArrayList;
import java.util.List;

// Classe para gerenciar as contas no banco
class Banco {
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void cadastrarConta(Conta conta) {
        contas.add(conta);
        System.out.println("Conta cadastrada com sucesso.");
    }
    
}
