package org.example;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Funcionario {
    private String id;
    private String nome;
    private String designacao;
    private double salario;
    private String numeroTelefone;
    private String endereco;

    @JsonCreator
    public Funcionario(@JsonProperty("id") String id,
                       @JsonProperty("nome") String nome,
                       @JsonProperty("designacao") String designacao,
                       @JsonProperty("salario") double salario,
                       @JsonProperty("numeroTelefone") String numeroTelefone,
                       @JsonProperty("endereco") String endereco) {
        this.id = id;
        this.nome = nome;
        this.designacao = designacao;
        this.salario = salario;
        this.numeroTelefone = numeroTelefone;
        this.endereco = endereco;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDesignacao() {
        return designacao;
    }

    public double getSalario() {
        return salario;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
