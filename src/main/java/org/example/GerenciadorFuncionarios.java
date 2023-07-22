package org.example;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorFuncionarios {
    private final Map<String, Funcionario> db = new HashMap<>();

    public Funcionario adicionarFuncionario(Funcionario funcionario) throws Exception {
        validarFuncionario(funcionario);
        if (db.containsKey(funcionario.getId())) {
            throw new Exception("Funcionario já existe.");
        }
        db.put(funcionario.getId(), funcionario);
        return funcionario;
    }

    public Funcionario obterFuncionario(String id) throws Exception {
        if (!db.containsKey(id)) {
            throw new Exception("Funcionario não encontrado.");
        }
        return db.get(id);
    }

    public Funcionario atualizarFuncionario(Funcionario funcionario) throws Exception {
        validarFuncionario(funcionario);
        if (!db.containsKey(funcionario.getId())) {
            throw new Exception("Funcionario não encontrado.");
        }
        db.put(funcionario.getId(), funcionario);
        return funcionario;
    }

    public void excluirFuncionario(String id) throws Exception {
        if (!db.containsKey(id)) {
            throw new Exception("Funcionario não encontrado.");
        }
        db.remove(id);
    }

    private void validarFuncionario(Funcionario funcionario) throws Exception {
        if (funcionario.getId() == null || funcionario.getId().isEmpty()) {
            throw new Exception("O ID do funcionário é obrigatório.");
        }

        if (funcionario.getNome() == null || funcionario.getNome().isEmpty()) {
            throw new Exception("O nome do funcionário é obrigatório.");
        }

        if (funcionario.getSalario() <= 0) {
            throw new Exception("Todo funcionário deve ter um salário.");
        }

        if (funcionario.getDesignacao() == null || funcionario.getDesignacao().isEmpty()) {
            throw new Exception("A Designação do funcionário é obrigatório.");
        }

        if (funcionario.getNumeroTelefone() == null || funcionario.getNumeroTelefone().isEmpty()) {
            throw new Exception("O número de telefone do funcionário é obrigatório.");
        }

        // Validação do telefone com 11 dígitos usando uma expressão regular
        if (!funcionario.getNumeroTelefone().matches("\\d{11}") && (funcionario.getNumeroTelefone() == null || funcionario.getNumeroTelefone().isEmpty()) ) {
            throw new Exception("O número de telefone do funcionário é obrigatório e deve ter exatamente 11 dígitos numéricos.");
        }

        if (funcionario.getEndereco() == null || funcionario.getEndereco().isEmpty()) {
            throw new Exception("O endereço do funcionário é obrigatório.");
        }
    }
}